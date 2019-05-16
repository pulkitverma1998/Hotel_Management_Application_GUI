import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 * Frame Class created to Display information of the guest that are ready to check-in
 */
public class CheckInFrame extends JFrame{
    //instance variables
    private String[] listing ;
    private JButton checkInButton;
    private JButton cancelButton;
    private JList<String> list ;
    protected static JTextArea textArea ;
    private JPanel pa ;

    /**
     * Constructor used to initialize the Check in Frame
     */
    public CheckInFrame(){

        this.listing = new String[CheckMainFrame.res.size()] ;

        for(int i = 0; i < CheckMainFrame.res.size(); i++)
            this.listing[i] = CheckMainFrame.res.get(i);

        ///////////Create Array of string here
        createComponents() ;
        this.setTitle("Guest Check-In");
        this.setSize(450, 450);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    /**
     * Method used to make the components of Check-In frame
     */
    private void createComponents() {
        this.list = new JList<>(listing) ;

        this.checkInButton = new JButton("Check-In");
        this.cancelButton = new JButton("Cancel");

        ActionListener checkInListener = new CheckInListener() ;
        checkInButton.addActionListener(checkInListener );

        ActionListener cancelListener = new CancelListener() ;
        cancelButton.addActionListener(cancelListener);

        this.pa = new JPanel() ;
        this.pa.add(list);
        this.pa.add(checkInButton);
        this.pa.add(cancelButton);
        this.add(this.pa);

    }

    /**
     * Inner class that is used to make the button "Check In" listener for the guest
     */
    class CheckInListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent click) {
            Component b = (Component) click.getSource() ;

            CheckMainFrame.checkedIn.add( listing[list.getSelectedIndex()]);
            CheckMainFrame.res.remove(list.getSelectedIndex());
            JFrame c = (JFrame) SwingUtilities.getRoot(b);

            c.setVisible(false) ;


        }
    }

    /**
     * Inner class made to delete the frame and go back to the previous frame when the "Cancel" button is pressed
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
            new CheckMainFrame();
        }
    }
}