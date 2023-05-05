package Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		 int[] a= {3,4,6,7,5,-8,7,8};
		 System.out.println("Before Sorting: ");
		 for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		 //System.out.print(a);
         bubblesort(a); 
         System.out.println("\n\nAfter Sorting: ");
         printbubble(a);
         
		
	}
	static void bubblesort(int []a) {
		boolean sorted=true;
		   while (sorted) {
			   for (int i = 0; i < a.length-1; i++) {
					sorted=false;
					for (int j = 0; j < a.length-i-1; j++) {
						if (a[j]>a[j+1]) {
							int temp=a[j];
							a[j]=a[j+1];
							a[j+1]=temp;
							sorted=true;
						}
					}
					
				}
		    }
			
	 	}	
		
	
	static void printbubble(int []a) {
		for (int i = 0; i < a.length; i++) {
			//System.out.println("\nAfter Sorting: ");
		    System.out.print(a[i]+" ");	
		    //System.out.println();
		}
	}
 
}
