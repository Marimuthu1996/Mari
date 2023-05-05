package Arrays;
import java.util.Scanner;
public class Evenelemsum {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Size of Array: ");
	int[]a= new int[s.nextInt()];
	int sum=0;
	for (int i = 0; i < a.length; i++) {
		System.out.println("Enter the Elements in a["+i+"]");
		a[i]=s.nextInt();
	}
    for (int i = 0; i < a.length; i++) {
	    if (a[i]%2==0) {
			System.out.println("Even elements are: "+a[i]);
			sum+=a[i];
		}	
	 
	}
    System.out.println("The Sum of the Even Elements are: "+sum);
 }
}
