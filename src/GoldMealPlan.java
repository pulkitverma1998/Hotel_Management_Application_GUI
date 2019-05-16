import java.util.ArrayList;
/**
 * Class used to make the Gold Meal plan that is a part of Meal Plan
 */
public class GoldMealPlan extends MealPlan {
    //instance Variables
    private String salad;
    private String breadSticks;
    private ArrayList<String> wings;

    /**
     * parametrized constructor to create Gold meal with number types of pizzas and soda flavours
     * @param _pizzas arrayList of all the pizza with toppings
     * @param _sodaFlavors arrayList of the soda flavours
     * @param _wings arrayList of the Wings favours
     */
    public GoldMealPlan(ArrayList<Pizza> _pizzas, ArrayList<String> _sodaFlavors, ArrayList<String> _wings) {
        super(_pizzas, _sodaFlavors);
        super.setNoOfPizzas(3);
        super.setNoOfSodas(5);
        super.setCost(120.0);
        this.salad = "salad";
        this.breadSticks = "bread sticks";
        this.wings = _wings;
    }
    /**
     * default constructor to create Gold Meal plan with number of pizzas and number of soda with the cost of this meal plan
     */
    public GoldMealPlan(){
        super();
        super.setNoOfPizzas(3);
        super.setNoOfSodas(5);
        super.setCost(120.0);
    }
    /**
     * Method used to get all the information about the Gold meal plan
     * @return description of this meal plan in a string format
     */
    @Override
    public String toString() {
        String description="➤ Included in meal:" +
                "\n\t• "+getNoOfPizzas()+" XL 3 Topping Gourmet Pizzas" +
                "\n\t• "+getNoOfSodas()+" 2L Soda Bottles" +
                "\n\t• Salad" +
                "\n\t• Bread-sticks" +
                "\n\t• Choice of 2 chicken wing flavors " +
                "\n\t  (Spicy mild,Lemon-pepper, BBQ, Sesame, or Diablo)" +
                "\n\t  Pick bone-in or boneless.\n" +
                "➤ Cost: $"+getCost()+"";
        return description;
    }
}
