public class PartyFavorsBag extends RoomUpdrages{
    int bagQuantity = 0;

    public PartyFavorsBag(int bagQ) {
        super.setName("Party Favors Bag");
        super.setCost(bagQ * 5);
        bagQuantity = bagQ;
    }

    public int getBagQuantity() {
        return bagQuantity;
    }

    public void setBagQuantity(int bagQuantity) {
        this.bagQuantity = bagQuantity;
    }
}
