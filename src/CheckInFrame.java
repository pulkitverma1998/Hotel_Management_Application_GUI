
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
    protected static JTextArea textArea ;
    private JPanel pan ;

    CheckInFrame(){

        this.listing = new String[CheckMain.res.size()] ;

        for(int i = 0 ; i < CheckMain.res.size(); i++)
            this.listing[i] = CheckMain.res.get(i);

        ///////////Create Array of string here
        createComponents() ;
        this.setTitle("Guest Check-In");
        this.setSize(450, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    private void createComponents() {
        this.list = new JList<>(listing) ;

        this.checkInButton = new JButton("Check-In");
        this.cancelButton = new JButton("Cancel");

        ActionListener checkInListener = new CheckInListener() ;
        checkInButton.addActionListener(checkInListener );

        ActionListener cancelListener = new CancelListener() ;
        cancelButton.addActionListener(cancelListener);

        this.pan = new JPanel() ;
        this.pan.add(list);
        this.pan.add(checkInButton);
        this.pan.add(cancelButton);
        this.add(this.pan);

    }

    class CheckInListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent click) {
            Component b = (Component) click.getSource() ;

            CheckMain.checkedIn.add( listing[list.getSelectedIndex()]);
            CheckMain.res.remove(list.getSelectedIndex());
            JFrame c = (JFrame) SwingUtilities.getRoot(b);

            c.setVisible(false) ;

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