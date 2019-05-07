public class Mushroom extends ToppingDecorator {

    public Mushroom(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addToppings() {
        super.addToppings();
        System.out.print(", mushroom");
    }
}
