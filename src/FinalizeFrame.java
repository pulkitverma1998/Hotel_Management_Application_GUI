
import java.util.ArrayList;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class FinalizeFrame extends JFrame{
    protected static String invoice ;
    private JLabel damagesLabel ;
    private JLabel descriptionLabel ;
    private JButton finalizeButton ;
    private JButton cancelButton ;
    private JPanel panell ;
    final private int FIELD_WIDTH = 25 ;
    final private JTextField damagesField = new JTextField(FIELD_WIDTH);
    final private JTextField descriptionField = new JTextField(FIELD_WIDTH) ;


    public FinalizeFrame(){
        createComponents() ;
        this.setTitle("Finalize");
        this.setSize(450, 150);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void createComponents() {
        this.invoice = "Invoice: " ;
        this.damagesLabel = new JLabel("Enter Damages: $");
        this.descriptionLabel = new JLabel("Type of Damages:");
        this.finalizeButton = new JButton("Finalize");
        this.cancelButton = new JButton("Cancel");

        ActionListener finalizeListener = new FinalizeListener() ;
        finalizeButton.addActionListener(finalizeListener);

        ActionListener cancelListener = new CancelListener() ;
        cancelButton.addActionListener(cancelListener);

        this.panell = new JPanel() ;
        this.panell.add(damagesLabel);
        this.panell.add(damagesField);
        this.panell.add(descriptionLabel);
        this.panell.add(descriptionField);
        this.panell.add(finalizeButton);
        this.panell.add(cancelButton);
        this.add(this.panell);

    }
    class FinalizeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent click) {

            Component b = (Component) click.getSource() ;

            //IMPLEMENTED A DAMAGE COST HERE. THIS SHOULD BE ADDED TO THE TOTAL COST AFTER
            double damageCost = Double.parseDouble(damagesField.getText());
            invoice =  "Damage cost: " + (String)damagesField.getText()
                    + "\nTypes of Damages: " + descriptionField.getText() ;

            CheckMain.checkedIn.remove( CheckOutFrame.checkingOutIndex );

            InvoiceFrame invoiceFrame = new InvoiceFrame() ;
            invoiceFrame.setVisible(true);
            invoiceFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

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