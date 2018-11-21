import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;


class GUI extends JFrame{
    String webSiteURL;
    String folderPath;
    JPanel panel=new JPanel();
    JLabel instruction=new JLabel("Please Paste a Reddit URL Below");
    JTextField textEntry=new JTextField("",45);

    JLabel saveLocation=new JLabel("Save location:");
    String choices[] = {
            "Downloads",
            "Desktop",
            "Documents",
            "Pictures",
            "Root",
    };

    public JComboBox choicesButton = new JComboBox(choices);
    public JButton beginButton=new JButton("Begin Image Scrape");
    public JButton clearButton = new JButton("Clear");
    public JButton exit = new JButton("Exit");

    public static void main(String[] args){
        new GUI();
    }

    public GUI(){
        super("Reddit Image Scraper");
        setSize(625,600);
        setResizable(true);
        panel.add(instruction);
        panel.add(textEntry);
        panel.add(saveLocation);
        panel.add(choicesButton);
        panel.add(beginButton);
        panel.add(clearButton);
        panel.add(exit);
        add(panel);
        setVisible(true);
        //CLEAR URL BAR
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                textEntry.setText("");
            }
        });
        //BEGIN SCRAPE
        beginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                webSiteURL = textEntry.getText();
                Images I = new Images();
                I.main(webSiteURL, folderPath);
            }
        });
        //EXIT PROGRAM
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        //DIRECTORY CHOICES
        choicesButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                JComboBox cb = (JComboBox) e.getSource();
                String choices = (String) cb.getSelectedItem();
                if ((choices).equals("Downloads")) {
                    folderPath = System.getProperty("user.home")+"/Downloads/";
                    System.out.println(folderPath);
                }

                if ((choices).equals("Desktop")) {
                    folderPath = System.getProperty("user.home")+"/Desktop/";
                    System.out.println(folderPath);
                }

                if ((choices).equals("Documents")) {
                    folderPath = System.getProperty("user.home")+"/Documents/";
                    System.out.println(folderPath);
                }
                if ((choices).equals("Pictures")) {
                    folderPath = System.getProperty("user.home")+"/Pictures/";
                    System.out.println(folderPath);
                }
                if ((choices).equals("Root")) {
                    folderPath = System.getProperty("user.home")+"/Root/";
                    System.out.println(folderPath);
                }
            }
        });
    }
}
