import java.util.ArrayList;
/**
 * Class used to make the Bronze Meal plan that is a part of Meal Plan
 */
public class BronzeMealPlan extends MealPlan {

    private String salad;
    private String  breadSticks;

    /**
     * parametrized constructor to create Bronze meal with number types of pizzas and soda flavours
     * @param _pizzas arrayList of all the pizza with toppings
     * @param _sodaFlavors arrayList of the soda flavours
     */
    public BronzeMealPlan(ArrayList<Pizza> _pizzas, ArrayList<String> _sodaFlavors) {
        super(_pizzas, _sodaFlavors);
        super.setNoOfPizzas(3);
        super.setNoOfSodas(5);
        super.setCost(75);
        this.salad = "salad";
        this.breadSticks = "bread sticks";
    }
    /**
     * default constructor to create Bronze Meal plan with number of pizzas and number of soda with the cost of this meal plan
     */
    public BronzeMealPlan(){
        super();
        super.setNoOfPizzas(3);
        super.setNoOfSodas(5);
        super.setCost(75.0);
    }
    /**
     * Method used to get all the information about the bronze meal plan
     * @return description of this meal plan in a string format
     */
    @Override
    public String toString() {
        String description="➤ Included in meal:" +
                "\n\t• "+getNoOfPizzas()+" XL 2 Topping Gourmet Pizzas" +
                "\n\t• "+getNoOfSodas()+" 2L Soda Bottles" +
                "\n\t• Salad or bread-sticks\n" +
                "➤  Cost: $"+getCost()+"";
        return description;
    }
}
