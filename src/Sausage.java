public class Sausage extends ToppingDecorator {

    public Sausage(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addToppings() {
        super.addToppings();
        System.out.print(", sausage");
    }
}
