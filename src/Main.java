public class Main {

    public static void main(String[] args) {
        ConcreteRoomFactory aRoom = new ConcreteRoomFactory();
        Guest ajay = new Guest("Ajay", "7142320342", "ajay@sexyladies.com", "3432498594839485");
        Guest pulkit = new Guest("Pulkit", "743823243", "pulkit@sexyladies.com", "43534234234234");

        AbstractRoom myRoom = null;
        AbstractRoom anotherRoonm = null;
        myRoom = aRoom.createAbstractRoom(RoomType.ADULT_BILLIARDS_LOUNGE_ROOM);
        anotherRoonm = aRoom.createAbstractRoom(RoomType.MEDIUM_PARY_ROOM);
        System.out.println(anotherRoonm.getCapacity());
        //System.out.println();
        System.out.println(myRoom.getCapacity());

        myRoom.attach(ajay);
        myRoom.attach(pulkit);
        myRoom.Notify();


        Pizza pizza = null;
    }
}
