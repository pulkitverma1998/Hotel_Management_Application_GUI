public class Cheese extends ToppingDecorator {

    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addToppings() {
        super.addToppings();
        System.out.print(", cheese");
    }
}
