import java.util.ArrayList;

public class BronzeMealPlan extends MealPlan {

    private String salad;
    private String  breadSticks;


    public BronzeMealPlan(ArrayList<Pizza> _pizzas, ArrayList<String> _sodaFlavors) {
        super(_pizzas, _sodaFlavors);
        super.setNoOfPizzas(3);
        super.setNoOfSodas(5);
        super.setCost(75);
        this.salad = "salad";
        this.breadSticks = "bread sticks";
    }
}
