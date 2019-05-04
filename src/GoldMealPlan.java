public class GoldMealPlan extends MealPlan{
    //instance Variables
    private String salad ;
    private String breadSticks ;
    private String wingName ;

    public GoldMealPlan( String salad, String breadSticks, String wingName) {

        this.salad = salad;
        this.breadSticks = breadSticks;
        this.wingName = wingName;
    }

    public GoldMealPlan() {
        super();
        salad = "" ;
        breadSticks = "";
        wingName = "" ;
    }

    public String getSalad() {
        return salad;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }

    public String getBreadSticks() {
        return breadSticks;
    }

    public void setBreadSticks(String breadSticks) {
        this.breadSticks = breadSticks;
    }

    public String getWingName() {
        return wingName;
    }

    public void setWingName(String wingName) {
        this.wingName = wingName;
    }

    public double getCost() {
        return 120 ;
    }
}
