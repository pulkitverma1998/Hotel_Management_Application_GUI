/**
 * Class created to make the Onion as a topping of the pizza
 */
public class Onion extends ToppingDecorator {
    /**
     * Constructor to get the pizza
     * @param pizza pizza type parameter
     */
    public Onion(Pizza pizza) {
        super(pizza);
    }
    /**
     * Method to add Onion Topping onto the Pizza
     */
    @Override
    public void addToppings() {
        super.addToppings();
        System.out.print(", onion");
    }
}
