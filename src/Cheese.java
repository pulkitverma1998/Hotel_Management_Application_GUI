public class Cheese extends ToppingDecorator {

    //instance variables
    Pizza pizza ;

    public Cheese(Pizza pizza){
        this.pizza = pizza ;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese ";

    }


}
