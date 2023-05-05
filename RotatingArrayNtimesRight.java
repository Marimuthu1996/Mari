package Arrays;
import java.util.*;
public class RotatingArrayNtimesRight {
     static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int[]b= {21,23,35,36,39};
		System.out.println("before rotation: ");
        System.out.println("21,23,35,36,39");
        System.out.println("Enter the N value:");
        int num=s.nextInt();
        // Rotating Array N times in Array
        for (int i = 0; i < num; i++) {
        	int last;
        	last =b[b.length-1];
			for (int j = b.length-1; j >0; j-- ){
				b[j]=b[j-1];
				}
			b[0]=last;
		}
        System.out.println();
        
        System.out.println("After Rotation: ");
        for (int i = 0; i < b.length; i++) {
			System.out.println("b["+i+"]-"+b[i]);
		}
        
         
  }
}	
