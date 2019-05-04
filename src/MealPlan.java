import java.util.ArrayList;

public class MealPlan extends AbstractRoom{
    private ArrayList<Pizza> pizzas ;
    private ArrayList<String> sodaFlavors;
    private String sodaName ;

    public MealPlan(){
        sodaName = "" ;
    }

    ///////////////////////////////////////////Work on this //////////////////////////////////////////////////
    public void getUpgrades() {

    }

    public double getCost(){
        double totalCost = 0 ;

        return totalCost ;
    }

    public String getSodaName(){
        return sodaName ;
    }

    public void setSodaName( String n ) {
        sodaName = n;
    }

}
