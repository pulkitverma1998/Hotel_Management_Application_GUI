import java.util.ArrayList;

/**
 * Class used to have a basic meal plan that is default for every room
 */
public class BasicMealPlan extends MealPlan {

    /**
     * parametrized constructor to create Basic meal with number types of pizzas and soda flavours
     * @param _pizzas arrayList of all the pizza with toppings
     * @param _sodaFlavors arrayList of the soda flavours
     */
    public BasicMealPlan(ArrayList<Pizza> _pizzas, ArrayList<String> _sodaFlavors) {
        super(_pizzas, _sodaFlavors);
        super.setNoOfPizzas(3);
        super.setNoOfSodas(3);
        super.setCost(65);
    }

    /**
     * default constructor to create Basic Meal plan with number of pizzas and number of soda with the cost of this meal plan
     */
    public BasicMealPlan(){
        super();
        super.setNoOfPizzas(3);
        super.setNoOfSodas(3);
        super.setCost(65.0);
    }

    /**
     * Method used to get all the information about the basic meal plan
     * @return description of this meal plan in a string format
     */
    @Override
    public String toString() {
        String description="➤ Included in meal:" +
                "\n\t• "+getNoOfPizzas()+" XL 1 Topping Gourmet Pizzas" +
                "\n\t• "+getNoOfSodas()+" 2L Soda Bottles\n" +
                "➤ Cost: $"+getCost()+"";
        return description;
    }
}
