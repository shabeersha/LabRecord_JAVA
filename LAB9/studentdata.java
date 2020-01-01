/*Create a class student with methods to read and display the student details.
  Create a derived class result with methods to read marks of 5 subjects.
  Write a java program to display the total and grade of students,
  creating objects of class result.*/

import java.util.Scanner;
class student
	{
		int no;
		int age;
		String name;

		void read_details()
		{
			Scanner input=new Scanner(System.in);

			System.out.println("Enter Reg.no:");
			no=input.nextInt();
			System.out.println("Enter Age:");
			age=input.nextInt();
			System.out.println("Enter Name:");
			name=input.next();
		}

		void print_details()
		{
			System.out.println("Name:"+name);
			System.out.println("Reg.no:"+no);
			System.out.println("Age:"+age);
		}
	}



class result extends student{
	
	int mark1;
	int mark2;
	int mark3;
	int mark4;
	int mark5;
	char grade;
	Scanner input=new Scanner(System.in);

	void read_result(){
	
		System.out.println("Enter the Mark of Sub1");
		mark1=input.nextInt();
		System.out.println("Enter the Mark of Sub2");
		mark2=input.nextInt();
		System.out.println("Enter the Mark of Sub3");
		mark3=input.nextInt();
		System.out.println("Enter the Mark of Sub4");
		mark4=input.nextInt();
		System.out.println("Enter the Mark of Sub5");
		mark5=input.nextInt();
		}
	void print_result(){

		System.out.println("Result is: \n");
		System.out.println("Sub1:"+ mark1 +"\t Sub2:"+ mark2 +"\t Sub3:"+ mark3 +"\t Sub4:"+ mark4 +"\t Sub5:"+ mark5+"\n");
		
		int totalmark= mark1+mark2+mark3+mark4+mark5;
		System.out.println("Total Mark is:"+totalmark);
		int percentage=(totalmark*100)/500;
		System.out.println("percentage is:"+percentage+"%");
		
		if(percentage>89){
			System.out.println("Grade: A");
			}
		else if(percentage>79){
			System.out.println("Grade: B");
			}
		else if(percentage>69){
			System.out.println("Grade: C");
			}
		else if(percentage>59){
			System.out.println("Grade: D");
			}
		else if(percentage>49){
			System.out.println("Grade: E");
			}
		else if(percentage>39){
			System.out.println("Grade: F");
			}
		else if(percentage<39){
			System.out.println("Grade: Failed...!");
			}
		
		
		}


	
	}




class studentdata
	{
		public static void main(String args[]) {
			result datas0=new result();
			Scanner in=new Scanner(System.in);

			while(true){
				
				System.out.println("\n \n 1.Enter Student Details \n 2.Enter The Marks Of Students \n 3.Print The Details of Student \n 4.Print The Marks of Student \n 5.Enter Student's Details + Marks \n 6.Print Student's Details + Marks \n 7.Exit \n Enter Your Choice \n");
				int ch;
				ch=in.nextInt();
				
				switch(ch){

					 case 1:datas0.read_details();
						break;
					 case 2:datas0.read_result();
						break;
					 case 3:datas0.print_details();
						break;
					 case 4:datas0.print_result();
						break;
					 case 5:datas0.read_details();
						datas0.read_result();
						break;
					 case 6:datas0.print_details();
						datas0.print_result();
						break;
					 case 7:System.exit(0);
						break;
					 default:System.out.println("Invalid Entry");
					}
				
				
				}
		}
	}