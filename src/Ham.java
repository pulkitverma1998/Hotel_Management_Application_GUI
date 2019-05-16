/**
 * Class created to make the Ham as a topping of the pizza
 */
public class Ham extends ToppingDecorator {
    /**
     * Constructor to get the pizza
     * @param pizza pizza type parameter
     */
    public Ham(Pizza pizza) {
        super(pizza);
    }
    /**
     * Method to add Ham Topping onto the Pizza
     */
    @Override
    public void addToppings() {
        super.addToppings();
        System.out.print(", ham");
    }
}
