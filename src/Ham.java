public class Ham extends ToppingDecorator {

    //instance Variables
    Pizza pizza ;

    public Ham( Pizza pizza ) {
        this.pizza = pizza ;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Ham " ;
    }
}
