public class BellPepper extends ToppingDecorator {

    //instance variables
    Pizza pizza;

    public BellPepper (Pizza pizza) {
        this.pizza = pizza ;
    }

    @Override
    public String getDescription(){
        return pizza.getDescription() + ", BellPepper " ;
    }
}
