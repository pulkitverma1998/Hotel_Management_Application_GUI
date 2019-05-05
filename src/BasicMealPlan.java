import java.util.ArrayList;

public class BasicMealPlan extends MealPlan {


    public BasicMealPlan(ArrayList<Pizza> _pizzas, ArrayList<String> _sodaFlavors) {
        super(_pizzas, _sodaFlavors);
        super.setNoOfPizzas(3);
        super.setNoOfSodas(3);
        super.setCost(65);
    }
}
