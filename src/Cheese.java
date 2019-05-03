public class Cheese extends TopingDecorator {
    Pizza pizza ;
    public Cheese(Pizza pizza){
        this.pizza = pizza ;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese ";

    }

    @Override
    public double getCost() {
        return 0;
    }
}
