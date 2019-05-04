public class Jalapeno extends ToppingDecorator {

    //instance variables
    Pizza pizza ;

    public Jalapeno(Pizza pizza ) {
        this.pizza = pizza ;
    }

    @Override
    public String getDescription(){
        return pizza.getDescription() + ", Jalapeno ";
    }
}
