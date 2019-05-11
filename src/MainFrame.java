//package gui;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URL;

import java.net.URL;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

import javax.swing.*;
import javax.swing.border.Border;

//import backend.AquaRoom;
//import backend.MediumPartyRoom;
//import backend.SmallPartyRoom;

public class MainFrame extends JFrame {
    JMenuBar menuBar;
    JScrollPane scrollPane;
    JPanel centerPanel;

    ConcreteRoomFactory aRoom = new ConcreteRoomFactory();
    AbstractRoom smallParty = aRoom.createAbstractRoom(RoomType.SMALL_PARTY_ROOM);
    AbstractRoom mediumParty = aRoom.createAbstractRoom(RoomType.MEDIUM_PARY_ROOM);
    AbstractRoom aquaWorldRoom = aRoom.createAbstractRoom(RoomType.AQUAWORLD_ROOM);

    //border settings used in the method addARoomDescription()
    Border raisedbevel = BorderFactory.createRaisedBevelBorder();
    Border loweredbevel = BorderFactory.createLoweredBevelBorder();

    MainFrame(){
        this.setTitle("Reservation System");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); //makes window screen size
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.createMenuBar();
        this.createDefaultPanel();
        this.setVisible(true);
    }

    /*
     * initializes the default center panel and adds it to this frame
     * */
    private void createDefaultPanel() {
        centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        //Title of default view
        JLabel panelTitle = new JLabel("Party World Rooms");
        panelTitle.setFont(new Font(Font.SERIF, Font.BOLD, 30));

        centerPanel.add(panelTitle);
        addARoomDescription(centerPanel,"https://s3.amazonaws.com/cmop_production/images/3582/inline/INLINE_Birthday_Small_Party_Rm.jpg?1497465759" , "Small Party Room" , aquaWorldRoom.toString());
        addARoomDescription(centerPanel, "https://s3.amazonaws.com/cmop_production/images/3590/inline/Classroom.jpg?1497985491","Medium Party Room", "Medium Party Room");
        addARoomDescription(centerPanel, "https://media-cdn.tripadvisor.com/media/photo-s/0f/02/0c/1b/aqua-room.jpg", "Aqua Room" , "Aqua World Room");

        scrollPane = new JScrollPane(centerPanel);
        this.add(scrollPane, BorderLayout.CENTER);
    }

    private void createMediumPartyRoomPanel() {
        JPanel mediumPartyRoomPanel = new JPanel();
        mediumPartyRoomPanel.setLayout(new BoxLayout(mediumPartyRoomPanel, BoxLayout.Y_AXIS));
        //Title of default view
        JLabel panelTitle = new JLabel("Medium Party Rooms");
        panelTitle.setFont(new Font(Font.SERIF, Font.BOLD, 30));

        mediumPartyRoomPanel.add(panelTitle);
        addARoomDescription(mediumPartyRoomPanel,"https://s3.amazonaws.com/cmop_production/images/3582/inline/INLINE_Birthday_Small_Party_Rm.jpg?1497465759" , "Medium Party Room" , aquaWorldRoom.toString());
        scrollPane = new JScrollPane(mediumPartyRoomPanel);
        this.add(scrollPane, BorderLayout.CENTER);
        this.add(mediumPartyRoomPanel);
    }

    /* initializes menu bar items and adds them to this window*/
    private void createMenuBar() {
        menuBar = new JMenuBar();
        //-------
        JMenu menu;
        JMenu submenu;
        JMenuItem menuItem;

        //-------  DESCRIPTIONS MENU------------------
        menu = new JMenu("Descriptions");

        //Party Room Sub Menu
        submenu = new JMenu("Party Rooms");


        menuItem = new JMenuItem("All");
        menuItem.addActionListener(new RoomItemListener());
        submenu.add(menuItem);

        menuItem = new JMenuItem("Small Party Rooms");
        menuItem.addActionListener(new RoomItemListener());
        submenu.add(menuItem);

        menuItem = new JMenuItem("Medium Party Rooms");
        menuItem.addActionListener(new RoomItemListener());
        submenu.add(menuItem);

        menuItem = new JMenuItem("Aqua Room");
        submenu.add(menuItem);
        menu.add(submenu);

        //Lounges Sub Menu
        submenu = new JMenu("Lounges");

        menuItem = new JMenuItem("All");
        submenu.add(menuItem);

        menuItem = new JMenuItem("Karaoke Lounges");
        submenu.add(menuItem);

        menuItem = new JMenuItem("Billiards Lounges");
        submenu.add(menuItem);

        menu.add(submenu);
        menu.addSeparator();

        //Meal Plans Sub Menu
        submenu = new JMenu("Meal Plans");

        menuItem = new JMenuItem("All");
        submenu.add(menuItem);
        menuItem.addActionListener(new MealItemListener());

        menuItem = new JMenuItem("Basic");
        submenu.add(menuItem);
        menuItem.addActionListener(new MealItemListener());

        menuItem = new JMenuItem("Bronze");
        submenu.add(menuItem);
        menuItem.addActionListener(new MealItemListener());

        menuItem = new JMenuItem("Silver");
        submenu.add(menuItem);
        menuItem.addActionListener(new MealItemListener());

        menuItem = new JMenuItem("Gold");
        submenu.add(menuItem);
        menuItem.addActionListener(new MealItemListener());

        menuItem = new JMenuItem("Platinum");
        submenu.add(menuItem);
        menuItem.addActionListener(new MealItemListener());

        menu.add(submenu);

        menuBar.add(menu);

        //-------  RESERVATIONS MENU------------------
        menu = new JMenu("Reservations");

        //New reservation item
        menuItem = new JMenuItem("New Reservation...");
        menu.add(menuItem);
        menu.addSeparator();

        //Edit reservation item
        menuItem = new JMenuItem("Edit Existing Reservation...");
        menu.add(menuItem);
        menu.addSeparator();

        //Manage reservation sub menu
        submenu = new JMenu("Manage Current Reservation");
        submenu.setMnemonic(KeyEvent.VK_S);

        menuItem = new JMenuItem("Check-in");
        submenu.add(menuItem);

        menuItem = new JMenuItem("Check-out");
        submenu.add(menuItem);


        menu.add(submenu);


        menuBar.add(menu);
        this.add(menuBar, BorderLayout.NORTH);
    }



    /*
     * adds room image and description to a given container
     * @param container - the container onto which to add the new description
     * @param imgDir - the directory of the image
     * @param roomName - the name of the room
     * @param roomDesc - the description of the room
     *
     * */
    private void addARoomDescription(Container container, String imageURL, String roomName, String roomDesc) {
        JPanel p = new JPanel();

        try {
            URL url = new URL(imageURL);
            ImageIcon icon = new ImageIcon(url);
            JLabel picture = new JLabel(roomName, icon, JLabel.CENTER);
            picture.setFont(new Font(Font.SERIF, Font.BOLD, 20));

            //Set the position of the text, relative to the icon:
            picture.setVerticalTextPosition(JLabel.TOP);
            picture.setHorizontalTextPosition(JLabel.CENTER);
            //Set border around
            picture.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));

            p.add(picture);
        } catch (IOException e) {
            e.printStackTrace();
        }

        JTextArea description = new JTextArea(5,10);
        description.append(roomDesc);
        description.setEditable(false);
        description.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
        description.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        p.add(description);

        JButton bookButton = new JButton("Book Now");
        p.add(bookButton);
        container.add(p);
    }

    class MealItemListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent click) {
            JMenuItem menuItem = (JMenuItem) click.getSource();
            String item = menuItem.getText();
            System.out.println(item);
            if(item.equals("All")) {
                System.out.println("VIEW ALL"); //replace
            }
            else if(item.equals("Basic")) System.out.println("VIEW BASIC"); //replace
            else if(item.equals("Bronze")) System.out.println("VIEW BRONZE");


        }

    }

    class RoomItemListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent select) {
            JMenuItem item = (JMenuItem) select.getSource();

            if(item.getText().equals("Medium Party Rooms")) {
                centerPanel.removeAll();
                createMediumPartyRoomPanel();
                revalidate();
                repaint();
            }
        }}
}
