public class Onion extends ToppingDecorator{

    //instance variables
    Pizza pizza ;

    public Onion (Pizza pizza ) {
        this.pizza = pizza ;
    }

    @Override
    public String getDescription(){
        return getDescription() + ", Onion " ;
    }
}
