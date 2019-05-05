public class Pineapple extends ToppingDecorator {

    public Pineapple(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addToppings() {
        super.addToppings();
        System.out.print(", pineapple");
    }
}
