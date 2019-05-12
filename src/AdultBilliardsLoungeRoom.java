import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class AdultBilliardsLoungeRoom extends AbstractRoom {
    private List<String> included = new ArrayList<>(Arrays.asList("Access to pool table and cues"));
    private String hoursOperation = "M-Sun: 9AM - 1 AM";

    public AdultBilliardsLoungeRoom() {
        super.setNumOfRooms(5);
        super.setDescription("Enclosed longe with pool table");
        super.setCapacity(10);
        super.setCost(25);
        super.setIncludedInCost(included);
        super.setRestriction("21+ only");
    }

    @Override
    public String toString() {
        String description="➤ Number of Rooms: 5\n" +
                "➤ Description: Enclosed lounge with pool table\n" +
                "➤ Capacity: 10 people\n" +
                "➤ Cost: $25/hr\n" +
                "➤ Included in cost: access to pool table and cues.\n" +
                "➤ Upgrades available: add a meal plan\n" +
                "➤ Restrictions: 21+ only";
        return description;
    }
}