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

}
