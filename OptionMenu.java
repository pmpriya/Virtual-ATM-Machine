import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class OptionMenu {
    // Main Class
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$ ' ###,##0.00");

    HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();
    int username = 0;
    int pin = 0;
    double checkingBalance = 0;
    double savingsBalance = 0;

    int setCustomerNumber(int username) {
        this.username = username;
        return username;
    }

    int getCustomerNumber() {
        return username;
    }

    int setPinNumber(int pin){
        this.pin = pin;
        return pin;
    }
 
    int getPinNumber() {
        return pin;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public double calcCheckingWithdraw(double amount) {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    public double calcSavingsWithdraw(double amount) {
        savingsBalance = (savingsBalance - amount);
        return savingsBalance;
    }

    public double calcCheckingDeposit(double amount) {
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    public double calcSavingsDeposit(double amount) {
        savingsBalance = (savingsBalance + amount);
        return savingsBalance;
    }

 
    public void getLogin() throws IOException {
        int x = 1;
        do {
            try {
                data.put(97910134,1234);

                System.out.println("welcome to ATM Machine");
                System.out.println("Please enter Username: ");
                setCustomerNumber(menuInput.nextInt());

                System.out.println("Enter Pin");
                setPinNumber(menuInput.nextInt());
            } catch(Exception e) {
                System.out.println("\n" + "Invalid username/pin");
                x = 2;
            }
            // checking if data exists in the hashmap
            for(Entry<Integer, Integer> entry: data.entrySet()){
                if(entry.getKey()== getCustomerNumber() && entry.getValue()== getPinNumber())
                    getAccountType();
            } 
            System.out.println("Wrong username or password");
        } while(x == 1);
    } 
     
    public void getAccountType() {
        System.out.println("Select the account U want to access ");
        System.out.println(" 1: Check Balance ");
        System.out.println(" 2: Savings Account ");

        int selection = menuInput.nextInt();

        switch(selection) {
            case 1: 
                getChecking();
                break;

            case 2:
                getSavings();
                break;

            case 3:
                System.out.println("Thank you for using ATM bye!");
                break;
            
            default:
                System.out.println("Invalid Choice");
                getAccountType();
        }
    }

    public void getChecking() {
        System.out.println("Checking Account : ");
        System.out.println("Type 1 : View Balance");
        System.out.println("Type 2 : Withdraw Funds");
        System.out.println("Type 3 : Deposit Funds");

        int option = menuInput.nextInt();

        switch(option) {
            case 1:
                // System.out.println("Checking account balance: " + moneyFormat.format(getChecking()));
                getAccountType();
                break;
            case 2:
                // getCheckingWithdraw();
                getAccountType();
                break;
            case 3:
                // getCheckingDeposit();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using ATM bye!");
                break;
                
            default:
                System.out.println("Invalid Choice");
                getAccountType();
        }
    }

    public void getSavings() {
        System.out.println("Savings Account : ");
        System.out.println("Type 1 : View Balance");
        System.out.println("Type 2 : Withdraw Funds");
        System.out.println("Type 3 : Deposit Funds");

        int select = menuInput.nextInt();

        switch(select) {
            case 1:
              //  System.out.println("Checking Savings balance: " + moneyFormat.format(getChecking()));
                getAccountType();
                break;

            case 2:
                //getSavingsWithdraw();
                getAccountType();
                break;

            case 3:
                //getSavingsDeposit();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using ATM bye!");
                break;
                
            default:
                System.out.println("Invalid Choice");
                getAccountType();
        }
        
    }
}
 