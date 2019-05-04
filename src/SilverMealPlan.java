public class SilverMealPlan extends MealPlan {
    private String breadSticks ;
    private String salad ;

    public SilverMealPlan() {
        super( );
        this.breadSticks = "";
        this.salad = "" ;
    }

    public String getBreadSticks() {
        return breadSticks;
    }

    public void setBreadSticks(String breadSticks) {
        this.breadSticks = breadSticks;
    }

    public String getSalad() {
        return salad;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }
    public double getCost() {
        return 90 ;
    }
}
