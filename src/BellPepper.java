public class BellPepper extends ToppingDecorator {

    public BellPepper(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addToppings() {
        super.addToppings();
        System.out.print(", Bell Pepper");
    }
}
