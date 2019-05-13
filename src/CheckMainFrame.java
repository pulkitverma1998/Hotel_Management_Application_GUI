
import java.util.ArrayList;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class CheckMain extends JFrame{
    //instance variables
    protected static ArrayList<String> res ;
    protected static ArrayList<String> checkedIn ; ////////Working on this part
    private JButton checkInButton;
    private JButton checkOutButton;
    private JButton cancelButton;
    private JPanel p ;

    public CheckMain(){
        this.res = new ArrayList<String> () ;
        this.checkedIn = new ArrayList<String> () ;
        this.res.add("Joe");
        this.res.add("Paul");
        this.res.add("Angie" );

        createComponents() ;
        this.setTitle("Guest Check In/Out Menu");
        this.setSize(450, 100);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
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

    class CheckInListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent click) {
            CheckInFrame checkInFrame = new CheckInFrame() ;

            checkInFrame.setVisible(true);

            checkInFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
    }

    class CheckOutListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent click) {
            CheckOutFrame checkOutFrame = new CheckOutFrame() ;

            checkOutFrame.setVisible(true);

            checkOutFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
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

