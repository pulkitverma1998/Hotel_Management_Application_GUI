public class concreteRoomFactory extends AbstractRoomFactory {

    @Override
    public AquaWorldRoom createAquaWorldRoom() {
        AquaWorldRoom aquaWorldRoom = new AquaWorldRoom();
        return aquaWorldRoom;
    }

    @Override
    public SmallPartyRoom createSmallPartyRoom() {
        SmallPartyRoom smallPartyRoom = new SmallPartyRoom();
        return smallPartyRoom;
    }

    @Override
    public MediumPartyRoom createMediumPartyRoom() {
        MediumPartyRoom mediumPartyRoom = new MediumPartyRoom();
        return mediumPartyRoom;
    }

    @Override
    public KaraokeLoungeRoom createKaraokeLoungeRoom() {
        KaraokeLoungeRoom karaokeLoungeRoom = new KaraokeLoungeRoom();
        return karaokeLoungeRoom;
    }

    @Override
    public AdultBilliardsLoungeRoom createAdultBbilliardsRoom() {
        AdultBilliardsLoungeRoom adultBilliardsLoungeRoom = new AdultBilliardsLoungeRoom();
        return adultBilliardsLoungeRoom;
    }
}
