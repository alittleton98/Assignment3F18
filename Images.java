import java.io.*;//for website
import java.net.URL;//retrieve url
import java.util.logging.Level;//log errors
import java.util.logging.Logger;
import org.jsoup.Jsoup;//web scraper
import org.jsoup.nodes.Document;//document is basically the website made into a readable file of html
import org.jsoup.nodes.Element;//elements within the document, like pics or sources
import org.jsoup.select.Elements;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class Images{
    public static void main(String webSiteURL, String folderPath){
        try{
            //connects to website and makes it a document (basically a file)
            Document doc = Jsoup.connect(webSiteURL).get();
            //finds all elements in the new doc that match the "img" tag
            Elements className = doc.getElementsByTag("img");
            String title = doc.title();
            // for each element, get source (src) url
            for(Element el : className){
                //gets the "absolute" URL of the SRC, AKA the online host of the picture
                String src = el.absUrl("src");
                //if the img has class "_2_tDEnGMLxpM6uOa2kaDB3" it is the post-content section. This is exclusive to reddit's CSS
                //prints when image is found
                //calls getImage method with the SRC as the source for the picture for us to obtain
                if(el.hasClass("_2_tDEnGMLxpM6uOa2kaDB3")){
                    System.out.println("image found");
                    getImages(src, folderPath, title);
                }
            }
        }
        //if no pic is found, throw exception and log it as severe failure
        catch(IOException ex){
            System.out.println("error.");
            Logger.getLogger(Images.class.getName()).log(Level.SEVERE,null,ex);
        }

    }
    public static void path (String choice){
        choice = System.getProperty("user.home");
    }
    private static void getImages(String src, String folderPath, String title) throws IOException{
        // extract image name from src attribute EX: https://www.youtube.com/
        // will stop at last forward slash and get the index of the last "/"
        int indexName = src.lastIndexOf("/");
        if (indexName == src.length()){
            //creates string from start of URL to end
            src = src.substring(1,indexName);//creates string from start of URL to end
        }
        indexName = src.lastIndexOf("/");
        //creates string from / (beginning) to the end of the string's length
        String name = src.substring(indexName);

        //Removes the subreddit and unneeded characters from title
        String newTitle = title.substring(0, title.indexOf(" :"));

        //Determines if image is JPG or PNG
        if (name.contains("jpg")){
            name = newTitle + ".jpg";
        }
        else if (name.contains("png")){
            name = newTitle + ".png";
        }
        else{}

        //must open stream for URL
        URL url = new URL(src); //creates new URL

        //Finds image file size
        long size  = url.openConnection().getContentLength();//

        //reads the bytes from our stream (website)
        InputStream in = url.openStream();
        // The openStream() method returns a java.io.InputStream object, so reading from a URL is as easy as reading from an input stream.
        // (from java documentation https://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html)
        // bufferedoutputstream allows us to write to the computer without calling the underlying system byte-per-byte
        OutputStream out = new BufferedOutputStream(new FileOutputStream(folderPath + name));
        byte[] b = new byte[20480];
        int length;
        while ((length = in.read(b)) != -1) {
            //writing it to a file
            out.write(b, 0, length) ;
        }
        //Opens new window and displays downloaded image
        try {
            System.out.println(name + " " + "[" + size + "KBs" + "]");
            BufferedImage img = ImageIO.read(new File(folderPath + name));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //close Streams to avoid memory leaks
        out.close();
        in.close();
    }
}
// EXAMPLE REDDIT URL https://www.reddit.com/r/pics/comments/a1sbka/a_sensational_sunset/
