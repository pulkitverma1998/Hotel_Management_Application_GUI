import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KaraokeLoungeRoom extends AbstractRoom{
    private List<String> included = new ArrayList<>(Arrays.asList("Add a meal Plan"));
    private String hoursOperation = "M-Sun: 9AM - 1 AM";
    public KaraokeLoungeRoom() {
        setNumOfRooms(10);
        setDescription("Enclosed lounge with karaoke machine");
        setCapacity(10);
        setCost(30);
        setIncludedInCost(included);
    }
}
