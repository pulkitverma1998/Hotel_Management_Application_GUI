import java.util.ArrayList;

public class Guest implements BaseGuest {
    private String name;
    private String phoneNum;
    private String email;
    private String cardName;
    private String cardNum;
    private String securityDigits;
    private String expirationCard;
    private String cardType;
    private String roomType;
    private String month;
    private String day;
    private String year;
    private String hours;
    private String minutes;
    private ArrayList<RoomUpgrades> roomUpgrades;


    public Guest(String name, String phoneNum, String email, String cardName, String cardNum, String securityDigits, String expirationCard, String roomType, String month, String day, String year, String hours, String minutes, ArrayList<RoomUpgrades> roomUpgrades, String cardType) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
        this.cardName = cardName;
        this.cardNum = cardNum;
        this.securityDigits = securityDigits;
        this.expirationCard = expirationCard;
        this.roomType = roomType;
        this.roomUpgrades = roomUpgrades;
        this.cardType = cardType;
        this.month = month;
        this.day = day;
        this.year = year;
        this.hours = hours;
        this.minutes = minutes;
    }


    public ArrayList<RoomUpgrades> getRoomUpgrades() {
        return roomUpgrades;
    }

    public void setRoomUpgrades(ArrayList<RoomUpgrades> roomUpgrades) {
        this.roomUpgrades = roomUpgrades;
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

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String typeOfCard) {
        this.cardNum = typeOfCard;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }
}

