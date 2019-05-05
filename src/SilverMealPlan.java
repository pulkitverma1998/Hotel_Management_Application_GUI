import java.util.ArrayList;

public class SilverMealPlan extends MealPlan {

    private String salad;
    private String  breadSticks;

    public SilverMealPlan() {
        super();
        super.setNoOfPizzas(3);
        super.setNoOfSodas(5);
        super.setCost(90);
        this.salad = "salad";
        this.breadSticks = "bread sticks";
    }
}
