import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class AdultBilliardsLoungeRoom extends AbstractRoom {
    private List<String> included = new ArrayList<>(Arrays.asList("Access to pool table and cues"));

    public AdultBilliardsLoungeRoom() {
        super.setNumOfRooms(5);
        super.setDescription("Enclosed longe with pool table");
        super.setCapacity(10);
        super.setCost(25);
        super.setIncludedInCost(included);
        super.setRestriction("21+ only");
    }
}