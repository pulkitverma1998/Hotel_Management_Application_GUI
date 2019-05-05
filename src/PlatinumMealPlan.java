import java.util.ArrayList;

public class PlatinumMealPlan extends MealPlan {
    //instance variables
    private String salad ;
    private String breadSticks ;
    private ArrayList<String> wings;
    private ArrayList<String> iceCream;

    public PlatinumMealPlan(ArrayList<String> _wings, ArrayList<String> _iceCream){
        super();
        super.setNoOfPizzas(4);
        super.setNoOfSodas(5);
        super.setCost(150);
        this.salad = "salad";
        this.breadSticks = "bread sticks";
        this.wings = _wings;
        this.iceCream = _iceCream;
    }

}
