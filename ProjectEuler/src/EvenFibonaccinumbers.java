/* https://projecteuler.net/problem=2
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class EvenFibonaccinumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenFibonaccinumbers test = new EvenFibonaccinumbers();
		System.out.println(test.sumEvenFibonaccinumbers());
	}
	public int sumEvenFibonaccinumbers() {
		int totalSum=0;
		int a=1;int b=1;int c=0;
		final int LIMIT = 4_000_000;
		while(a+b<LIMIT) {
			c=a+b;
			if(c%2==0)
				totalSum+=c;
			a=b;
			b=c;
		}
		return totalSum;
	}
}
