import java.util.*;

/*Write java program to find the sum of the digits and reverse of a given number using class and objects.*/

public class sumandreverse{

	public static void main(String args[]){

	sumrev ob= new sumrev();
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter a number to Show Sum and Rev");
	int a=s.nextInt();

	ob.s(a);
	
	
	}
	}

class sumrev{

	void s(int s){
	int a,n=s,m=0,sum=0;
	
	do{
	a=n%10;
	m=m*10+a;
	sum=sum+a;
	n=n/10;
	}while(n>0);

	System.out.println("Reverse:"+m);
	System.out.println("Sum of digits:"+sum);
	}
	}