import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRoom{
    private int numOfRooms;
    private Boolean availability;
    private String description;
    private int capacity;
    private int cost;
    private List<String> includedInCost;
    //Upgrades included later
    private String restriction;
    private ArrayList<Guest> waitlist = new ArrayList<>();


    public AbstractRoom(){
        this.numOfRooms = 0;
        this.description = "";
        this.capacity = 0;
        this.cost = 0;
        this.includedInCost = new ArrayList<>();
        this.restriction = "";
    }
    public void attach(Guest aGuest){
        this.waitlist.add(aGuest);
    }
    public void detach(Guest aGuest){
        this.waitlist.remove(aGuest);
    }
    public void Notify(){
        for(Guest g: waitlist){
            g.update();
        }
    }
    public Boolean getAvailability(){
        return availability;
    }
    public int getNumOfRooms() {
        return numOfRooms;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getCost() {
        return cost;
    }

    public List<String> getIncludedInCost() {
        return includedInCost;
    }

    public String getRestriction() {
        return restriction;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setIncludedInCost(List<String> includedInCost) {
        this.includedInCost = includedInCost;
    }

    public void setRestriction(String restriction) {
        this.restriction = restriction;
    }

    // change by Ajay


}
