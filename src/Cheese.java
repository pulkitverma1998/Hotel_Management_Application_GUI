/**
 * Class created to make the Bell pepper as a topping of the pizza
 */
public class Cheese extends ToppingDecorator {
    /**
     * Constructor to get the pizza
     * @param pizza pizza type parameter
     */
    public Cheese(Pizza pizza) {
        super(pizza);
    }
    /**
     * Method to add cheese Topping onto the Pizza
     */
    @Override
    public void addToppings() {
        super.addToppings();
        System.out.print(", cheese");
    }
}
