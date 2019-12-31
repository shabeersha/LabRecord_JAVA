import java.util.*;

/*16. Write a program to count and display total number 
of objects created to a class (Hint: static members).*/

class data{
int a;
int b;
static int count=0;

data(){
count++;
}

void inita(){
a=10;
b=20;
}

void initb(){
a=20;
b=30;
}

void obcount(){
System.out.println("Number of Objects Created is :"+count);
}


}




public class objectcounter{

	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		data ob=new data();
		int ch;
		

		while(true)
		{
			System.out.println(" 1.Create new object \n 2.Print the number of object \n 3.exit \n Enter your choice");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:data ob1=new data();
				break;
				case 2:ob.obcount();
				break;
				case 3:System.exit(0);
				break;
				default:System.out.println("Invaild Entry");
			}
		
		
		}
		
}
}
