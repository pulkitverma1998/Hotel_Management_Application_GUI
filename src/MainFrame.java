import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URL;
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
    AbstractRoom karaokeLounge = aRoom.createAbstractRoom(RoomType.KARAOKE_LOUNGE_ROOM);
    AbstractRoom billiardLounge = aRoom.createAbstractRoom(RoomType.ADULT_BILLIARDS_LOUNGE_ROOM);

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
        addARoomDescription(centerPanel,"https://s3.amazonaws.com/cmop_production/images/3582/inline/INLINE_Birthday_Small_Party_Rm.jpg?1497465759" , "Small Party Room" , smallParty.toString());
        addARoomDescription(centerPanel, "https://s3.amazonaws.com/cmop_production/images/3590/inline/Classroom.jpg?1497985491","Medium Party Room", mediumParty.toString());
        addARoomDescription(centerPanel, "https://media-cdn.tripadvisor.com/media/photo-s/0f/02/0c/1b/aqua-room.jpg", "Aqua Room" , aquaWorldRoom.toString());

        scrollPane = new JScrollPane(centerPanel);
        this.add(scrollPane, BorderLayout.CENTER);
    }

    private void createDefaultLoungePanel() {
        centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        //Title of default view
        JLabel panelTitle = new JLabel("Lounge Rooms");
        panelTitle.setFont(new Font(Font.SERIF, Font.BOLD, 30));

        centerPanel.add(panelTitle);
        addARoomDescription(centerPanel,"https://scontent-lax3-2.xx.fbcdn.net/v/t1.0-9/10968581_659173427526066_7303907398316959276_n.jpg?_nc_cat=100&_nc_ht=scontent-lax3-2.xx&oh=a68fcbe09fdd2b22654eb41c5d336e39&oe=5D5B13DA" , "Karaoke Lounge Room" , karaokeLounge.toString());
        addARoomDescription(centerPanel,"https://media-cdn.tripadvisor.com/media/photo-s/02/3d/8a/8e/adult-lounge-room.jpg" , "Adult Billiards Lounge Room" , billiardLounge.toString());

        scrollPane = new JScrollPane(centerPanel);
        this.add(scrollPane, BorderLayout.CENTER);
    }



    private void createRoomPanel(String roomName) {
        centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        JLabel panelTitle;
        //Title of default view

        if (roomName.equals("Medium Party Rooms")) {
            panelTitle = new JLabel("Medium Party Rooms");
            panelTitle.setFont(new Font(Font.SERIF, Font.BOLD, 30));
            centerPanel.add(panelTitle);
            addARoomDescription(centerPanel,"https://s3.amazonaws.com/cmop_production/images/3582/inline/INLINE_Birthday_Small_Party_Rm.jpg?1497465759" , "Medium Party Room" , mediumParty.toString());
        } else if (roomName.equals("Small Party Rooms")) {
            panelTitle = new JLabel("Small Party Rooms");
            panelTitle.setFont(new Font(Font.SERIF, Font.BOLD, 30));
            centerPanel.add(panelTitle);
            addARoomDescription(centerPanel,"https://s3.amazonaws.com/cmop_production/images/3582/inline/INLINE_Birthday_Small_Party_Rm.jpg?1497465759" , "Small Party Room" , smallParty.toString());
        } else if (roomName.equals("Aqua Room")) {
            panelTitle = new JLabel("Aqua Room");
            panelTitle.setFont(new Font(Font.SERIF, Font.BOLD, 30));
            centerPanel.add(panelTitle);
            addARoomDescription(centerPanel, "https://media-cdn.tripadvisor.com/media/photo-s/0f/02/0c/1b/aqua-room.jpg", "Aqua Room" , aquaWorldRoom.toString());
        } else if (roomName.equals("All Rooms")) {
            createDefaultPanel();
        }
        scrollPane = new JScrollPane(centerPanel);
        this.add(scrollPane, BorderLayout.CENTER);
        this.add(centerPanel);
    }

    private void createLounge(String loungeName) {
        centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        JLabel panelTitle;
        //Title of default view

        if (loungeName.equals("Karaoke Lounges")) {
            panelTitle = new JLabel("Karaoke Lounges");
            panelTitle.setFont(new Font(Font.SERIF, Font.BOLD, 30));
            centerPanel.add(panelTitle);
            addARoomDescription(centerPanel,"https://scontent-lax3-2.xx.fbcdn.net/v/t1.0-9/10968581_659173427526066_7303907398316959276_n.jpg?_nc_cat=100&_nc_ht=scontent-lax3-2.xx&oh=a68fcbe09fdd2b22654eb41c5d336e39&oe=5D5B13DA" , "Karaoke Lounge Room" , karaokeLounge.toString());
        } else if (loungeName.equals("Billiards Lounges")) {
            panelTitle = new JLabel("Billiards Lounges");
            panelTitle.setFont(new Font(Font.SERIF, Font.BOLD, 30));
            centerPanel.add(panelTitle);
            addARoomDescription(centerPanel,"https://media-cdn.tripadvisor.com/media/photo-s/02/3d/8a/8e/adult-lounge-room.jpg" , "Adult Billiards Lounge Room" , billiardLounge.toString());
        } else if (loungeName.equals("All Lounges")) {
            createDefaultLoungePanel();
        }
        scrollPane = new JScrollPane(centerPanel);
        this.add(scrollPane, BorderLayout.CENTER);
        this.add(centerPanel);
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


        menuItem = new JMenuItem("All Rooms");
        menuItem.addActionListener(new RoomItemListener());
        submenu.add(menuItem);

        menuItem = new JMenuItem("Small Party Rooms");
        menuItem.addActionListener(new RoomItemListener());
        submenu.add(menuItem);

        menuItem = new JMenuItem("Medium Party Rooms");
        menuItem.addActionListener(new RoomItemListener());
        submenu.add(menuItem);

        menuItem = new JMenuItem("Aqua Room");
        menuItem.addActionListener(new RoomItemListener());
        submenu.add(menuItem);

        menu.add(submenu);

        //Lounges Sub Menu
        submenu = new JMenu("Lounges");

        menuItem = new JMenuItem("All Lounges");
        menuItem.addActionListener(new RoomItemListener());
        submenu.add(menuItem);

        menuItem = new JMenuItem("Karaoke Lounges");
        menuItem.addActionListener(new RoomItemListener());
        submenu.add(menuItem);

        menuItem = new JMenuItem("Billiards Lounges");
        menuItem.addActionListener(new RoomItemListener());
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
                createRoomPanel("Medium Party Rooms");
                centerPanel.revalidate();
                centerPanel.repaint();
            } else if (item.getText().equals("Small Party Rooms")) {
                centerPanel.removeAll();
                createRoomPanel("Small Party Rooms");
                centerPanel.revalidate();
                centerPanel.repaint();
            } else if (item.getText().equals("Aqua Room")) {
                centerPanel.removeAll();
                createRoomPanel("Aqua Room");
                centerPanel.revalidate();
                centerPanel.repaint();
            } else if (item.getText().equals("All Rooms")) {
                centerPanel.removeAll();
                createRoomPanel("All Rooms");
                centerPanel.revalidate();
                centerPanel.repaint();
            } else if (item.getText().equals("Karaoke Lounges")) {
                centerPanel.removeAll();
                createLounge("Karaoke Lounges");
                centerPanel.revalidate();
                centerPanel.repaint();
            } else if (item.getText().equals("Billiards Lounges")) {
                centerPanel.removeAll();
                createLounge("Billiards Lounges");
                centerPanel.revalidate();
                centerPanel.repaint();
            } else if (item.getText().equals("All Lounges")) {
                centerPanel.removeAll();
                createLounge("All Lounges");
                centerPanel.revalidate();
                centerPanel.repaint();
            }
        }}
}
