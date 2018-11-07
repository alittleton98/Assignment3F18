import java.io.*;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URL;

class Images{
    private static final String webSiteURL = "https://www.reddit.com/r/EarthPorn/comments/9t8r5o/massive_sunbeams_the_largest_ive_ever_seen/";
    private static final String folderPath = "C:/Users/Sammy/Desktop/School/COMP330/Assignment3F18";

    public static void main(String[] args){
        try{
            Document doc = Jsoup.connect(webSiteURL).get();
            Elements img = doc.getElementsByTag("img");
            for(Element el : img){// for each el, get source (src) url
                String src = el.absUrl("src"); 
                System.out.println("image found");
                getImages(src);
                }
            } catch(IOException ex){
                System.out.println("error.");
                Logger.getLogger(Images.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
    private static void getImages(String src) throws IOException{
        String folder = null;
        int indexName = src.lastIndexOf("/");// extract image name from src attribute
        
        if (indexName == src.length()){
            src = src.substring(1,indexName);
        }

        indexName = src.lastIndexOf("/");
        String name = src.substring(indexName,src.length());
        System.out.println(name);
        //must open stream for URL
        URL url = new URL(src);
        InputStream in = url.openStream();
        OutputStream out = new BufferedOutputStream(new FileOutputStream(folderPath + name));
        
        for(int b; (b = in.read()) != -1;){
            out.write(b);
        }
        out.close();
        in.close();

    } 
}
    