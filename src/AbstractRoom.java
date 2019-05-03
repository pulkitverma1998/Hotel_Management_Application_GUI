import java.util.ArrayList;

public abstract class AbstractRoom {
    private int numOfRooms;
    private String description;
    private int capacity;
    private int cost;
    private ArrayList<String> includedInCost;
    //Upgrades included later
    private String restriction;

    public AbstractRoom(){
        this.numOfRooms = 0;
        this.description = "";
        this.capacity = 0;
        this.cost = 0;
        this.includedInCost = new ArrayList<>();
        this.restriction = "";
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

    public int getCost() {
        return cost;
    }

    public ArrayList<String> getIncludedInCost() {
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

    public void setIncludedInCost(ArrayList<String> includedInCost) {
        this.includedInCost = includedInCost;
    }

    public void setRestriction(String restriction) {
        this.restriction = restriction;
    }
}
