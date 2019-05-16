public class PartyDecorationsAndSetUp extends RoomUpgrades {
    String decorations;

    public PartyDecorationsAndSetUp(String decorations) {
        super.setName("Party Decorations and Set-ups");
        super.setCost(100);
        this.decorations = decorations;
    }

    public String getDecorations() {
        return decorations;
    }

    public void setDecorations(String decorations) {
        this.decorations = decorations;
    }
}
