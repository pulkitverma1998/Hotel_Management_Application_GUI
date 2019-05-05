import java.util.ArrayList;

public class Reservation {
    String mealPlan;
    String upgrades;
    String specialInstructions;
    String date;
    String time;
    AbstractRoom reservedRoom;

    //ArrayList<AbstractRoom> myRooms = ConcreteRoomFactory.allAvailableRooms;

    public Reservation(){
        mealPlan= "Basic Meal Plan";
        //TODO upgrades
        date = null;
        time= null;
        reservedRoom=null;
        specialInstructions=null;
    }

//
//    public Reservation(String mealPlan, String specialInstructions, String date, String time, AbstractRoom reservedRoom) {
//        this.mealPlan = mealPlan;
//        this.specialInstructions = specialInstructions;
//        this.date = date;
//        this.time = time;
//        this.reservedRoom = reservedRoom;
//        //TODO upgrades
//    }

    public String getMealPlan() {
        return mealPlan;
    }

    public void setMealPlan(String mealPlan) {
        this.mealPlan = mealPlan;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public AbstractRoom getReservedRoom() {
        return reservedRoom;
    }

    public void setReservedRoom(AbstractRoom reservedRoom) {
        this.reservedRoom = reservedRoom;
    }

    public void update(){
    }



}
