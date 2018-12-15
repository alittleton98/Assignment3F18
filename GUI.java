import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI extends JFrame{
    String webSiteURL;
    String folderPath;
    JPanel panel=new JPanel();

    JLabel instruction=new JLabel("Please Paste a Reddit URL Below");
    JTextField textEntry=new JTextField("",45);
    //ADD CHOICES TO DROPDOWN
    JLabel saveLocation=new JLabel("Save location:");
    String choices[] = {
            "Choose Location",
            "Downloads",
            "Desktop",
            "Documents",
            "Pictures",
            "Root",
    };
    //ADD BUTTONS
    public JComboBox choicesButton = new JComboBox(choices);
    public JButton beginButton=new JButton("Begin Image Scrape");
    public JButton clearButton = new JButton("Clear");
    public JButton exit = new JButton("Exit");
    //INIT GUI
    public static void main(String[] args){
        new GUI();
    }
    //CREATE GUI
    public GUI(){
        super("GitPic");
        setSize(625,300);
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
        clearButton.addActionListener(new ActionListener() {// add event listener to clearButton
            @Override
            public void actionPerformed(ActionEvent e){
                textEntry.setText(""); //clear text field
            }
        });
        //BEGIN SCRAPE
        beginButton.addActionListener(new ActionListener() {// add event listener to beginButton
            @Override
            public void actionPerformed(ActionEvent e){
                webSiteURL = textEntry.getText();
                Images I = new Images();
                I.main(webSiteURL, folderPath);//pass webSiteURL, folderPath to Images.java, let Images.java do the rest
            }
        });
        //EXIT PROGRAM
        exit.addActionListener(new ActionListener() {//add event listener to exit
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);//close
            }
        });
        //DIRECTORY CHOICES
        choicesButton.addActionListener(new ActionListener(){// add event listener to choicesButton
            public void actionPerformed(ActionEvent e) {
                //fetch user choice from drop down
                JComboBox cb = (JComboBox) e.getSource(); 
                String choices = (String) cb.getSelectedItem(); //set choices equal to selected item in JComboBox cb... Updates live!
                if ((choices).equals("Downloads")) { // if choice is downloads, get downloads location and set as folderPath
                    folderPath = System.getProperty("user.home")+"/Downloads/";
                    System.out.println(folderPath);
                }

                if ((choices).equals("Desktop")) {// if choice is desktop, get desktop location and set as folderPath
                    folderPath = System.getProperty("user.home")+"/Desktop/";
                    System.out.println(folderPath);
                }

                if ((choices).equals("Documents")) {// if choice is documents, get documents location and set as folderPath
                    folderPath = System.getProperty("user.home")+"/Documents/";
                    System.out.println(folderPath);
                }
                if ((choices).equals("Pictures")) {// if choice is pictures, get pictures location and set as folderPath
                    folderPath = System.getProperty("user.home")+"/Pictures/";
                    System.out.println(folderPath);
                }
                if ((choices).equals("Root")) {// if choice is root, get root location and set as folderPath
                    folderPath = System.getProperty("user.home")+"/";
                    System.out.println(folderPath);
                }
            }
        });

    }
}
//     EXAMPLE REDDIT URL https://www.reddit.com/r/pics/comments/a1sbka/a_sensational_sunset/
