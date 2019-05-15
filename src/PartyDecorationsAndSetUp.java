import java.util.ArrayList;
import java.util.Arrays;

public class PartyDecorationsAndSetUp extends RoomUpgrades {
    ArrayList<String> decorations;

    public PartyDecorationsAndSetUp() {
        super.setName("Party Decorations and Set-ups");
        super.setCost(100);
        decorations = new ArrayList<>(Arrays.asList("Hawaiian", "Sea Life", "Jungle", "Space", "Modern Theme"));
    }

    public ArrayList<String> getDecorations() {
        return decorations;
    }
}
