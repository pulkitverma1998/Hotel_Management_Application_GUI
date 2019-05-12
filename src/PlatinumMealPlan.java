import java.util.ArrayList;

public class PlatinumMealPlan extends MealPlan {
    //instance variables
    private String salad ;
    private String breadSticks ;
    private ArrayList<String> wings;
    private ArrayList<String> iceCream;

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

    public PlatinumMealPlan(){
        super();
        super.setNoOfPizzas(4);
        super.setNoOfSodas(5);
        super.setCost(150.0);
    }

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
