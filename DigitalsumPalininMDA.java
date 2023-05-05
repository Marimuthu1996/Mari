package Arrays;

public class DigitalsumPalininMDA {

	public static void main(String[] args) {
		int[][]a = {{1,2,3},{2,3,4},{4,5,6}};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum+= a[i][j];
			}
		}
		System.out.println("Digital sum: "+sum);
		System.out.println("It is "+isPalindrome(sum));

	}
	
static String isPalindrome(int num) {
	String res= "Not Palindrome";
	int temp=num,rev=0;
	while (num>0) {
		rev= rev*10+(num%10);
		num/=10;
	}
	if (rev==temp) {
		res="Palindrome";
		return res;
	}
	  return res;
}

}
