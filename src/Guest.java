import java.util.ArrayList;

public class Guest implements BaseGuest{
    String name;
    String phoneNum;
    String email;
    String creditCard;
    public ArrayList<RoomUpdrages> upgrades = new ArrayList<>();
    public Guest(String name, String phoneNum, String email, String creditCard){
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
        this.creditCard = creditCard;
    }
    public void update() {
        System.out.println("Your room Available! Confirm your spot by paying 25% of the fee: ");
    }
}
