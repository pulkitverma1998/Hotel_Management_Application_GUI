/**
 * Class made to create the Concrete Objects of the Rooms
 */
public class ConcreteRoomFactory extends AbstractRoomFactory {
    /**
     * Metode used to create the objects
     * @param aRoom a type of the room that we want to create
     * @return an Abstract room
     */
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
            case KARAOKE_LOUNGE_ROOM:
                room = new KaraokeLoungeRoom();
                break;
            case ADULT_BILLIARDS_LOUNGE_ROOM:
                room = new AdultBilliardsLoungeRoom();
                break;
        }
        return room;
    }
}
