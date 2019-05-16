import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Class used to make the Small Party Room
 */
public class SmallPartyRoom extends AbstractRoom{

    private List<String> includedCost = new ArrayList<String>(Arrays.asList("Table & chair set-up","Basic Meal Plan"));
    private String hoursOperation = "M-Sun: 9AM - 12 AM";
    /**
     * Constructor used to initialize the variables of this type of rooms.
     * Sets the features and cost of this Small Party Room
     */
    public SmallPartyRoom(){
        super.setNumOfRooms(10);
        super.setDescription("Room with party tables and chairs, adjacent to arcade");
        super.setCapacity(30);
        super.setCost(150);
        super.setIncludedInCost(includedCost);
        //upGrades
    }
    /**
     * Method used to display the information about this room
     * @return all about this room as a string
     */
    @Override
    public String toString() {
        String description="➤ Number of Rooms: 10\n" +
                "➤ Description:" +
                "\n\t• Room with party tables and chairs" +
                "\n\t• Adjacent to arcade\n" +
                "➤ Capacity: 30 people\n" +
                "➤ Cost: $150/hr\n" +
                "➤ Included in cost:" +
                "\n\t• Table & chair set-up" +
                "\n\t• Basic Meal Plan\n" +
                "➤ Upgrades available:" +
                "\n\t• upgrade meal plan for an additional cost\n\t of $(new meal plan cost - basic meal plan cost)" +
                "\n\t• party favors bag ($5 per bag)" +
                "\n\t• projector ($10/hour)" +
                "\n\t• party decorations & set-up (+$100)\n\t - choose Hawaiian, Sea Life, Jungle, Space, or Modern Theme";
        return description;
    }
}
