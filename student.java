import java.util.Scanner;
class studentdata
	{
		int no;
		int age;
		char grade;

		void read()
		{
			Scanner input=new Scanner(System.in);

			System.out.println("Enter No:");
			no=input.nextInt();
			System.out.println("Enter Age:");
			age=input.nextInt();
			System.out.println("Enter Grade");
			grade=input.next().charAt(0);
		}

		void print()
		{
			System.out.println("No:"+no);
			System.out.println("Age:"+age);
			System.out.println("Grade:"+grade);
		}
	}

class student
	{
		public static void main(String args[]) {
			studentdata datas0=new studentdata();

			datas0.read();
			datas0.print();
		}
	}