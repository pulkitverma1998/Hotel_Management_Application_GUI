import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallPartyRoom extends AbstractRoom{

    private List<String> includedCost = new ArrayList<String>(Arrays.asList("Table & chair set-up","Basic Meal Plan"));
    private String hoursOperation = "M-Sun: 9AM - 12 AM";

    public SmallPartyRoom(){
        super.setNumOfRooms(10);
        super.setDescription("Room with party tables and chairs, adjacent to arcade");
        super.setCapacity(30);
        super.setCost(150);
        super.setIncludedInCost(includedCost);
        //upGrades
    }

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
