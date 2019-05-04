public class Pineapple extends ToppingDecorator{

    //instance variable
    Pizza pizza ;

    public Pineapple(Pizza pizza ) {
        this.pizza = pizza ;
    }

    @Override
    public String getDescription(){
        return pizza.getDescription() + ", Pineapple " ;
    }

}
