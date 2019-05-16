import java.util.ArrayList;
import java.util.List;

/**
 * Abstract class for Rooms.
 * Every room can extend it.
 */
public abstract class AbstractRoom {
    private int numOfRooms;
    private Boolean availability;
    private String description;
    private int capacity;
    private int cost;
    private List<String> includedInCost;
    //Upgrades included later
    private String restriction;
    private ArrayList<Guest> waitlist = new ArrayList<>();

    /**
     * Constructor to initialize the private variables of each room have in common.
     */
    public AbstractRoom(){
        this.numOfRooms = 0;
        this.description = "";
        this.capacity = 0;
        this.cost = 0;
        this.includedInCost = new ArrayList<>();
        this.restriction = "";
    }

    /**
     * to add a guest in to the waiting list.
     * @param aGuest guest that we want to add in wait-list for the room.
     */
    public void attach(Guest aGuest){
        this.waitlist.add(aGuest);
    }

    /**
     * to remove a guest from the waiting list.
     * When Guest have canceled the reservation or The guest have provided the party room.
     * @param aGuest guest to remove from the wait-list of the room.
     */
    public void detach(Guest aGuest){
        this.waitlist.remove(aGuest);
    }

    /**
     * Makes the guest know when there is any update in its reservation situation.
     */
    public void Notify(){
        for(Guest g: waitlist){
            g.update();
        }
    }

    /**
     * Method used to check if the given room is available to use or not
     * @return true when the room is vacant to use
     */
    public Boolean getAvailability(){
        return availability;
    }

    /**
     * Method used to get the number of same type rooms
     * @return number of rooms for that party type
     */
    public int getNumOfRooms() {
        return numOfRooms;
    }

    /**
     * Method used to get the information about that room
     * @return the description of the room as the facilities that are provided with that room
     */
    public String getDescription() {
        return description;
    }

    /**
     * Number of the people that this party room can accommodate
     * @return number of people in integer.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * method used to get the Cost of room
     * @return the price of the room in double
     */
    public double getCost() {
        return cost;
    }

    /**
     * Method used to get the list of all the items provided with that room
     * @return List of the facilities that are provided with the booking of room
     */
    public List<String> getIncludedInCost() {
        return includedInCost;
    }

    /**
     * Method used to get Restriction if any.
     * @return instructions about the use of room in String format
     */
    public String getRestriction() {
        return restriction;
    }

    /**
     * Method to set the number of rooms of each kind
     * @param numOfRooms number that we have of the same type
     */
    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    /**
     * Method used to set the details of each room
     * @param description an information about the room
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Method used to set the capacity of the room
     * @param capacity argument taken as integer to set the capacity of this room
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Method to set the cost of each room.
     * @param cost integer argument that sets the cost of the room
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * Method to set the facilities that are provided on purchase of the room
     * @param includedInCost list of facilities as a string
     */
    public void setIncludedInCost(List<String> includedInCost) {
        this.includedInCost = includedInCost;
    }

    /**
     * Method used to set the restrictions of a room
     * @param restriction restrictions as a string argument
     */
    public void setRestriction(String restriction) {
        this.restriction = restriction;
    }

}
