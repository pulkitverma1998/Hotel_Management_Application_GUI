import java.util.ArrayList;

public class GoldMealPlan extends MealPlan {
    //instance Variables
    private String salad;
    private String breadSticks;
    private ArrayList<String> wings;


    public GoldMealPlan(ArrayList<Pizza> _pizzas, ArrayList<String> _sodaFlavors, ArrayList<String> _wings) {
        super(_pizzas, _sodaFlavors);
        super.setNoOfPizzas(3);
        super.setNoOfSodas(5);
        super.setCost(120);
        this.salad = "salad";
        this.breadSticks = "bread sticks";
        this.wings = _wings;
    }

    @Override
    public String toString() {
        String description="➤ Included in meal:" +
                "\n\t• "+getNoOfPizzas()+" XL 3 Topping Gourmet Pizzas\n" +
                "\n\t• "+getNoOfSodas()+" 2L Soda Bottles\n" +
                "\n\t• Salad\n" +
                "\n\t• Bread-sticks\n" +
                "\n\t• Choice of 2 chicken wing flavors " +
                "\n\t(Spicy mild,Lemon-pepper, BBQ, Sesame, or Diablo). Pick bone-in or boneless.\n" +
                "➤ Cost: "+getCost();
        return description;
    }
}
