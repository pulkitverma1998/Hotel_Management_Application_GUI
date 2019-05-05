import java.util.ArrayList;

public class MealPlan extends AbstractRoom{
    private ArrayList<Pizza> pizzas ;
    private ArrayList<String> sodaFlavors;
    private double cost;


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
