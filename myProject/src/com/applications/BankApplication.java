package com.applications;
import java.util.Scanner;
public class BankApplication {
	int accountNumber;
	String holderName;
	double balance;
	int pin;
	public BankApplication(int accountNumber, String holderName, double balance, int pin) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
		this.pin = pin;
	}

	double getBalance() {
		return balance;

	}
	public boolean validatePIN(int pin) {
	        return this.pin == pin;
	}

	void withdrawAmount(double amount) {
		if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Withdraw Successful! Remaining Balance: ₹" + balance);
        }

	}

	void deposit(double amount) {
	        if (amount <= 0) {
	            System.out.println("Invalid Deposit Amount!");
	        } else {
	            balance += amount;
	            System.out.println("Deposit Successful! Current Balance: ₹" + balance);
	        }
	 }
	void changePIN(int newPin) {
        this.pin = newPin;
        System.out.println("PIN Changed Successfully!");
	}

	void display() {
		System.out.println("User Account Number is : " + accountNumber);
		System.out.println("Holder Name : " + holderName);
		System.out.println("Account Balance : " + balance);
		System.out.println("User PIN : " + pin);
	}
//	static BankApplication s1 = new BankApplication(11234, "Ratna", 5000.00, 5432);
//	static BankApplication s2 = new BankApplication(56789, "Ramya", 6000.00, 6432);
//	static BankApplication s3 = new BankApplication(11234, "Rupa", 7000.00, 7432);
//	static BankApplication[] a = { s1, s2, s3 };
	public static void main(String[] args) {
		System.out.println("========== Welcome to ATM ==========");
		Scanner sc=new Scanner(System.in);
		BankApplication[] users = {
	                new BankApplication(11234, "Ratna", 5000.00, 5432),
	                new BankApplication(56789, "Ramya", 6000.00, 6432),
	                new BankApplication(81234, "Rupa", 7000.00, 7432)
	    };
		BankApplication currentUser = null;
        while (currentUser == null) {
            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();
            for (BankApplication s : users) {
                if (s.validatePIN(pin)) {
                	System.out.println("PIN Matched ");
                    currentUser = s;
                    break;
                }
            }

            if (currentUser == null) {
                System.out.println("Invalid PIN! Please Enter Correct PIN .\n");
            }
        }

        System.out.println("Login Successful!");
        currentUser.display();
        while (true) {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("Press 1--> Check Balance");
            System.out.println("Press 2--> Withdraw Amount");
            System.out.println("Press 3--> Deposit Amount");
            System.out.println("Press 4--> Change PIN");
            System.out.println("Press 5--> Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

            case 1:{
                System.out.println("Your Current Balance: " + currentUser.getBalance());
                break;
            }

            case 2:{
                System.out.print("Enter Withdraw Amount: ");
                double withDrawAmount = sc.nextDouble();
                currentUser.withdrawAmount(withDrawAmount);
                break;
            }

            case 3:{
                System.out.print("Enter Deposit Amount: ");
                double amount = sc.nextDouble();
                currentUser.deposit(amount);
                break;
            }
            case 4:{
                System.out.print("Enter New PIN: ");
                int newPin = sc.nextInt();//8796
                currentUser.changePIN(newPin);
                break;
            }
            case 5:{
                System.out.println("Thank you for using our ATM. Visit Again!");
                //System.exit(0);
            }
            default:
                System.out.println("Invalid Choice! Try Again.");
            }
        }


//		for (BankApplication s : a) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter your PIN : ");
//			int pin = sc.nextInt();
//			if (pin == s1.pin) {
//				System.out.println("PIN Matched ");
//				s1.display();
//				System.out.println("Enter Your Choice ");
//				System.out.println("Press 1 --> To Check Balance  ");
//				System.out.println("Press 2--> To WithDraw Amount  ");
//				System.out.println("Press 3--> Deposite Amount  ");
//				System.out.println("Press 4--> Change PIN ");
//				int choice = sc.nextInt();
//				switch (choice) {
//				case 1:{
//					System.out.println("Your Balance: " + checkBalance());
//		            break;
//				}
//					
//				case 2: {
//					System.out.println("Enter Withdraw Amount : ");
//					int amount = sc.nextInt();
//					withdrawAmount(amount);
//					break;
//				}
//				case 3: {
//					System.out.println("Enter Deposit Amount : ");
//					double depositAmount = sc.nextInt();
//					deposit(depositAmount);
//					break;
//				}
//				case 4: {
//					System.out.println("Want to Change PIN ");
//					changePIN();
//					break;
//				}
//				}
//
//			} else {
//				System.out.println("Invalid PIN  , Please Enter Correct PIN ... !");
//			}
//		}

	}


}
