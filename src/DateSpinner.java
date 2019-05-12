import javax.swing.*;
import java.awt.Color;
import java.awt.Container;
import java.util.Calendar;
import java.util.Date;

public class DateSpinner extends JPanel {
    protected JSpinner aSpinner;
    protected JSpinner bSpinner;
    protected JSpinner cSpinner;
    public DateSpinner(){
        String[] dateLabels = {"Month: ","Day: ", "Year: ", "Another Date: "};
        int dLength = dateLabels.length;
        Calendar calendar = Calendar.getInstance();
        JFormattedTextField aTextField = null;
        JFormattedTextField bTextField = null;
        //JFormattedTextField cTextField = null;

        //START MONTH SPINNER
        String[] aMonths = getMonthStrings(); // month's names
        //discrepancy, check back
        SpinnerListModel monthModel = new SpinnerListModel(aMonths);
        aSpinner = addLabeledSpinner(this, dateLabels[0], monthModel);
        //format spinner with more padding and aligned to the right of text field
        aTextField = getTextField(aSpinner);
        aTextField.setColumns(10);
        aTextField.setHorizontalAlignment(JTextField.RIGHT);

        //START DAY SPINNER
        SpinnerModel dayModel = new SpinnerNumberModel(0, //initial value
                0 - 31, //min
                0 + 31, //max
                1);                //step
        bSpinner = addLabeledSpinner(this, dateLabels[1], dayModel);

        bTextField = getTextField(bSpinner);
        bTextField.setColumns(10);
        bTextField.setHorizontalAlignment(JTextField.RIGHT);

        //START YEAR SPINNER
        int currentYear = calendar.get(Calendar.YEAR);
        SpinnerModel yearModel = new SpinnerNumberModel(currentYear, //initial value
                currentYear - 100, //min
                currentYear + 100, //max
                1);                //step
        cSpinner = addLabeledSpinner(this, dateLabels[2], yearModel);
        //Get rid of the comma for thousand's
        cSpinner.setEditor(new JSpinner.NumberEditor(cSpinner, "#"));

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

    /**
     * DateFormatSymbols returns an extra, empty value at the
     * end of the array of months.  Remove it.
     */
    static protected String[] getMonthStrings() {
        String[] months = new java.text.DateFormatSymbols().getMonths();
        int lastIndex = months.length - 1;

        if (months[lastIndex] == null
                || months[lastIndex].length() <= 0) { //last item empty
            String[] monthStrings = new String[lastIndex];
            System.arraycopy(months, 0,
                    monthStrings, 0, lastIndex);
            return monthStrings;
        } else { //last item not empty
            return months;
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

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    protected static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("SpinnerDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add content to the window.
        frame.add(new DateSpinner());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}