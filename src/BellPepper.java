/**
 * Class created to make the Bell pepper as a topping of the pizza
 */
public class BellPepper extends ToppingDecorator {
    /**
     * Constructor to get the pizza
     * @param pizza pizza type parameter
     */
    public BellPepper(Pizza pizza) {
        super(pizza);
    }

    /**
     * Method to add bell pepper Topping onto the Pizza
     */
    @Override
    public void addToppings() {
        super.addToppings();
        System.out.print(", bell pepper");
    }
}
