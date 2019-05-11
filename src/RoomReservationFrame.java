import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;
import javax.swing.border.Border;

public class RoomReservationFrame extends JFrame {
    private JTextField name;
    private JTextField numbers;
    private JTextField securityCode;

    private JCheckBox viaPhone;
    private JCheckBox viaEmail;
    private JCheckBox visa;
    private JCheckBox masterCard;
    private JCheckBox aExpress;

    private JComboBox<String> roomTypes;
    private JComboBox<String> mealPlans;
    private JComboBox<String> toppings;
    private JComboBox<String> soda;
    private JComboBox<String> iceCream;

    private JButton save;

    public RoomReservationFrame(){
        this.setTitle("Room Reservation");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); //makes window screen size
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //this.createMenuBar();
        //this.createDefaultPanel();
        this.setVisible(true);
    }
}
