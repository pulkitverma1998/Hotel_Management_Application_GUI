import java.util.ArrayList;

public class Guest implements BaseGuest{
    private String name;
    private String phoneNum;
    private String email;
    private String creditCard;
    private String date;
    private String time;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
