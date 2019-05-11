import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AquaWorldRoom extends AbstractRoom {

    private List<String> includedInCost = new ArrayList<>(Arrays.asList("access to showers/lockers", "life guards on duty", "DJ", "table & chair set-up, Basic Meal Plan"));
    private String hoursOperation = "M-Sun: 8AM - 2 AM";

    public AquaWorldRoom() {
        super.setNumOfRooms(1);
        super.setDescription("Olympic-sized pool with water slide, kiddie pool, and large jacuzzi");
        super.setCapacity(75);
        super.setCost(700);
        super.setIncludedInCost(includedInCost);
        super.setRestriction("To access water facilities, bathing suits must be worn at all times.");
    }

    @Override
    public String toString() {
        String description = "➤ Number of Rooms: 1\n\n" +
                "➤ Description:" +
                "\n\t\t\t• Olympic-sized pool with water slide" +
                "\n\t\t\t• Kiddie pool" +
                "\n\t\t\t• Large jacuzzi\n\n" +
                "➤ Capacity: 75 people\n\n" +
                "➤ Cost: $700/hr\n\n" +
                "➤ Included in cost:" +
                "\n\t\t\t• access to showers/lockers," +
                "\n\t\t\t• life guards on duty" +
                "\n\t\t\t•  DJ" +
                "\n\t\t\t• table & chair set-up" +
                "\n\t\t\t• Basic Meal Plan\n\n" +
                "➤ Upgrades available:\n" +
                "\n\t\t\t• upgrade meal plan for an additional cost of $5×(new meal plan cost - basic meal plan cost)" +
                "\n\t\t\t• towel rentals ($2 each)\n" +
                "\n\t\t\t• party favors bag ($5 per bag),\n" +
                "\n\t\t\t• projector ($10/hour),\n" +
                "\n\t\t\t• party decorations & set-up (+$100) - choose Hawaiian, Sea Life, Jungle, Space, or Modern Theme\n\n" +
                "➤ Restrictions: To access water facilities, bathing suits must be worn at all times.";

        return description;
    }
}
