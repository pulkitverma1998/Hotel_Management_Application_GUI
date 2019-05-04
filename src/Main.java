public class Main {

    public static void main(String[] args) {
        ConcreteRoomFactory aRoom = new ConcreteRoomFactory();
        AbstractRoom myRoom = null;
        AbstractRoom anotherRoonm = null;
        myRoom = aRoom.createAbstractRoom(RoomType.ADULT_BILLIARDS_LOUNGE_ROOM);
        anotherRoonm = aRoom.createAbstractRoom(RoomType.MEDIUM_PARY_ROOM);
        System.out.println(anotherRoonm.getCapacity());
        //System.out.println();
        System.out.println(myRoom.getCapacity());
    }
}
