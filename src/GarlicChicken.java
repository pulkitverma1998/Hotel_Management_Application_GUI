/**
 * Class created to make the GarlicChicken as a topping of the pizza
 */
public class GarlicChicken extends ToppingDecorator {
    /**
     * Constructor to get the pizza
     * @param pizza pizza type parameter
     */
    public GarlicChicken(Pizza pizza) {
        super(pizza);
    }
    /**
     * Method to add GarlicChicken Topping onto the Pizza
     */
    @Override
    public void addToppings() {
        super.addToppings();
        System.out.print(", garlic chicken");
    }
}
