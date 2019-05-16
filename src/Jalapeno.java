/**
 * Class created to make the Jalapeno as a topping of the pizza
 */
public class Jalapeno extends ToppingDecorator {
    /**
     * Constructor to get the pizza
     * @param pizza pizza type parameter
     */
    public Jalapeno(Pizza pizza) {
        super(pizza);
    }
    /**
     * Method to add Jalapeno Topping onto the Pizza
     */
    @Override
    public void addToppings() {
        super.addToppings();
        System.out.print(", jalapeno");
    }
}
