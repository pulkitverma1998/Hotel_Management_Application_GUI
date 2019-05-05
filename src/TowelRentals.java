public class TowelRentals extends RoomUpdrages {
    int towelQuantity = 0;

    public TowelRentals(int towelQ) {
        super.setName("Towel Rental");
        super.setCost(towelQuantity * 2);
        towelQuantity = towelQ;
    }

    public int getTowelQuantity() {
        return towelQuantity;
    }

    public void setTowelQuantity(int towelQuantity) {
        this.towelQuantity = towelQuantity;
    }
}
