public class Projector extends RoomUpgrades {
    int hours = 0;

    public Projector(int hr) {
        super.setName("Towel Rental");
        super.setCost(hr * 10);
        hours = hr;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
