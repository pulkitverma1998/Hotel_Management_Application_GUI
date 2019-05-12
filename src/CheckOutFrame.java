
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class CheckOutFrame extends JFrame{
    private JButton checkOutButton;
    private JButton cancelButton;
    private String[] currentListing ;
    private JList<String> list ;
    private JPanel p ;

    CheckOutFrame(){
        this.currentListing = new String[CheckMain.checkedIn.size()];
        for(int i = 0 ; i < CheckMain.checkedIn.size(); i++ )
            this.currentListing[i] = CheckMain.checkedIn.get(i);

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

        this.p = new JPanel() ;
        this.p.add(list);
        this.p.add(checkOutButton);
        this.p.add(cancelButton);

        this.add(this.p);
    }
    class CheckOutListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent click) {
            Component b = (Component) click.getSource() ;

            CheckMain.checkedIn.remove( currentListing[list.getSelectedIndex()]);

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