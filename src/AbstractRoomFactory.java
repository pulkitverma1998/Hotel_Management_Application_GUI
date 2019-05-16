/**
 * Class to create the abstract rooms
 */
public abstract class AbstractRoomFactory {
    /**
     * Abstract method that creates room
     * @param roomType room-types that we want to create
     * @return the Abstract room of the requested type
     */
    public abstract AbstractRoom createAbstractRoom(RoomType roomType);

}
