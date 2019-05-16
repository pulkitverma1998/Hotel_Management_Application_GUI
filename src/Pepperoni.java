/**
 * Class created to make the Pepperoni as a topping of the pizza
 */
public class Pepperoni extends ToppingDecorator {
    /**
     * Constructor to get the pizza
     * @param pizza pizza type parameter
     */
    public Pepperoni(Pizza pizza) {
        super(pizza);
    }
    /**
     * Method to add Pepperoni Topping onto the Pizza
     */
    @Override
    public void addToppings() {
        super.addToppings();
        System.out.print(", pepperoni");
    }
}
