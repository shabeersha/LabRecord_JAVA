import java.util.*;
/*Write a java program to find the volume of cube, rectangular box, cylinder using function overloading.*/

class Overload {
    double area(float l, float w, float h) {
        return l * w * h;
    }

    double area(float l) {
        return l * l * l;
    }

    double area(float r, float h) {
        return 3.1416 * r * r * h;
    }
}
public class findvolume {
    public static void main(String args[]) {
        Overload overload = new Overload();
	int choice;
	float l,r,h,w;
	Scanner s=new Scanner(System.in);


	while(true){
	
	System.out.println("\n 1.Volume of RectangleBox \n 2.Volume of Cube \n 3.Volume of Cylinder \n 4.Exit \nEnter Your Choice: \n");
	
	choice=s.nextInt();
	switch(choice){
	
	 case 1:System.out.println("Enter the Height of RectangularBox");
		h=s.nextFloat();
		System.out.println("Enter the Width of RectangularBox");
		w=s.nextFloat();
		System.out.println("Enter the length of RectangularBox");
		l=s.nextFloat();
		double rectangleBox = overload.area(l, w, h);
        	System.out.println("Area of rectangular box is " + rectangleBox);
        	System.out.println("");
		break;

		
	 case 2:System.out.println("Enter the lenght of cube");
		l=s.nextFloat();
		double cube = overload.area(l);
	        System.out.println("Area of cube is " + cube);
        	System.out.println("");
		break;


	 case 3:System.out.println("Enter the Radius of Cylinder");
		r=s.nextFloat();
		System.out.println("Enter the Height of Cylinder");
		h=s.nextFloat();
		double cylinder = overload.area(r,h);
        	System.out.println("Area of cylinder is " + cylinder);
		break;
	 case 4:System.exit(0);
	 default:System.out.println("Invalid Entry");
	}
	}











        
        
        
    }
}

