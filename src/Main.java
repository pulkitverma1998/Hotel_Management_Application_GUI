import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Guest ajay = new Guest("Ajay", "7142320342", "ajay@yahoo.com", "3432498594839485");
        //Guest pulkit = new Guest("Pulkit", "743823243", "pulkit@yahoo.com", "43534234234234");



        // Creates an Adult Billiard Lounge room and a Medium Party Room
        // Abstract Factory Pattern
        ConcreteRoomFactory aRoom = new ConcreteRoomFactory();
        AbstractRoom smallParty = null;
        AbstractRoom mediumParty = null;
        AbstractRoom aquaWorldRoom = null;
        smallParty = aRoom.createAbstractRoom(RoomType.SMALL_PARTY_ROOM);
        mediumParty = aRoom.createAbstractRoom(RoomType.MEDIUM_PARY_ROOM);
        aquaWorldRoom = aRoom.createAbstractRoom(RoomType.AQUAWORLD_ROOM);

        System.out.println(smallParty.getDescription());
        System.out.println(mediumParty.getDescription());
        System.out.println(aquaWorldRoom.getDescription());

       // smallParty.attach(ajay);
        // mediumParty.attach(pulkit);
        smallParty.Notify();
        mediumParty.Notify();

        // We created a pizza and added toppings
        Pizza pizza = new BellPepper(new Sausage(new Onion(new BasicPizza())));
        pizza.addToppings();

        ArrayList<String> sodaFlavor = new ArrayList<>(Arrays.asList("Grape Soda", "Orange Soda"));
        ArrayList<Pizza> pizzas = new ArrayList<>(Arrays.asList(pizza));
        //BasicMealPlan basicMealPlan = new BasicMealPlan(pizza, sodaFlavor);
        //System.out.println(basicMealPlan.toString());
        MainFrame mainFrame = new MainFrame();


    }
}
