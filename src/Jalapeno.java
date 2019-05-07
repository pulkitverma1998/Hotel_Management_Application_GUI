public class Jalapeno extends ToppingDecorator {

    public Jalapeno(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addToppings() {
        super.addToppings();
        System.out.print(", jalapeno");
    }
}
