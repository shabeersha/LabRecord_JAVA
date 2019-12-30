import java.util.*;

/*Write a program to merge two arrays. - LAB3*/

public class mergearray{
	public static void main(String args[]) {
	
	int n1,n2,count=0;
	Scanner s=new Scanner(System.in);
      	
	System.out.println("Enter size for first array..");
	n1=s.nextInt();
	int[] a1=new int[n1];

	System.out.println("Enter the numbers into first array");
	
	for(int i=0;i<n1;i++){
		a1[i]=s.nextInt();
	}
	
	System.out.println("Enter size for 2nd array..");
	n2=s.nextInt();
	int[] a2=new int[n2];

	System.out.println("Enter the numbers into 2nd array");
	
	for(int i=0;i<n2;i++){
		a2[i]=s.nextInt();
	}

	int[] c=new int[n1+n2];

	for(int i=0;i<n1;i++){
		c[i]=a1[i];
		count++;
	}

	System.out.println("Merged Array is:");
	for(int i=0;i<n2;i++){
	c[count++]= a2[i];
	}

	for(int i=0;i<n1+n2;i++){
	System.out.println(c[i]);
	}
   }
}