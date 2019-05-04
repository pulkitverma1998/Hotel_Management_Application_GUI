public class GarlicChicken extends ToppingDecorator {

    //instance variables
    Pizza pizza ;

    public GarlicChicken (Pizza pizza ){
        this.pizza = pizza ;
    }

    @Override
    public String getDescription(){
        return pizza.getDescription() + ", GarlicChicken " ;
    }
}
