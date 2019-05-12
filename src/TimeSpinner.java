import javax.swing.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Container;
import java.util.Calendar;
import java.util.Date;

public class TimeSpinner extends JPanel {
    protected JSpinner aSpinner;
    protected JSpinner bSpinner;
    public TimeSpinner(){
        String[] dateLabels = {"Hour: ","Minute: "};
        int dLength = dateLabels.length;
        Calendar calendar = Calendar.getInstance();
        JFormattedTextField aTextField = null;
        JFormattedTextField bTextField = null;
        //JFormattedTextField cTextField = null;

        //START HOUR SPINNER
        SpinnerModel hourModel = new SpinnerNumberModel(0, //initial value
                0 - 24, //min
                0 + 24, //max
                1);
        aSpinner = addLabeledSpinner(this, dateLabels[0], hourModel);
        //format spinner with more padding and aligned to the right of text field
        aTextField = getTextField(aSpinner);
        aTextField.setColumns(10);
        aTextField.setHorizontalAlignment(JTextField.RIGHT);

        //START MINUTE SPINNER
        SpinnerModel minuteModel = new SpinnerNumberModel(0, //initial value
                0 - 59, //min
                0 + 59, //max
                1);                //step
        bSpinner = addLabeledSpinner(this, dateLabels[1], minuteModel);


        //END OF SPINNERS

    }
    /**
     * Return the formatted text field used by the editor, or
     * null if the editor doesn't descend from JSpinner.DefaultEditor.
     */
    public JFormattedTextField getTextField(JSpinner spinner) {
        JComponent editor = spinner.getEditor();
        if (editor instanceof JSpinner.DefaultEditor) {
            return ((JSpinner.DefaultEditor)editor).getTextField();
        } else {
            System.err.println("Unexpected editor type: "
                    + spinner.getEditor().getClass()
                    + " isn't a descendant of DefaultEditor");
            return null;
        }
    }

    static protected JSpinner addLabeledSpinner(Container c,
                                                String label,
                                                SpinnerModel model) {
        JLabel l = new JLabel(label);
        c.add(l);

        JSpinner spinner = new JSpinner(model);
        l.setLabelFor(spinner);
        c.add(spinner);

        return spinner;
    }
}
