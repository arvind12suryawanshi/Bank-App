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

        // creation account
        SBIusers acc1 = new SBIusers(name,balance,password);
        System.out.println("the new sbi account is"+acc1.getAcountNo());

        //add amount
        System.out.println("enter the money do you want to add");
        int money1 = sc.nextInt();
        acc1.addMoney(money1);

        // check balance
        double newBalance = acc1.getBalance();
        System.out.println("the new balance is "+newBalance);

        //  withdraw money
        System.out.println(" withdraw money");
        int amt = sc.nextInt();
        System.out.println("enter the password");
        String enterPassword = sc.next();
        String result = acc1.withdrawMoney(amt,enterPassword);
        System.out.println(result);


        //rate of interest
        System.out.println("the interest of 10 years on"+acc1.getBalance()+"RS will be: "+acc1.calculateInterest(10));
    }
}