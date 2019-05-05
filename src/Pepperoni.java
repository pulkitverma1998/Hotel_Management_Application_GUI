public class Pepperoni extends ToppingDecorator {

    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addToppings() {
        super.addToppings();
        System.out.print(", pepperoni");
    }
}
