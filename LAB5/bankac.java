import java.util.*;

/*Create a class ‘Account’ to represent a bank account. Write a program to deposit and withdraw amounts from the account*/

public class bankac{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		account ob=new account();
	while(true){
		System.out.println("1.Deposite");
		System.out.println("2.Withdraw");
		System.out.println("3.Balance");
		System.out.println("4.exit");

		System.out.println("Enter Your Choice :");
		int choice=s.nextInt();
		switch(choice){
		
		case 1:ob.deposit();
			break;
		case 2:ob.withdraw();
			break;
		case 3:ob.bal();
			break;
		case 4:System.exit(0);
		default:System.out.println("Wrong Entry");
			break;

		}
	  }
	}
}



class account{

int balance;

void deposit(){
	Scanner s=new Scanner(System.in);
	int amount;
	System.out.println("Enter the amount to Deposite");
	amount=s.nextInt();
	balance=balance+amount;
	System.out.println(amount+"Rupees Deposited Into Your Account");
	System.out.println("Available Balance is "+balance);
}

void withdraw(){
	Scanner s=new Scanner(System.in);
	int amount;
	System.out.println("Enter the amount to Withdraw");
	amount=s.nextInt();
	
	if(amount>balance){
		System.out.println("Insufficient Balance.., Transaction Failed");
	}
	else{
	balance=balance-amount;
	System.out.println(amount+"Rupees Withdrawn From Your Account");
	System.out.println("Available Balance is "+balance);
	}
}

void bal(){
	System.out.println("Available Balance is "+balance);
}

}