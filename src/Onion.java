public class Onion extends ToppingDecorator {

    public Onion(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addToppings() {
        super.addToppings();
        System.out.print(", onion");
    }
}
