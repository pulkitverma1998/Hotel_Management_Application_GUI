import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    protected DateSpinner newDateSpinner = new DateSpinner();
    protected TimeSpinner newTimeSpinner = new TimeSpinner();
    private String monthValue;
    private String dayValue;
    private String yearValue;
    private String hourValue;
    private String minuteValue;


    private JButton saveButton;
    private JButton cancelButton;

    private List<JCheckBox> cardBoxes = new ArrayList<>();
    private List<JCheckBox> contactBoxes = new ArrayList<>();
    private List<String> selectedCards = new ArrayList<>();
    private List<String> selectedContact = new ArrayList<>();

    ArrayList<String> aDates = new ArrayList<>();
    ArrayList<String> aTimes = new ArrayList<>();


    public NewReservationFrame(){
        createComponents("Default");
        this.setSize(1400, 200);
        this.setTitle("New Reservation");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public NewReservationFrame(String roomName){
        createComponents(roomName);
        this.setSize(1400, 200);
        this.setTitle("New Reservation");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void createComponents(String user){

        JPanel panel = new JPanel();
        String[] rooms = {"Small Party Room", "Medium Party Room", "Aqua World Room", "Karaoke Room", "Adult Billard Room"};
        String[] meals = {"Basic Meal Plan", "Bronze Meal Plan", "Silver Meal Plan", "Gold Meal Plan", "Platinum Meal Plan"};
        String[] tops = {"Cheese", "Pepperoni", "Ham", "Jalapeno", "Sausage", "Mushroom", "Pineapple", "Bell Pepper", "Onion", "Garlic Chicken"};
        String[] sodas = {"Coca-cola", "Diet Coke", "Canada Dry", "Orange Crush", "Squirt", "Root Beer"};
        String[] ices = {"Chocolate Fudge", "Vanilla Bean", "Strawberry Shortcake", "Choco-mint", "Butter Percan"};

        roomTypes = new JComboBox(rooms);
        if (user.equals("Medium Party Room")){
            roomTypes.setSelectedIndex(1);}

        else if (user.equals("Aqua Room")){
            roomTypes.setSelectedIndex(2);}

        else if (user.equals("Karaoke Room")){
            roomTypes.setSelectedIndex(3);}

        else if (user.equals("Adult Billard Room")){
            roomTypes.setSelectedIndex(4);}

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
        visa = new JCheckBox("visa");
        masterCard = new JCheckBox("master card");
        americanExpress = new JCheckBox("american express");
        cardBoxes.add(visa);
        cardBoxes.add(masterCard);
        cardBoxes.add(americanExpress);



        qContact = new JLabel("Would you like us to contact via text or phone?");
        qCEmail = new JLabel("Email: ");
        qCPhone = new JLabel("Phone: ");
        contactEmail = new JCheckBox();
        contactPhone = new JCheckBox();
        contactBoxes.add(contactEmail);
        contactBoxes.add(contactPhone);

        cancelButton = new JButton("Cancel");
        saveButton = new JButton("Save");


        ActionListener saveListener = new saveButtonListener();
        saveButton.addActionListener(saveListener);
        ActionListener cancelListener = new cancelButtonListener();
        cancelButton.addActionListener(cancelListener);

        panel.add(newDateSpinner);
        panel.add(newTimeSpinner);
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
        //panel.add(qVisa);
        panel.add(visa);
        //panel.add(qMC);
        panel.add(masterCard);
        //panel.add(qAE);
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
    class saveButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent click) {
            aDates.clear();
            aTimes.clear();

            monthValue = newDateSpinner.getTextField(newDateSpinner.aSpinner).getText();
            dayValue = newDateSpinner.getTextField(newDateSpinner.bSpinner).getText();
            yearValue = newDateSpinner.getTextField(newDateSpinner.cSpinner).getText();
            aDates.add(monthValue);
            aDates.add(dayValue);
            aDates.add(yearValue);
            hourValue = newTimeSpinner.getTextField(newTimeSpinner.aSpinner).getText();
            minuteValue = newTimeSpinner.getTextField(newTimeSpinner.bSpinner).getText();
            aTimes.add(hourValue);
            aTimes.add(minuteValue);

            Reservation aReservation = new Reservation((String) mealPlans.getSelectedItem(), aDates, aTimes);
            Guest aGuest = new Guest((String) name.getText(), (String) phone.getText(), (String) email.getText(), (String) cardName.getText(), (String) cardNum.getText(), cardSec.getText(), cardExp.getText(), aReservation);
            selectedCards.clear();
            for(int i = 0; i < cardBoxes.size(); i++){
                if(cardBoxes.get(i).isSelected()) {
                    aGuest.setTypeOfCard(cardBoxes.get(i).getText());
                }
            }
            selectedContact.clear();
            for(int i = 0; i < contactBoxes.size(); i++){
                if(contactBoxes.get(i).isSelected()) {
                    aGuest.setContact(contactBoxes.get(i).getText());
                }
            }
            System.out.println(aGuest.getCardName());
            System.out.println(aGuest.getaReservation().getDate());
            System.out.println(aGuest.getaReservation().getTime());
/*            dispose();
            boolean selectedTwo = heated.isSelected();
            PastryItem newPItem = new PastryItem(selected, (String)endFlavor.getSelectedItem(), selectedTwo);
            Main.setItemList(newPItem);
            ItemPurchaseFrame newIPF = new ItemPurchaseFrame(true, false);
            newIPF.setSize(450, 500);
            newIPF.settField();*/
        }
    }

  class cancelButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent click) {
            //new ItemPurchaseFrame(false, true);
            dispose();
            new MainFrame();
        }
    }

}
