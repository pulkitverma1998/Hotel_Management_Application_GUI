/**
 * Class to make the room Upgrades
 */
public class RoomUpgrades {

    String name;
    double cost;

    /**
     * Constructor that initializes the name of the upgrade and the cost of the upgrade
     */
    public RoomUpgrades() {
        this.name = "";
        this.cost = 0;
    }

    /**
     * Method to get Name of the room upgrade
     * @return name of upgrade
     */
    public String getName() {
        return name;
    }

    /**
     * Method to set the name of the room upgrade
     * @param name name of upgrade
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to get the cost of the upgrade
     * @return cost of upgrade in double
     */
    public double getCost() {
        return cost;
    }

    /**
     * Method to set the cost of this upgrade
     * @param cost cost of upgrade in double
     */
    public void setCost(double cost) {
        this.cost = cost;
    }
}
