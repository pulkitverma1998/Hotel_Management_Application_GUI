import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class EditReservationFrame extends JFrame {

    private JPanel panel;

    private JLabel name;
    private JLabel phone;
    private JLabel email;
    private JLabel address;
    private JLabel creditCardName;
    private JLabel creditCardNumber;
    private JLabel creditCardSecurityDigit;
    private JLabel creditCardExpDate;
    private JLabel creditCardTypeLabel;
    private JLabel roomNameLabel;
    private JLabel reservationCancel;

    private JTextField nameTextField;
    private JTextField phoneTextField;
    private JTextField emailTextField;
    private JTextField addressTextField;
    private JTextField creditCardNameTextField;
    private JTextField creditCardNumberTextField;
    private JTextField creditCardSecurityDigitTextField;
    private JTextField creditCardExpDateTextField;

    private JButton addGuestButton;
    private JButton addUpgradeButton;
    private JButton deleteButton;

    private JComboBox creditCardType;
    private JComboBox roomTypes;
    private JComboBox upgradeType;
    private JComboBox specificUpgrade;
    private JComboBox toppings;
    private JComboBox sodaFlavors;

    private DateSpinner newDateSpinner;
    private TimeSpinner newTimeSpinner;

    ArrayList<Guest> guests = new ArrayList<>();
    ArrayList<RoomUpgrades> roomUpgrades = new ArrayList<>();

    public void createComponents() {
        panel = new JPanel();
        name = new JLabel("Name: ");
        nameTextField = new JTextField(10);
        phone = new JLabel("Phone Number: ");
        phoneTextField = new JTextField(10);
        email = new JLabel("Email Address");
        emailTextField = new JTextField(10);
        address = new JLabel("Home Address: ");
        addressTextField = new JTextField(10);
        creditCardName = new JLabel("Credit Card Name: ");
        creditCardNameTextField = new JTextField(10);
        creditCardNumber = new JLabel("Credit Card #: ");
        creditCardNumberTextField = new JTextField(10);
        creditCardSecurityDigit = new JLabel("Security Digits: ");
        creditCardSecurityDigitTextField = new JTextField(10);
        creditCardExpDate = new JLabel("Expiration Date: ");
        creditCardExpDateTextField = new JTextField(10);
        creditCardTypeLabel = new JLabel("Select Credit Card Type: ");
        String[] cardTypes = {"Visa", "Master Card", "American Express"};
        creditCardType = new JComboBox(cardTypes);
        roomNameLabel = new JLabel("Select Room");
        String[] room_types = {"Small Party Room", "Medium Party Room", "Aqua World Room", "Karaoke Room", "Adult Billiard Room"};
        roomTypes = new JComboBox(room_types);
        newDateSpinner = new DateSpinner();
        newTimeSpinner = new TimeSpinner();
        addGuestButton = new JButton("Save");
        deleteButton = new JButton("Cancel Reservation");

        this.add(panel);
        panel.add(name);
        panel.add(nameTextField);
        panel.add(phone);
        panel.add(phoneTextField);
        panel.add(email);
        panel.add(emailTextField);
        panel.add(address);
        panel.add(addressTextField);
        panel.add(creditCardName);
        panel.add(creditCardNameTextField);
        panel.add(creditCardNumber);
        panel.add(creditCardNumberTextField);
        panel.add(creditCardSecurityDigit);
        panel.add(creditCardSecurityDigitTextField);
        panel.add(creditCardExpDate);
        panel.add(creditCardExpDateTextField);
        panel.add(creditCardTypeLabel);
        panel.add(creditCardType);
        panel.add(roomNameLabel);
        panel.add(roomTypes);
        createUpgradeTypeComboBox(panel);
        createSpecificUpgradeComboBox(panel);
        panel.add(newDateSpinner);
        panel.add(newTimeSpinner);
        panel.add(addGuestButton);
        ActionListener addGuestActionListener = new addGuestButtonListener();
        addGuestButton.addActionListener(addGuestActionListener);
        panel.add(deleteButton);
        ActionListener cancel = new cancelReservation();
        deleteButton.addActionListener(cancel);

    }

    public void createUpgradeTypeComboBox(JPanel panel) {
        String[] selectRoom = {"Select Room"};
        String[] selectToppings = {"Select Toppings"};
        String[] selectSoda = {"Select Soda Flavor"};
        ActionListener roomTypeListener = new roomTypeListener();
        roomTypes.addActionListener(roomTypeListener);
        upgradeType = new JComboBox(selectRoom);
        toppings = new JComboBox(selectToppings);
        sodaFlavors = new JComboBox(selectSoda);
        addUpgradeButton = new JButton("Add Upgrade");
        ActionListener addUpgradeButtonListener = new addUpgradeButtonListener();
        addUpgradeButton.addActionListener(addUpgradeButtonListener);
        panel.add(upgradeType);
        panel.add(toppings);
        panel.add(sodaFlavors);
        panel.add(addUpgradeButton);
    }

    public void createSpecificUpgradeComboBox(JPanel panel) {
        String[] selectAlert = {"Select Upgrade"};
        ActionListener specificUpgradeListener = new upgradeTypeListener();
        upgradeType.addActionListener(specificUpgradeListener);
        specificUpgrade = new JComboBox(selectAlert);
        panel.add(specificUpgrade);
    }

    public EditReservationFrame() {
        this.setSize(1400, 200);
        this.setTitle("Edit Reservation");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createComponents();
    }

    class addGuestButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent click) {
            String roomType = (String) roomTypes.getSelectedItem();
            String cardType = (String) creditCardType.getSelectedItem();
            String month = newDateSpinner.getTextField(newDateSpinner.aSpinner).getText();
            String day = newDateSpinner.getTextField(newDateSpinner.bSpinner).getText();
            String year = newDateSpinner.getTextField(newDateSpinner.cSpinner).getText();

            String hours = newTimeSpinner.getTextField(newDateSpinner.aSpinner).getText();
            String minutes = newTimeSpinner.getTextField(newDateSpinner.bSpinner).getText();

            Guest guest = new Guest(nameTextField.getText(), phoneTextField.getText(), emailTextField.getText(), creditCardNameTextField.getText(), creditCardNumberTextField.getText(), creditCardSecurityDigitTextField.getText(), creditCardExpDateTextField.getText(), roomType, month, day, year, hours, minutes, roomUpgrades, cardType);
            guests.add(guest);
        }
    }

    class roomTypeListener implements ActionListener {
        String[] aquaWorldRoom = {"Meal Plan Upgrade", "Towel Rentals", "Party Favors Bag", "Projector", "Party Decoration and Set up"};
        String[] mediumParty = {"Meal Plan Upgrade", "Party Favors Bag", "Projector", "Party Decoration and Set up"};
        String[] smallPartyRoom = {"Meal Plan Upgrade", "Party Favors Bag", "Projector", "Party Decoration and Set up"};
        String[] karaokeAdultRoom = {"Add Meal Plan"};
        String[] adultBilliardRoom = {"Add Meal Plan"};

        String[] toppingsArray = {"Cheese", "Pepperoni", "Ham", "Jalapeno", "Sausage", "Mushroom", "Pineapple", "Bell Pepper", "Onion", "Garlic Chicken"};
        String[] sodaFlavorsArray = {"Coca-cola", "Diet Coke", "Canada Dry", "Orange Crush", "Squirt", "Root Beer"};

        @Override
        public void actionPerformed(ActionEvent click) {
            String roomType = (String) roomTypes.getSelectedItem();

            toppings.setVisible(true);
            sodaFlavors.setVisible(true);
            if(roomType == "Small Party Room"){
                upgradeType.setModel(new JComboBox(smallPartyRoom).getModel());
                toppings.setModel(new JComboBox(toppingsArray).getModel());
                sodaFlavors.setModel(new JComboBox(sodaFlavorsArray).getModel());
            } else if (roomType == "Medium Party Room") {
                upgradeType.setModel(new JComboBox(mediumParty).getModel());
                toppings.setModel(new JComboBox(toppingsArray).getModel());
                sodaFlavors.setModel(new JComboBox(sodaFlavorsArray).getModel());
            } else if(roomType == "Aqua World Room"){
                upgradeType.setModel(new JComboBox(aquaWorldRoom).getModel());
                toppings.setModel(new JComboBox(toppingsArray).getModel());
                sodaFlavors.setModel(new JComboBox(sodaFlavorsArray).getModel());
            } else if(roomType == "Karaoke Room"){
                upgradeType.setModel(new JComboBox(karaokeAdultRoom).getModel());
                toppings.setVisible(false);
                sodaFlavors.setVisible(false);
            } else if(roomType == "Adult Billiard Room"){
                upgradeType.setModel(new JComboBox(adultBilliardRoom).getModel());
                toppings.setVisible(false);
                sodaFlavors.setVisible(false);
            }
            panel.revalidate();
            panel.repaint();
        }
    }

    class upgradeTypeListener implements ActionListener {
        String[] quantity = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] partyDecor = {"Hawaiian", "Sea Life", "Jungle", "Space", "Modern Theme"};
        String[] meals = {"Bronze Meal Plan", "Silver Meal Plan", "Gold Meal Plan", "Platinum Meal Plan"};

        @Override
        public void actionPerformed(ActionEvent click) {
            String aRoomUpgrade = (String) upgradeType.getSelectedItem();

            if(aRoomUpgrade == "Meal Plan Upgrade"){
                specificUpgrade.setModel(new JComboBox(meals).getModel());
            } else if(aRoomUpgrade == "Towel Rentals"){
                specificUpgrade.setModel(new JComboBox(quantity).getModel());
            } else if(aRoomUpgrade == "Party Favors Bag"){
                specificUpgrade.setModel(new JComboBox(quantity).getModel());
            } else if(aRoomUpgrade == "Projector"){
                specificUpgrade.setModel(new JComboBox(quantity).getModel());
            } else if(aRoomUpgrade == "Party Decoration and Set up"){
                specificUpgrade.setModel(new JComboBox(partyDecor).getModel());
            }

            panel.revalidate();
            panel.repaint();
        }
    }

    class addUpgradeButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent click) {
            String upgrade = (String) upgradeType.getSelectedItem();
            String particularUpgrade = (String) specificUpgrade.getSelectedItem();

            if (upgrade == "Towel Rentals") {
                TowelRentals towelRentals = new TowelRentals(Integer.parseInt(particularUpgrade));
                roomUpgrades.add(towelRentals);
            } else if (upgrade == "Party Favors Bag") {
                PartyFavorsBag partyFavorsBag = new PartyFavorsBag(Integer.parseInt(particularUpgrade));
                roomUpgrades.add(partyFavorsBag);
            } else if (upgrade == "Projector") {
                Projector projector = new Projector(Integer.parseInt(particularUpgrade));
                roomUpgrades.add(projector);
            } else if (upgrade == "Party Decoration and Set up") {
                PartyDecorationsAndSetUp partyDecorationsAndSetUp = new PartyDecorationsAndSetUp(particularUpgrade);
                roomUpgrades.add(partyDecorationsAndSetUp);
            }
        }
    }

    class cancelReservation implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            reservationCancel = new JLabel("Reservation Cancelled");
            panel.add(reservationCancel);
        }
    }


}