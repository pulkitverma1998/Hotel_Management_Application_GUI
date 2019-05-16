/**
 * Class created to make the Pineapple as a topping of the pizza
 */
public class Pineapple extends ToppingDecorator {
    /**
     * Constructor to get the pizza
     * @param pizza pizza type parameter
     */
    public Pineapple(Pizza pizza) {
        super(pizza);
    }
    /**
     * Method to add Pineapple Topping onto the Pizza
     */
    @Override
    public void addToppings() {
        super.addToppings();
        System.out.print(", pineapple");
    }
}
