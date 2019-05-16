/**
 * Class created to make the Sausage as a topping of the pizza
 */
public class Sausage extends ToppingDecorator {
    /**
     * Constructor to get the pizza
     * @param pizza pizza type parameter
     */
    public Sausage(Pizza pizza) {
        super(pizza);
    }
    /**
     * Method to add Sausage Topping onto the Pizza
     */
    @Override
    public void addToppings() {
        super.addToppings();
        System.out.print(", sausage");
    }
}
