/**
 * Class created to make the Mushroom as a topping of the pizza
 */
public class Mushroom extends ToppingDecorator {
    /**
     * Constructor to get the pizza
     * @param pizza pizza type parameter
     */
    public Mushroom(Pizza pizza) {
        super(pizza);
    }
    /**
     * Method to add Mushroom Topping onto the Pizza
     */
    @Override
    public void addToppings() {
        super.addToppings();
        System.out.print(", mushroom");
    }
}
