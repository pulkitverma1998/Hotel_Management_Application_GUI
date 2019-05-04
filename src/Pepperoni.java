public class Pepperoni extends ToppingDecorator {

    //instanceVariables
    Pizza pizza ;

    public Pepperoni(Pizza pizza) {
        this.pizza = pizza ;
    }

    @Override
    public String getDescription(){
        return pizza.getDescription() + ", Pepperoni ";
    }


}
