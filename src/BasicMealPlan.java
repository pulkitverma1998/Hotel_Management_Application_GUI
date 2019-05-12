import java.util.ArrayList;

public class BasicMealPlan extends MealPlan {


    public BasicMealPlan(ArrayList<Pizza> _pizzas, ArrayList<String> _sodaFlavors) {
        super(_pizzas, _sodaFlavors);
        super.setNoOfPizzas(3);
        super.setNoOfSodas(3);
        super.setCost(65);
    }

    public BasicMealPlan(){
        super.setNoOfPizzas(3);
        super.setNoOfSodas(3);
        super.setCost(65);
    }

    @Override
    public String toString() {
        String description="➤ Included in meal:" +
                "\n\t• "+getNoOfPizzas()+" XL 1 Topping Gourmet Pizzas" +
                "\n\t• "+getNoOfSodas()+" 2L Soda Bottles\n" +
                "➤ Cost: $"+super.getCost()+"";
        return description;
    }
}
