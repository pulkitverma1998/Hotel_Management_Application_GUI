import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KaraokeLoungeRoom extends AbstractRoom{
    private List<String> included = new ArrayList<>(Arrays.asList("Add a meal Plan"));
    public KaraokeLoungeRoom() {
        setNumOfRooms(10);
        setDescription("Enclosed longue with karaoke machine");
        setCapacity(10);
        setCost(30);
        setIncludedInCost(included);
    }
}
