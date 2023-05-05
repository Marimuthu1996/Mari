package Arrays;

import java.util.Arrays;

public class duplicate {
public static void main(String[] args) {
	int a[]= {21,3,44,3,21};
	int count=1;
	//sArrays.sort(a);
	System.out.println("Duplicate | count");
	for (int i = 0; i < a.length;i++) {
		count=1;
		for (int j = i+1; j < a.length; j++) {
			if (a[i]==a[j] && a[i]!=-1) {
				count++;		
				a[j]=-1;
			}
			
		}
		
		if (count>1 && a[i]!=-1 ) {
			System.out.println(a[i]+" "+"\t\t"+count );
		}
	}
	
 }
}
