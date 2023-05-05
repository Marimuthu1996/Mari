package Arrays;
import java.util.Scanner;
public class nthTimes {
	
  public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	int[]a= {21,22,23,24,25};
	int first =0;
	System.out.println("Before Rotation");
	System.out.println("21,22,23,24,25");
	System.out.println("Enter the N value: ");
	int n= s.nextInt();
	System.out.println("After Rotation: ");
	for (int i = 0; i <n; i++) {
		first=a[0];
		for (int j = 0; j < a.length-1; j++) {
			a[i]=a[i+1];
		}
		a[a.length-1]=first;
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println("a["+i+"]-"+a[i]);
	}
	
}
}
