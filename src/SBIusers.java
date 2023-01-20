import java.util.Objects;
import java.util.UUID;

public class SBIusers implements Bankinterface{
    //attributes
    private String name;
    private String acountNo;
    private double balance;
    private String password;
    private double rateOfInterest;


    public SBIusers(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        // bank is initilize
        this.rateOfInterest = 6.5;
        this.acountNo = String.valueOf(UUID.randomUUID());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcountNo() {
        return acountNo;
    }

    public void setAcountNo(String acountNo) {
        this.acountNo = acountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance = balance+amount;
        return "your new balance is:"+ balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
        if(Objects.equals(enteredPassword,password)){

            if(amount>balance){
                return  "sorry bro! insufficient money";
            }
            else{
                balance = balance-amount;
                return "paisa hi paisa (lots of money)";
            }

        }
        else{
            return "wrong password";
        }
    }

    @Override
    public double calculateInterest(int year) {


        return (balance*year*rateOfInterest)/100;
    }
}
