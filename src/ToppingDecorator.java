/**
 * Class is used to make Topping Decorator
 */
public class ToppingDecorator implements Pizza {

    protected Pizza pizza;

    /**
     * Constructor that initializes the pizza
     * @param pizza type pizza
     */
    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    /**
     * Method to add the topping on the pizza
     */
    @Override
    public void addToppings() {
        this.pizza.addToppings();
    }
}
