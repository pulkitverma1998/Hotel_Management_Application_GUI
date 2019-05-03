import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallPartyRoom extends AbstractRoom{

    private List<String> includedFeatures = new ArrayList<String>(Arrays.asList("Table & chair set-up","Basic Meal Plan"));

    public SmallPartyRoom(){
        super.setNumOfRooms(10);
        super.setDescription("Room with party tables and chairs, adjacent to arcade");
        super.setCapacity(30);
        super.setCost(150);
        super.setIncludedInCost(includedFeatures);
        //upGrades

    }
}
