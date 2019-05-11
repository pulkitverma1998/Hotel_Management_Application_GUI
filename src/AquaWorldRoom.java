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
        String description = "➤ Number of Rooms: 1\n" +
                "➤ Description:" +
                "\n\t• Olympic-sized pool with water slide" +
                "\n\t• Kiddie pool" +
                "\n\t• Large jacuzzi\n" +
                "➤ Capacity: "+getCapacity()+"people\n" +
                "➤ Cost: $"+getCost()+"/hr\n" +
                "➤ Included in cost:" +
                "\n\t• access to showers/lockers," +
                "\n\t• life guards on duty" +
                "\n\t•  DJ" +
                "\n\t• table & chair set-up" +
                "\n\t• Basic Meal Plan\n" +
                "➤ Upgrades available:" +
                "\n\t• upgrade meal plan for an additional cost\n\t  of $5×(new meal plan cost - basic meal plan cost)" +
                "\n\t• towel rentals ($2 each)" +
                "\n\t• party favors bag ($5 per bag)" +
                "\n\t• projector ($10/hour)" +
                "\n\t• party decorations & set-up (+$100)\n\t  - choose Hawaiian, Sea Life, Jungle, Space, or Modern Theme\n" +
                "➤ Restrictions: "+getRestriction();

        return description;
    }
}
