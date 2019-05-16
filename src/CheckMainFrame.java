
import java.util.ArrayList;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * Class made to have all the check- in and check-out information for guests.
 */
class CheckMainFrame extends JFrame{
    //instance variables
    //protected static ArrayList<String> res ;
    protected static ArrayList<String> checkedIn ; ////////Working on this part
    private JButton checkInButton;
    private JButton checkOutButton;
    private JButton cancelButton;
    private JPanel p ;

    /**
     * Constructor to make the frame
     */
    public CheckMainFrame(){
        //this.res = new ArrayList<String> () ;
        //this.checkedIn = new ArrayList<String> () ;
        //this.res.add("Joe");
        //this.res.add("Paul");
        //this.res.add("Angie" );

        createComponents() ;
        this.setTitle("Guest Check In/Out Menu");
        this.setSize(450, 100);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    /**
     * Method to create components of this Check-In and Check-Out Main Frame
     */
    private void createComponents() {
        this.checkInButton = new JButton("Check-In");
        this.checkOutButton = new JButton("Check-Out");
        this.cancelButton = new JButton("Cancel");

        ActionListener checkInListener = new CheckInListener() ;
        checkInButton.addActionListener(checkInListener );

        ActionListener checkOutListener = new CheckOutListener() ;
        checkOutButton.addActionListener( checkOutListener );

        ActionListener cancelListener = new CancelListener() ;
        cancelButton.addActionListener(cancelListener);

        this.p = new JPanel() ;
        this.p.add(checkInButton);
        this.p.add(checkOutButton) ;
        this.p.add(cancelButton);
        this.add(this.p);

    }

    /**
     * Inner class that is made to make the check-In frame when the user presses that button
     */
    class CheckInListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent click) {
           // setVisible(false);
            CheckInFrame checkInFrame = new CheckInFrame() ;

            checkInFrame.setVisible(true);

            checkInFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
    }
    /**
     * Inner class that is made to make the check-Out frame when the user presses that button
     */
    class CheckOutListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent click) {
            //setVisible(false);
            CheckOutFrame checkOutFrame = new CheckOutFrame() ;

            checkOutFrame.setVisible(true);

            checkOutFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
    }
    /**
     * Inner class that is made to go back when user presses that button
     */
    class CancelListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent click) {

//            Component b = (Component) click.getSource()  ;
//
//            JFrame c = (JFrame) SwingUtilities.getRoot(b);
//
//            c.setVisible(false);
            dispose();
            new MainFrame();
        }
    }
}

