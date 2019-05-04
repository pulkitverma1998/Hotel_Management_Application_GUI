public class Sausage extends ToppingDecorator {

    //instance variables
    Pizza pizza ;

    public Sausage(Pizza pizza) {
        this.pizza = pizza ;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Sausage " ;
    }
}
