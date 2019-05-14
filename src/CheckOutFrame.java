import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;

public class CheckOutFrame extends JFrame{
    private JButton checkOutButton;
    private JButton cancelButton;
    private String[] currentListing ;
    private JList<String> list ;
    private JPanel pan ;
    private JLabel label ;
    protected static int checkingOutIndex ;

    public CheckOutFrame(){
        checkingOutIndex = 0 ;
        this.label = new JLabel("Current Check-Ins");
        this.currentListing = new String[CheckMainFrame.checkedIn.size()];
        for(int i = 0; i < CheckMainFrame.checkedIn.size(); i++ )
            this.currentListing[i] = CheckMainFrame.checkedIn.get(i);

        createComponents() ;
        this.setTitle("Check-Out Frame");
        this.setSize(450, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void createComponents() {
        this.list = new JList<>(currentListing) ;
        this.checkOutButton = new JButton("Guest Check-Out");
        this.cancelButton = new JButton("Cancel");

        ActionListener checkOutListener = new CheckOutListener() ;
        checkOutButton.addActionListener(checkOutListener );

        ActionListener cancelListener = new CancelListener() ;
        cancelButton.addActionListener(cancelListener);

        this.pan = new JPanel() ;
        this.pan.add(label);
        this.pan.add(list);
        this.pan.add(checkOutButton);
        this.pan.add(cancelButton);

        this.add(this.pan);
    }
    class CheckOutListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent click) {

            Component b = (Component) click.getSource() ;

            checkingOutIndex =  list.getSelectedIndex();

            FinalizeFrame finalizeFrame = new FinalizeFrame() ;
            finalizeFrame.setVisible(true);
            finalizeFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

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