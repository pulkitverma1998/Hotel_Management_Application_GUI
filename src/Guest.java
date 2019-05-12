import java.util.ArrayList;
import java.util.List;

public class Guest implements BaseGuest {
    protected List<String> typeOfCard = new ArrayList<>();
    protected List<String> contactInfo = new ArrayList<>();
    private String name;
    private String phoneNum;
    private String email;
    private String cardName;
    private String securityDigits;
    private String expirationCard;
    private String cardNum;
    //    private String creditCard;
//    private String date;
//    private String time;
    public ArrayList<RoomUpdrages> upgrades = new ArrayList<>();

    public Guest(String name, String phoneNum, String email, String cardName, String cardNum, String securityDigits, String expirationCard, Reservation aReservation) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
        this.cardName = cardName;
        this.cardNum = cardNum;
        this.securityDigits = securityDigits;
        this.expirationCard = expirationCard;
    }

    public void addCardType(String aType){
        this.typeOfCard.add(aType);
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

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getSecurityDigits() {
        return securityDigits;
    }

    public void setSecurityDigits(String securityDigits) {
        this.securityDigits = securityDigits;
    }

    public String getExpirationCard() {
        return expirationCard;
    }

    public void setExpirationCard(String expirationCard) {
        this.expirationCard = expirationCard;
    }

/*    public String getTypeOfCard() {
        return typeOfCard;
    }*/

    public void setTypeOfCard(String aType) {
        this.typeOfCard.add(aType);
    }

    public void setContact(String aContact){
        this.contactInfo.add(aContact);
    }
    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String typeOfCard) {
        this.cardNum = typeOfCard;
    }
}

//    public String getCreditCard() {
//        return creditCard;
//    }
//
//    public void setCreditCard(String creditCard) {
//        this.creditCard = creditCard;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    public String getTime() {
//        return time;
//    }
//
//    public void setTime(String time) {
//        this.time = time;
//    }
//}
