import java.util.Scanner;

	/*  3. Write java program to display Fibonacci series up to a limit. */

public class Fibonacci{

	public static void main(String[] args){
	
	int n,a=0,b=1,c=1;
	Scanner s= new Scanner(System.in);

	System.out.print("Please Enter Length:");
	n=s.nextInt();

	
	System.out.println("Fibonacci Series");
	if(n>0){
		System.out.print("0 ");
		 for(int i=0;i<n;i++){
			a=b;
		 	b=c;
		 	c=a+b;
		 if(a<=n){
		 System.out.print(a+" ");
		 }

		 else
		 break;

		 }
		}
	else if(n==0){
			System.out.println("0");
			}
	else{
		System.out.println("Invalid Entry");
		}

	}

}