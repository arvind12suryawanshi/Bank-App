import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name,password,balance to create a account");

        //create user
        String name = sc.next();
        String password = sc.next();
        double balance = sc.nextDouble();
        SBIusers user = new SBIusers(name,balance,password);

        //add amount
        String message = user.addMoney(100000);
        System.out.println(message);

        //  withdraw money
        System.out.println("enter the money you want to withdraw");
        int money = sc.nextInt();
        System.out.println("enter the password");
        String pass = sc.next();
        System.out.println(user.withdrawMoney(money,pass));

        //rate of interest
        System.out.println(user.calculateInterest(10));
    }
}