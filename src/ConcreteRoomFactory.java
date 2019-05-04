public class ConcreteRoomFactory extends AbstractRoomFactory {
    @Override
    public AbstractRoom createAbstractRoom(RoomType aRoom) {
        AbstractRoom room = null;
        switch(aRoom){
            case AQUAWORLD_ROOM:
                room = new AquaWorldRoom();
                break;
            case MEDIUM_PARY_ROOM:
                room = new MediumPartyRoom();
                break;
            case SMALL_PARTY_ROOM:
                room = new SmallPartyRoom();
                break;
            case ADULT_BILLIARDS_LOUNGE_ROOM:
                room = new AdultBilliardsLoungeRoom();
                break;
        }
        return room;
    }
}
