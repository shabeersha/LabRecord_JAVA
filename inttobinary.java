import java.util.Scanner;

//base conversion int to Binary

public class inttobinary
{
	public static void main(String[] args) {
		
		int n,m;
		String x="";
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Number");
		n=input.nextInt();

		while(n>0)
		{
			int a=n%2;
			x=a+x;
			n=n/2;
		}
		System.out.println(x);
	}
}