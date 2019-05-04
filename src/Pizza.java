
abstract class Pizza {
    //instance variables
    private String name ;
    protected String description ;

    public Pizza () {
        name = "" ;
        description = "";
    }

    public abstract String getDescription() ;
    public abstract double getCost() ;
}
