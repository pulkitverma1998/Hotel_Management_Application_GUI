import java.util.ArrayList;

public class GoldMealPlan extends MealPlan {
    //instance Variables
    private String salad;
    private String breadSticks;
    private ArrayList<String> wings;

    public GoldMealPlan(ArrayList<String> _wings) {
        super();
        super.setNoOfPizzas(3);
        super.setNoOfSodas(5);
        super.setCost(120);
        this.salad = "salad";
        this.breadSticks = "bread sticks";
        this.wings = _wings;
    }

}
