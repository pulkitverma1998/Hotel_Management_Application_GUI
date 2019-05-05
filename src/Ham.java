public class Ham extends ToppingDecorator {

    public Ham(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addToppings() {
        super.addToppings();
        System.out.print(", ham");
    }
}
