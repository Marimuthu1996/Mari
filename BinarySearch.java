package Arrays;
import java.util.Scanner;
public class BinarySearch {
	static Scanner s= new Scanner(System.in);
	static int low,mid,high;
    public static void main(String[] args) {
	int[]a= {10,20,30,40,50};
	high= a.length-1;
	System.out.println("Enter the key Element: ");
	int key= s.nextInt();
	System.out.println("The Key Element is: "+bs(a,key));
}
    public static String bs(int[]c,int key) {
    	String res= "Not Present";
    	while (high>=low) {
			mid=(low+high)/2;
			if (key==c[mid]) {
				res="present";
				break;
			}
			else if (key>c[mid]) {
				low=mid+1;
			}
			else if (key<c[mid]) {
				high=mid+1;
			}
		}
    	return res;
    }
}
