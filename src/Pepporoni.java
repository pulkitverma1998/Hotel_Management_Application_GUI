public class Pepporoni extends ToppingDecorator {

    //instanceVariables
    Pizza pizza ;

    public Pepporoni(Pizza pizza) {
        this.pizza = pizza ;
    }

    @Override
    public String getDescription(){
        return pizza.getDescription() + ", Pepporoni ";
    }


}
