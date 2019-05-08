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
}
