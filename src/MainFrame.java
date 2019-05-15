import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
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
    MealPlan basicMealPlan = new BasicMealPlan();
    MealPlan bronzeMealPlan = new BronzeMealPlan();
    MealPlan silverMealPlan = new SilverMealPlan();
    MealPlan goldMealPlan = new GoldMealPlan();
    MealPlan platinumMealPlan = new PlatinumMealPlan();

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

    private void createDefaultMealPanel(){
        centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        //Title of default view
        JLabel panelTitle = new JLabel("Meal Plans");
        panelTitle.setFont(new Font(Font.SERIF, Font.BOLD, 30));

        centerPanel.add(panelTitle);
        addAMealDescription(centerPanel , "Basic Meal Plan" , basicMealPlan.toString());
        addAMealDescription(centerPanel, "Bronze Meal Plan" , bronzeMealPlan.toString());
        addAMealDescription(centerPanel, "Silver Meal Plan" , silverMealPlan.toString());
        addAMealDescription(centerPanel , "Gold Meal Plan" , goldMealPlan.toString());
        addAMealDescription(centerPanel , "Platinum Meal Plan" , platinumMealPlan.toString());

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

    private void createMeal(String mealName){
        centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        JLabel panelTitle;

        if (mealName.equals("All Meals")){
            createDefaultMealPanel();
        }else if (mealName.equals("Basic Meal Plan")){
            System.out.println("hello");
            panelTitle = new JLabel("Basic Meal Plan");
            panelTitle.setFont(new Font(Font.SERIF, Font.BOLD, 30));
            centerPanel.add(panelTitle);
            addAMealDescription(centerPanel, "Basic Meal Plan" , basicMealPlan.toString());
        }else if (mealName.equals("Bronze Meal Plan")){
            panelTitle = new JLabel("Bronze Meal Plan");
            panelTitle.setFont(new Font(Font.SERIF, Font.BOLD, 30));
            centerPanel.add(panelTitle);
            addAMealDescription(centerPanel, "Bronze Meal Plan" , bronzeMealPlan.toString());

        }else if (mealName.equals("Silver Meal Plan")){
            panelTitle = new JLabel("Silver Meal Plan");
            panelTitle.setFont(new Font(Font.SERIF, Font.BOLD, 30));
            centerPanel.add(panelTitle);
            addAMealDescription(centerPanel, "Silver Meal Plan" , silverMealPlan.toString());

        }else if (mealName.equals("Gold Meal Plan")){
            panelTitle = new JLabel("Gold Meal Plan");
            panelTitle.setFont(new Font(Font.SERIF, Font.BOLD, 30));
            centerPanel.add(panelTitle);
            addAMealDescription(centerPanel, "Gold Meal Plan" , goldMealPlan.toString());

        }else if (mealName.equals("Platinum Meal Plan")){
            panelTitle = new JLabel("Platinum Meal Plan");
            panelTitle.setFont(new Font(Font.SERIF, Font.BOLD, 30));
            centerPanel.add(panelTitle);
            addAMealDescription(centerPanel, "Platinum Meal Plan" , platinumMealPlan.toString());

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

        menuItem = new JMenuItem("All Meals");
        submenu.add(menuItem);
        menuItem.addActionListener(new MealItemListener());

        menuItem = new JMenuItem("Basic Meal Plan");
        submenu.add(menuItem);
        menuItem.addActionListener(new MealItemListener());

        menuItem = new JMenuItem("Bronze Meal Plan");
        submenu.add(menuItem);
        menuItem.addActionListener(new MealItemListener());

        menuItem = new JMenuItem("Silver Meal Plan");
        submenu.add(menuItem);
        menuItem.addActionListener(new MealItemListener());

        menuItem = new JMenuItem("Gold Meal Plan");
        submenu.add(menuItem);
        menuItem.addActionListener(new MealItemListener());

        menuItem = new JMenuItem("Platinum Meal Plan");
        submenu.add(menuItem);
        menuItem.addActionListener(new MealItemListener());

        menu.add(submenu);

        menuBar.add(menu);

        //-------  RESERVATIONS MENU------------------
        menu = new JMenu("Reservations");

        //New reservation item
        menuItem = new JMenuItem("New Reservation...");
        menu.add(menuItem);
        menuItem.addActionListener(new ReservationListener());
        menu.addSeparator();

        //Edit reservation item
        menuItem = new JMenuItem("Edit Existing Reservation...");
        menu.add(menuItem);
        menu.addSeparator();

        //Manage reservation sub menu
        submenu = new JMenu("Manage Current Reservation");
        submenu.setMnemonic(KeyEvent.VK_S);

        menuItem = new JMenuItem("Check-in/Check-out");
        submenu.add(menuItem);
        menuItem.addActionListener(new ReservationListener());

//        menuItem = new JMenuItem("Check-out");
//        submenu.add(menuItem);
//        menuItem.addActionListener(new ReservationListener());


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

        BufferedImage img = null;

        try {
            URL url = new URL(imageURL);
            img = ImageIO.read(url);
            Image dimg = img.getScaledInstance(270 , 300, Image.SCALE_FAST);
            ImageIcon icon = new ImageIcon(dimg);
            JLabel picture = new JLabel(roomName, icon, JLabel.CENTER);
            picture.setFont(new Font(Font.SERIF, Font.BOLD, 15));

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
        description.setFont(new Font(Font.SERIF, Font.PLAIN, 15));
        description.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        p.add(description);

        JButton bookButton = new JButton("Book Now");
        bookButton.addActionListener(new BookNowListener());
        p.add(bookButton);
        container.add(p);
    }

    private void addAMealDescription(Container container, String nameMeal, String roomDesc){
        JPanel p = new JPanel();
        JTextArea description = new JTextArea(5,10);
        JLabel nameOfMeal =new JLabel(nameMeal);
        nameOfMeal.setFont(new Font(Font.SERIF, Font.BOLD, 20));
        p.add(nameOfMeal);
        description.append(roomDesc);
        description.setEditable(false);
        description.setFont(new Font(Font.SERIF, Font.PLAIN, 15));
        description.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        p.add(description);
        container.add(p);
    }

    class MealItemListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent click) {
            JMenuItem item = (JMenuItem) click.getSource();
            if(item.getText().equals("All Meals")) {
                centerPanel.removeAll();
                createMeal("All Meals");
                centerPanel.revalidate();
                centerPanel.repaint();
            }
            else if(item.getText().equals("Basic Meal Plan")){
                System.out.println("inside");
                centerPanel.removeAll();
                createMeal("Basic Meal Plan");
                centerPanel.revalidate();
                centerPanel.repaint();
            }
            else if(item.getText().equals("Bronze Meal Plan")){
                centerPanel.removeAll();
                createMeal("Bronze Meal Plan");
                centerPanel.revalidate();
                centerPanel.repaint();
            }
            else if(item.getText().equals("Silver Meal Plan")){
                centerPanel.removeAll();
                createMeal("Silver Meal Plan");
                centerPanel.revalidate();
                centerPanel.repaint();
            }
            else if(item.getText().equals("Gold Meal Plan")){
                centerPanel.removeAll();
                createMeal("Gold Meal Plan");
                centerPanel.revalidate();
                centerPanel.repaint();
            }
            else if(item.getText().equals("Platinum Meal Plan")){
                centerPanel.removeAll();
                createMeal("Platinum Meal Plan");
                centerPanel.revalidate();
                centerPanel.repaint();
            }
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
        }
    }

    class ReservationListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent select) {
            JMenuItem menuItem = (JMenuItem) select.getSource();
            String item = menuItem.getText();

            if (item.equals("New Reservation...")){
                setVisible(false); ///////////This is the change I did to where the frame is kept open. When user closes or cancels the new reservation frame, you go back to the main frame
                new NewReservationFrame();
            }else if (item.equals("Edit Existing Reservation...")){

            }else if (item.equals("Check-in/Check-out")){
                setVisible(false);
                //new CheckInFrame();
                new CheckMainFrame();
            }


//            else if (item.equals("Check-out")){
//                setVisible(false);
//                //new CheckOutFrame();
//                new CheckMainFrame();
//            }

        }
    }

    class BookNowListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
            new NewReservationFrame();
        }
    }
}
