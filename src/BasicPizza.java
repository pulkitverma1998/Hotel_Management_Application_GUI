/**
 * Class to make a basic pizza
 */
public class BasicPizza implements Pizza {
    /**
     * Method to add toppings onto the pizza which in our case is just base pizza
     */
    @Override
    public void addToppings() {
        System.out.print("Pizza");
    }
}
