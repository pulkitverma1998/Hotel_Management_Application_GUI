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

    public BronzeMealPlan(){
        super.setNoOfPizzas(3);
        super.setNoOfSodas(5);
        super.setCost(75);
    }

    @Override
    public String toString() {
        String description="➤ Included in meal:" +
                "\n\t• "+getNoOfPizzas()+" XL 2 Topping Gourmet Pizzas" +
                "\n\t• "+getNoOfSodas()+" 2L Soda Bottles" +
                "\n\t• Salad or bread-sticks\n" +
                "➤  Cost: $"+super.getCost()+"";
        return description;
    }
}
