import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallPartyRoom extends AbstractRoom{

    private List<String> includedCost = new ArrayList<String>(Arrays.asList("Table & chair set-up","Basic Meal Plan"));
    private String hoursOperation = "M-Sun: 9AM - 12 AM";

    public SmallPartyRoom(){
        super.setNumOfRooms(10);
        super.setDescription("Room with party tables and chairs, adjacent to arcade");
        super.setCapacity(30);
        super.setCost(150);
        super.setIncludedInCost(includedCost);
        //upGrades
    }
}
