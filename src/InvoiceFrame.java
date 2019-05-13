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

public class InvoiceFrame extends JFrame{
    private JButton exitButton ;
    private JLabel label ;
    private JPanel panel ;
    private JScrollPane scrollPane ;
    private JTextArea textArea ;

    public InvoiceFrame(){
        createComponents();
        this.setTitle("Guest Invoice");
        this.setSize(450, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void createComponents() {
        this.panel = new JPanel() ;
        label = new JLabel("Invoice:");
        textArea = new JTextArea(30,39);
        textArea.setText(FinalizeFrame.invoice);
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
