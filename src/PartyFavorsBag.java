/**
 * Class makes Party Favour Bags that is a part of room upgrades
 */
public class PartyFavorsBag extends RoomUpgrades {
    int bagQuantity = 0;

    /**
     * Constructor to initialize the variable bag quantity
     * @param bagQ
     */
    public PartyFavorsBag(int bagQ) {
        super.setName("Party Favors Bag");
        super.setCost(bagQ * 5);
        bagQuantity = bagQ;
    }

    /**
     * Method to get the number of party favour bags that user have ordered
     * @return number of bags
     */
    public int getBagQuantity() {
        return bagQuantity;
    }

    /**
     * Method to set the number of the party favour bags that guest wants to order
     * @param bagQuantity number of the bags
     */
    public void setBagQuantity(int bagQuantity) {
        this.bagQuantity = bagQuantity;
    }
}
