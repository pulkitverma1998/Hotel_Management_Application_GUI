import java.util.ArrayList;

public class Reservation {
    String mealPlan;
    String upgrades;
    String specialInstructions;
    String date;
    String time;
    AbstractRoom reservedRoom;

    ArrayList<AbstractRoom> myRooms = ConcreteRoomFactory.allAvailableRooms;
    public void update(){
    }



}
