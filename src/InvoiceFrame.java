import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 * Frame class for the GUI of the Invoice that contains all the purchases
 */
public class InvoiceFrame extends JFrame{
    private JButton exitButton ;
    private JLabel label ;
    private JPanel panel ;
    private JScrollPane scrollPane ;
    private JTextArea textArea ;

    /**
     * Constructor to initialize the frame
     */
    public InvoiceFrame(){
        createComponents();
        this.setTitle("Guest Invoice");
        this.setSize(450, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Method to create the components of the invoice frame
     */
    public void createComponents() {
        this.panel = new JPanel() ;
        label = new JLabel("Invoice:");
        textArea = new JTextArea(30,35);
        textArea.setText(FinalizeFrame.invoice); //invoice is a string that is passed from Finalize Frame.
        textArea.setEditable(false);
        exitButton = new JButton("Exit");
        scrollPane = new JScrollPane(textArea);

        ActionListener exitListener = new ExitListener() ;
        exitButton.addActionListener(exitListener);

        panel.add(label);
        panel.add(scrollPane);
        panel.add(exitButton);
        this.add(panel);
    }

    /**
     * Inner class to implement the Listener for the Exit Button
     */
    class ExitListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent click) {
            Component b = (Component) click.getSource()  ;

            JFrame c = (JFrame) SwingUtilities.getRoot(b);

            c.setVisible(false);

        }

    }

}
