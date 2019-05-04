public class Mushroom extends ToppingDecorator {

    //instance Variables
    Pizza pizza ;

    public Mushroom (Pizza pizza) {
        this.pizza = pizza ;
    }

    @Override
    public String getDescription(){
        return pizza.getDescription() + ", Mushroom " ;
    }

}
