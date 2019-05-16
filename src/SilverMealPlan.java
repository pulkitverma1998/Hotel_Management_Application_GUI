import java.util.ArrayList;
/**
 * Class used to make the Silver Meal plan that is a part of Meal Plan
 */
public class SilverMealPlan extends MealPlan {

    private String salad;
    private String  breadSticks;
    /**
     * parametrized constructor to create Silver meal with number types of pizzas and soda flavours
     * @param _pizzas arrayList of all the pizza with toppings
     * @param _sodaFlavors arrayList of the soda flavours
     */
    public SilverMealPlan(ArrayList<Pizza> _pizzas, ArrayList<String> _sodaFlavors) {
        super(_pizzas, _sodaFlavors);
        super.setNoOfPizzas(3);
        super.setNoOfSodas(5);
        super.setCost(90);
        this.salad = "salad";
        this.breadSticks = "bread sticks";
    }
    /**
     * default constructor to create Silver Meal plan with number of pizzas and number of soda with the cost of this meal plan
     */
    public SilverMealPlan(){
        super();
        super.setNoOfPizzas(3);
        super.setNoOfSodas(5);
        super.setCost(90.0);
    }
    /**
     * Method used to get all the information about the Silver meal plan
     * @return description of this meal plan in a string format
     */
    @Override
    public String toString() {
        String description="➤ Included in meal:" +
                "\n\t• "+getNoOfPizzas()+" XL 2 Topping Gourmet Pizzas" +
                "\n\t• "+getNoOfSodas()+" 2L Soda Bottles" +
                "\n\t• Salad" +
                "\n\t• bread-sticks\n" +
                "➤  Cost: $"+getCost()+"";
        return description;
    }
}
