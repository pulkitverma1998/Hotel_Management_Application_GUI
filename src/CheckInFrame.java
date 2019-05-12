import java.util.ArrayList;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;



public class CheckInFrame extends JFrame{
    //instance variables
    private String[] listing ;
    private JButton checkInButton;
    private JButton cancelButton;
    private JList<String> list ;
    protected ArrayList<String> checkedIn ;

    protected static JTextArea textArea ;
    private JPanel p ;

    CheckInFrame(){
        listing = new String[5] ;
        listing[0] = "paul" ;
        listing[1] = "steve";
        listing[2] = "stephen";
        listing[3] = "james" ;
        //listing[4] = "blake";
        ///////////Create Array of string here
        createComponents() ;
        this.setTitle("Guest Check-In");
        this.setSize(450, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        listing = new String[5] ;
        listing[0] = "paul" ;
        listing[1] = "steve";
        listing[2] = "stephen";
        listing[3] = "james" ;
        //listing[4] = "blake";

    }
    private void createComponents() {
        this.list = new JList<>(listing) ;
        this.checkInButton = new JButton("Check-In");
        this.cancelButton = new JButton("Cancel");

        ActionListener checkInListener = new CheckInListener() ;
        checkInButton.addActionListener(checkInListener );

        ActionListener cancelListener = new CancelListener() ;
        cancelButton.addActionListener(cancelListener);

        p = new JPanel() ;
        p.add(list);
        p.add(checkInButton);
        p.add(cancelButton);
        this.add(p);

    }

    class CheckInListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent arg0) {


        }


    }

    class CancelListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent click) {

            Component b = (Component) click.getSource()  ;

            JFrame c = (JFrame) SwingUtilities.getRoot(b);

            c.setVisible(false);
        }


    }

}



