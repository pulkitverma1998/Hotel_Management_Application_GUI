/**
 * Class makes Towel Rentals that is a part of room upgrades
 */
public class TowelRentals extends RoomUpgrades {
    private int towelQuantity;

    /**
     * Constructor to initialize the number of towel that guest wants to rent
     * @param towelQ number of towel
     */
    public TowelRentals(int towelQ) {
        //super.setName("Towel Rental");
        //super.setCost(towelQuantity * 2);
        towelQuantity = towelQ;
    }

    /**
     * Method to get the number of towels that user rented
     * @return number of towels
     */
    public int getTowelQuantity() {
        return towelQuantity;
    }

    /**
     * Method to set the number of towels that user wants to rent
     * @param towelQuantity number of towels
     */
    public void setTowelQuantity(int towelQuantity) {
        this.towelQuantity = towelQuantity;
    }
}
