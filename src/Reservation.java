import java.util.ArrayList;

public class Reservation {
    String mealPlan;
    String upgrades;
    String specialInstructions;
    String date;
    String time;
    ArrayList<String> dates = new ArrayList<>();
    AbstractRoom reservedRoom;


    Reservation(String mealPlan, ArrayList<String> dates){
        this.dates = dates;
        this.mealPlan = mealPlan;
        //this.upgrades = upgrades;
        //this.specialInstructions = specialInstructions;

    }
    public void update(){
    }


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
}
