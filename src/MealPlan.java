import java.util.ArrayList;

public class MealPlan extends AbstractRoom {
    private ArrayList<Pizza> pizzas ;
    private int noOfPizzas;
    private int noOfSodas;
    private ArrayList<String> sodaFlavors;
    private double cost;

    public MealPlan() {
        pizzas = new ArrayList<>();
        noOfPizzas = 0;
        noOfSodas = 0;
        sodaFlavors = new ArrayList<>();
        cost = 0.0;
    }

    public int getNoOfPizzas() {
        return noOfPizzas;
    }

    public void setNoOfPizzas(int noOfPizzas) {
        this.noOfPizzas = noOfPizzas;
    }

    public int getNoOfSodas() {
        return noOfSodas;
    }

    public void setNoOfSodas(int noOfSodas) {
        this.noOfSodas = noOfSodas;
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public ArrayList<String> getSodaFlavors() {
        return sodaFlavors;
    }

    public void setSodaFlavors(ArrayList<String> sodaFlavors) {
        this.sodaFlavors = sodaFlavors;
    }

    @Override
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
