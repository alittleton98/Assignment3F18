import java.io.*;//for website
import java.net.URL;//retrieve url
import java.util.logging.Level;//log errors
import java.util.logging.Logger;
import java.io.*; //I/O stream
import java.util.logging.Level;
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
import java.net.URL;

class Images{

    //private static String webSiteURL = "https://www.reddit.com/r/pics/comments/9ytwct/photo_of_the_day/"; //original source to scrap from-- TODO: Create UI to have an entry field that stores into this variable
    //private static String folderPath = System.getProperty("user.home")+"/Downloads/"; //finds the users local downloads folder TODO: create a UI to store the folder path in this location
    // private because when you try to use these in an OutPutStream, they must be static... might make problems if we want to change the URL?
    public static void main(String webSiteURL, String folderPath){
        try{

            Document doc = Jsoup.connect(webSiteURL).get(); //connects to website and makes it a document (basically a file)
            Elements className = doc.getElementsByTag("img"); //finds all elements in the new doc that match the "img" tag

            for(Element el : className){// for each element, get source (src) url
                String src = el.absUrl("src"); //gets the "absolute" URL of the SRC, AKA the online host of the picture

                if(el.hasClass("_2_tDEnGMLxpM6uOa2kaDB3")){//if the img has class "_2_tDEnGMLxpM6uOa2kaDB3" it is the post-content section. This is exclusive to reddit's CSS
                    System.out.println("image found");//prints when image is found
                    getImages(src, folderPath); //calls getImage method with the SRC as the source for the picture for us to obtain
                    }

                }

            } catch(IOException ex){ //if no pic is found, throw exception and log it as severe failure
                System.out.println("error.");
                Logger.getLogger(Images.class.getName()).log(Level.SEVERE,null,ex);
            }

        }
        public static void path (String choice){
            choice = System.getProperty("user.home");
        }
    private static void getImages(String src, String folderPath) throws IOException{
        int indexName = src.lastIndexOf("/");// extract image name from src attribute EX: https://www.youtube.com/ <-- will stop at last forward slash and get the index of the last "/"
        //System.out.println(indexName);
        if (indexName == src.length()){
            src = src.substring(1,indexName);//creates string from start of URL to end
        }

        indexName = src.lastIndexOf("/");
        //System.out.println(indexName);
        String name = src.substring(indexName);//creates string from / (beginning) to the end of the string's length
        //must open stream for URL
        URL url = new URL(src); //creates new URL
        long size  = url.openConnection().getContentLength();//
        System.out.println(name + " " + size);
        InputStream in = url.openStream(); //reads the bytes from our stream (website)
        // The openStream() method returns a java.io.InputStream object, so reading from a URL is as easy as reading from an input stream. (from java documentation https://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html)
        OutputStream out = new BufferedOutputStream(new FileOutputStream(folderPath + name + ".jpg")); // bufferedoutputstream allows us to write to the computer without calling the underlying system byte-per-byte
        
        for(int b; (b = in.read()) != -1;){ // for all pictures, write them to output file
            out.write(b); // writes to folder path
        }
        try {
            BufferedImage img = ImageIO.read(new File(folderPath + name + ".jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.close(); //close Streams to avoid memory leaks
        in.close();
    }

}
    
