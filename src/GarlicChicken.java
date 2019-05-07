public class GarlicChicken extends ToppingDecorator {

    public GarlicChicken(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addToppings() {
        super.addToppings();
        System.out.print(", garlic chicken");
    }
}
