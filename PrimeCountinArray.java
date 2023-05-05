package Arrays;

public class PrimeCountinArray {
    static int primecount;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a = {2,3,4,5,7,9,11,13};
		for (int i = 0; i < a.length; i++) {
			isPrime(a[i]);
		}
		System.out.println("The Count of Prime Numbers are: "+primecount);

	}
	public static boolean isPrime(int num) {
		int count=0;
		for (int i = 1; i <=num ; i++) {
			if (num%i==0) {
				count++;
			}
			
		}
		if (count==2) {
			primecount++;
			return true;
		}
		return false;
	}
	
	

}
