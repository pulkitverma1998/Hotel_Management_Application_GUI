import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MediumPartyRoom extends AbstractRoom {

    private List<String> includedInCost = new ArrayList<>(Arrays.asList("Table & Chairs set-up", "DJ", "Basic Meal Plan"));
    private String hoursOperation = "M-Sun: 9AM - 12 AM";

    public MediumPartyRoom() {
        super.setNumOfRooms(2);
        super.setDescription("Room with party tables and chairs, adjacent to arcade");
        super.setCapacity(30);
        super.setCost(150);
        super.setIncludedInCost(includedInCost);
    }

    @Override
    public String toString() {
        String description="➤ Number of Rooms: 2\n" +
                "➤ Description: " +
                "\n\t• Room with party tables and chairs" +
                "\n\t• quick access to arcade\n" +
                "➤ Capacity: 45 people \n" +
                "➤ Cost: $250/hr\n" +
                "➤ Included in cost:" +
                "\n\t•  Table & chair set-up" +
                "\n\t•  DJ" +
                "\n\t•  Basic Meal Plan\n" +
                "➤ Upgrades available:" +
                "\n\t• upgrade meal plan for an additional cost\n\t of $3×(new meal plan cost - basic meal plan cost)" +
                "\n\t• party favor bags ($5 per bag)" +
                "\n\t• projector ($10/hour)" +
                "\n\t• party decorations & set-up (+$100)\n\t - choose Hawaiian, Sea Life, Jungle, Space, or Modern Theme";
        return description;
    }
}
