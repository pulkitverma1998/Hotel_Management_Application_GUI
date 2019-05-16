import java.util.ArrayList;

/**
 * Class used to make the meal plan a part of the Abstract room
 */
public class MealPlan extends AbstractRoom {
    private ArrayList<Pizza> pizzas ;
    private int noOfPizzas;
    private int noOfSodas;
    private ArrayList<String> sodaFlavors;
    private double cost;

    /**
     * Constructor of the Meal Plan that initialize the flavours of pizza and the soda as well as the cost
     * @param _pizzas list of the different pizzas
     * @param _sodaFlavors list of the soda flavours
     */
    public MealPlan(ArrayList<Pizza> _pizzas, ArrayList<String> _sodaFlavors) {
        this.pizzas = _pizzas;
        noOfPizzas = 0;
        noOfSodas = 0;
        this.sodaFlavors = _sodaFlavors;
        cost = 0;
    }

    /**
     * Default constructor to initialize the number of pizza and the number of soda with the cosrt
     */
    public MealPlan() {
        noOfPizzas = 0;
        noOfSodas = 0;
        cost = 0;
    }

    /**
     * Method to get the number of pizza
     * @return number of pizza
     */
    public int getNoOfPizzas() {
        return noOfPizzas;
    }

    /**
     * Method to set the number of pizza
     * @param noOfPizzas number of pizza
     */
    public void setNoOfPizzas(int noOfPizzas) {
        this.noOfPizzas = noOfPizzas;
    }

    /**
     * Method to get the number of Soda
     * @return number of Soda
     */
    public int getNoOfSodas() {
        return noOfSodas;
    }

    /**
     * Method to set the Number of Sodas
     * @param noOfSodas number of Soda
     */
    public void setNoOfSodas(int noOfSodas) {
        this.noOfSodas = noOfSodas;
    }

    /**
     * Method to get the pizzas
     * @return list of pizzas
     */
    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    /**
     * Method to set the Pizzas
     * @param pizzas list of all the pizzas
     */
    public void setPizzas(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    /**
     * Method to get the Soda Flavours
     * @return list of soda flavours
     */
    public ArrayList<String> getSodaFlavors() {
        return sodaFlavors;
    }

    /**
     * Method to set the soda flavour
     * @param sodaFlavors list of soda flavours
     */
    public void setSodaFlavors(ArrayList<String> sodaFlavors) {
        this.sodaFlavors = sodaFlavors;
    }

    /**
     * Method to get the cost of meal
     * @return cost of meal
     */
    @Override
    public double getCost() {
        return cost;
    }

    /**
     * Method to set the cost of meal
     * @param cost cost of meal
     */
    public void setCost(double cost) {
        this.cost = cost;
    }
}
