import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class NewReservationFrame extends JFrame {
    private JLabel qName;
    private JTextField name;

    private JLabel qPhone;
    private JTextField phone;

    private JLabel qAddress;
    private JTextField address;

    private JLabel qDob;
    private JTextField dob;

    private JLabel qEmail;
    private JTextField email;

    private JLabel qCardName;
    private JTextField cardName;

    private JLabel qCardNu;
    private JTextField cardNum;

    private JLabel qCardSec;
    private JTextField cardSec;

    private JLabel qCardExp;
    private JTextField cardExp;

    private JLabel qTypeCard;
    private JLabel qVisa;
    private JCheckBox visa;
    private JLabel qMC;
    private JCheckBox masterCard;
    private JLabel qAE;
    private JCheckBox americanExpress;

    private JLabel qContact;
    private JLabel qCPhone;
    private JLabel qCEmail;
    private JCheckBox contactPhone;
    private JCheckBox contactEmail;

    private JComboBox roomTypes;
    private JComboBox mealPlans;
    private JComboBox toppingsPizza;
    private JComboBox sodaChoices;
    private JComboBox iceCream;

    private JButton saveButton;
    private JButton cancelButton;

    public NewReservationFrame(){
        createComponents();
        this.setSize(1400, 200);
        this.setTitle("New Reservation");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void createComponents(){
        JPanel panel = new JPanel();
        String[] rooms = {"Small Party Room", "Medium Party Room", "Aqua World Room", "Karaoke Room", "Adult Billard Room"};
        String[] meals = {"Basic Meal Plan", "Bronze Meal Plan", "Silver Meal Plan", "Gold Meal Plan", "Platinum Meal Plan"};
        String[] tops = {"Cheese", "Pepperoni", "Ham", "Jalapeno", "Sausage", "Mushroom", "Pineapple", "Bell Pepper", "Onion", "Garlic Chicken"};
        String[] sodas = {"Coca-cola", "Diet Coke", "Canada Dry", "Orange Crush", "Squirt", "Root Beer"};
        String[] ices = {"Chocolate Fudge", "Vanilla Bean", "Strawberry Shortcake", "Choco-mint", "Butter Percan"};

        roomTypes = new JComboBox(rooms);
        mealPlans = new JComboBox(meals);
        toppingsPizza = new JComboBox(tops);
        sodaChoices = new JComboBox(sodas);
        iceCream = new JComboBox(ices);


        qName = new JLabel("Name: ");
        name = new JTextField("",10);
        qPhone = new JLabel("Phone: ");
        phone = new JTextField("",10);
        qAddress = new JLabel("Address: ");
        address = new JTextField("",10);
        qDob = new JLabel("Day of Birth: ");
        dob = new JTextField("",10);
        qEmail = new JLabel("Email: ");
        email = new JTextField("",20);

        qCardName = new JLabel("Credit card name: ");
        cardName = new JTextField("",10);
        qCardNu = new JLabel("Enter card #: ");
        cardNum = new JTextField("",10);
        qCardSec = new JLabel ("Enter security digits: ");
        cardSec = new JTextField("",10);
        qCardExp = new JLabel("Enter Expiration date:" );
        cardExp = new JTextField("",10);
        qTypeCard = new JLabel("Select your type of card: ");
        qVisa = new JLabel("visa");
        visa = new JCheckBox();
        qMC =  new JLabel("master card");
        masterCard = new JCheckBox();
        qAE = new JLabel("american express");
        americanExpress = new JCheckBox();


        qContact = new JLabel("Would you like us to contact via text or phone?");
        qCEmail = new JLabel("Email: ");
        qCPhone = new JLabel("Phone: ");
        contactEmail = new JCheckBox();
        contactPhone = new JCheckBox();


        cancelButton = new JButton("Cancel");
        saveButton = new JButton("Save");

        DateSpinner newDateSpinner = new DateSpinner();

    /*    ActionListener saveListener = new saveButtonListener();
        saveButton.addActionListener(saveListener);
        ActionListener cancelListener = new cancelButtonListener();
        cancelButton.addActionListener(cancelListener);*/

        panel.add(newDateSpinner);
        panel.add(roomTypes);
        panel.add(mealPlans);
        panel.add(toppingsPizza);
        panel.add(sodaChoices);
        panel.add(iceCream);
        panel.add(qName);
        panel.add(name);
        panel.add(qPhone);
        panel.add(phone);
        panel.add(qAddress);
        panel.add(address);
        panel.add(qDob);
        panel.add(dob);
        panel.add(qEmail);
        panel.add(email);
        panel.add(qCardName);
        panel.add(cardName);
        panel.add(qCardNu);
        panel.add(cardNum);
        panel.add(qCardSec);
        panel.add(cardSec);
        panel.add(qCardExp);
        panel.add(cardExp);
        panel.add(qTypeCard);
        panel.add(qVisa);
        panel.add(visa);
        panel.add(qMC);
        panel.add(masterCard);
        panel.add(qAE);
        panel.add(americanExpress);
        panel.add(qContact);
        panel.add(qCEmail);
        panel.add(qCPhone);
        panel.add(contactEmail);
        panel.add(contactPhone);
        panel.add(cancelButton);
        panel.add(saveButton);
        this.add(panel);
    }
/*
    class saveButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent click) {
            dispose();
            boolean selectedTwo = heated.isSelected();
            PastryItem newPItem = new PastryItem(selected, (String)endFlavor.getSelectedItem(), selectedTwo);
            Main.setItemList(newPItem);
            ItemPurchaseFrame newIPF = new ItemPurchaseFrame(true, false);
            newIPF.setSize(450, 500);
            newIPF.settField();
        }
    }

    class cancelButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent click) {
            new ItemPurchaseFrame(false, true);
            dispose();
        }
    }
*/

}
