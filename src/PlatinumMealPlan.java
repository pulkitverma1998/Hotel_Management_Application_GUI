import java.util.ArrayList;
/**
 * Class used to make the Platinum Meal plan that is a part of Meal Plan
 */
public class PlatinumMealPlan extends MealPlan {
    //instance variables
    private String salad ;
    private String breadSticks ;
    private ArrayList<String> wings;
    private ArrayList<String> iceCream;
    /**
     * parametrized constructor to create Platinum meal with number types of pizzas and soda flavours
     * @param _pizzas arrayList of all the pizza with toppings
     * @param _sodaFlavors arrayList of the soda flavours
     * @param _wings arrayList of the Wings favours
     * @param _iceCream arrayList of the Ice Cream Flavours
     */
    public PlatinumMealPlan(ArrayList<Pizza> _pizzas, ArrayList<String> _sodaFlavors, ArrayList<String> _wings, ArrayList<String> _iceCream) {
        super(_pizzas, _sodaFlavors);
        super.setNoOfPizzas(4);
        super.setNoOfSodas(5);
        super.setCost(150.0);
        this.salad = "salad";
        this.breadSticks = "bread sticks";
        this.wings = _wings;
        this.iceCream = _iceCream;
    }
    /**
     * default constructor to create Platinum Meal plan with number of pizzas and number of soda with the cost of this meal plan
     */
    public PlatinumMealPlan(){
        super();
        super.setNoOfPizzas(4);
        super.setNoOfSodas(5);
        super.setCost(150.0);
    }
    /**
     * Method used to get all the information about the Platinum meal plan
     * @return description of this meal plan in a string format
     */
    @Override
    public String toString() {
        String description="➤ Included in meal:" +
                "\n\t• "+getNoOfPizzas()+" XL 3 Topping Gourmet Pizzas" +
                "\n\t• "+getNoOfSodas()+" 2L Soda Bottles" +
                "\n\t• Salad" +
                "\n\t• Bread-sticks" +
                "\n\t• Choice of 2 chicken wing flavors. Pick bone-in or boneless." +
                "\n\t• 2 Flavors of Ice cream (Chocolate, Vanilla, Strawberry)\n" +
                "➤ Cost: $"+getCost()+"";
        return description;
    }
}
