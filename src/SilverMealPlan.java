import java.util.ArrayList;

public class SilverMealPlan extends MealPlan {

    private String salad;
    private String  breadSticks;

    public SilverMealPlan(ArrayList<Pizza> _pizzas, ArrayList<String> _sodaFlavors) {
        super(_pizzas, _sodaFlavors);
        super.setNoOfPizzas(3);
        super.setNoOfSodas(5);
        super.setCost(90);
        this.salad = "salad";
        this.breadSticks = "bread sticks";
    }

    public SilverMealPlan(){
        super();
        super.setNoOfPizzas(3);
        super.setNoOfSodas(5);
        super.setCost(90.0);
    }

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
