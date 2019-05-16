/**
 * Class makes Projector upgrades that is a part of room upgrades
 */
public class Projector extends RoomUpgrades {
    int hours = 0;
    /**
     * Constructor to make initialize the variable "hours" and the "cost" of this projector upgrade
     */
    public Projector(int hr) {
        super.setName("Towel Rental");
        super.setCost(hr * 10);
        hours = hr;
    }

    /**
     * Method to get the Hours that user have used the projector
     * @return hours in integer
     */
    public int getHours() {
        return hours;
    }

    /**
     * Method to set the hours for the projector use
     * @param hours hours in integer
     */
    public void setHours(int hours) {
        this.hours = hours;
    }
}
