
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class CheckOutFrame extends JFrame{
    private JButton checkOutButton;
    private JButton cancelButton;

    private JPanel p ;

    CheckOutFrame(){
        createComponents() ;
        this.setTitle("Check-Out Frame");
        this.setSize(450, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void createComponents() {
        this.checkOutButton = new JButton("Guest Check-Out");
        this.cancelButton = new JButton("Cancel");


        ActionListener checkOutListener = new CheckOutListener() ;
        checkOutButton.addActionListener(checkOutListener );

        ActionListener cancelListener = new CancelListener() ;
        cancelButton.addActionListener(cancelListener);

        p = new JPanel() ;
        p.add(checkOutButton);
        p.add(cancelButton);
        this.add(p);
    }
    class CheckOutListener implements ActionListener
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
