import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class GUI extends JFrame{

    JPanel p=new JPanel();
    JLabel b=new JLabel("Please Paste a Reddit URL Bellow");
    JTextField t=new JTextField("",45);

    JLabel l=new JLabel("Choose a save location");
    String choices[] = {
            "Downloads",
            "Desktop",
            "Documents",
            "User Root"
    };
    JComboBox cb = new JComboBox(choices);

    JButton r=new JButton("Begin Image Scrape");
    
    public static void main(String[] args){
        new GUI();
    }

    public GUI(){
        super("Reddit Image Scraper");
        setSize(600,600);
        setResizable(true);
        p.add(b);
        p.add(t);
        p.add(cb);
        p.add(l);
        p.add(r);
        add(p);
        setVisible(true);
    }
}
