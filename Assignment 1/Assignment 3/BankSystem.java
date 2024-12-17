import java.util.Scanner;

//Custom Exception for Insufficient Funds
class InsufficientFundsException extends Exception {
//Constructor for the exception with a custom message
    public InsufficientFundsException(String message) {
        super(message);
    }
}

//Class name
class BankAccount {
    private String accountHolderName;
    private String accountNumber; 
    private String ifscCode; 
    private String bankName;
    private double balance; 

//Constructor for initializing account with all detail
    public BankAccount(String accountHolderName, String accountNumber, String ifscCode, String bankName, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.bankName = bankName;
        this.balance = balance;
    }

//Getters for account details
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public String getBankName() {
        return bankName;
    }

//Deposit method to add money to the account
    public void deposit(double amount) throws IllegalArgumentException {
//Check if the deposit amount is valid.
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative.");
        }
//Add deposit amount to balance
        balance += amount; 
        System.out.println("Successfully deposited: " + amount);
    }

//Withdraw method to remove money from the account
    public void withdraw(double amount) throws InsufficientFundsException, IllegalArgumentException {
//Check if the withdrawal amount is valid
        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
        }
//Check if the account has enough balance for the withdrawal
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance. Available balance: " + balance);
        }
//Deduct the withdrawal amount from balance        
        balance -= amount; 
        System.out.println("Successfully withdrawn: " + amount);
    }
//Method to check the current balance
    public double checkBalance() {
        return balance;
    }
}

public class BankSystem {
    public static void main(String[] args) {
//Scanner for user input
        Scanner scanner = new Scanner(System.in);
//Create an account with all details: holder name, account number, IFSC code, bank name, and initial balance
        BankAccount account = new BankAccount("Taffazul Ansari", "1234567890", "SBIN0000123", "State Bank of India", 0.0);

//Infinite loop for the bank system menu
        while (true) { 
            System.out.println("\n--- Banking System ---");
            System.out.println("Account Holder: " + account.getAccountHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Bank Name: " + account.getBankName());
            System.out.println("IFSC Code: " + account.getIfscCode());
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                //Parse the user's choice from input
                int choice = Integer.parseInt(scanner.nextLine());

                //Switch case to handle user options
                switch (choice) {
                     //Deposit option
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = Double.parseDouble(scanner.nextLine());//Read the deposit amount
                        //Call deposit method
                        account.deposit(depositAmount); 
                        break;
                     //Withdraw option
                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                         //Read the withdrawal amount
                        double withdrawAmount = Double.parseDouble(scanner.nextLine());
                        account.withdraw(withdrawAmount);//Call withdraw method
                        break;

                    case 3:
                        System.out.println("Current balance: " + account.checkBalance());
                        break;
                    //Exit option
                    case 4: 
                        System.out.println("Exiting... Thank you for banking with us!");
                        scanner.close();//Close the scanner resource
                        return;//Exit the program

                    default:
                        //Handle invalid choice
                        System.out.println("Invalid choice. Please select a valid option."); 
                }
                //Catch invalid numeric input
            } catch (NumberFormatException e) { 
                System.out.println("Invalid input. Please enter a numeric value.");
            } catch (IllegalArgumentException e) { //catch invalid argument exception.
                System.out.println("Error: " + e.getMessage());
            } catch (InsufficientFundsException e) { //catch insufficient funds exception
                System.out.println("Error: " + e.getMessage());
            } finally {
                //This block runs after each operation,regardless of success or failure
                System.out.println("Operation complete.");
            }
        }
    }
}
