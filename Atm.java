import java.util.Scanner;
class Bankaccount{
    private double balance; 

public Bankaccount(double initialBalance){
    balance=initialBalance;
}
public double getbalance(){
    return balance;
}
public void deposit(double amount){
    if(amount>0){
        balance+=amount;
        System.out.println("Deposit of $"+amount+"Successful");
    }
    else{
        System.out.println("Invalid deposit amount");
    }
}
public boolean withdraw(double amount){
    if(amount > 0 && amount <= balance){
        balance-=amount;
        System.out.println("Withdrawal of $"+amount+" Successful");
        return true;
    }
    else{
        System.out.println("Insufficient funds/Invalid withdrawal amount");
        return false;
    }
 }
}
public class Atm {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Bankaccount useraccount = new Bankaccount(1000.0);// initalize with an inital balance amount of $1000

    while (true) {
        System.out.println("WELCOME TO ATM ");
        System.out.println("1. Check balance");
        System.out.println("2. Deposit");
        System.out.println("3. withdraw");
        System.out.println("4. Exit");
        System.out.println("Enter Your Choice");
        int choice = sc.nextInt();
        switch(choice){
         case 1:
            System.out.println("Your balance is:$"+ useraccount.getbalance());
            break;
         case 2:
            System.out.println("Enter the deposit amount:$");
            double depositamount =sc.nextDouble();
            useraccount.deposit(depositamount);
            break;
         case 3:
            System.out.println("Enter the withdrawal amount:$");  
            double withdrawalamount=sc.nextDouble();
            boolean success= useraccount.withdraw(withdrawalamount);
            if(success) {
                System.out.println("Remaining balance:$"+useraccount.getbalance());
            }
            break;
         case 4:
            System.out.println("THANK YOU FOR USING ATM ");
            System.out.println("VISIT AGAIN");
            sc.close();
            System.exit(0);
            break;
         default:
            System.out.println("Invalid Choice");
            System.out.println("Please Select a Valid Option");    
        }
    }
 }   
}
