import java.util.ArrayList;

public class PlatinumMealPlan extends MealPlan {
    //instance variables
    private String salad ;
    private String breadSticks ;
    private String chickenWings ;
    String iceCreamName ;
    ArrayList<String> iceCream ;

    public PlatinumMealPlan(){
        super();
        this.salad = salad;
        this.breadSticks = breadSticks;
        this.chickenWings = chickenWings;
        this.iceCreamName = iceCreamName;
    }
    public PlatinumMealPlan( String salad, String breadSticks, String chickenWings, String iceCreamName, ArrayList<String> iceCream) {

        this.salad = salad;
        this.breadSticks = breadSticks;
        this.chickenWings = chickenWings;
        this.iceCreamName = iceCreamName;
        this.iceCream = iceCream;
    }
}
