public class Solution {

	public static int eulerProblem1(int num) {
		int sum = 0;

		for (int i = 0; i < num; i++) {
			if (i % 15 == 0) {
				sum += i;
			} else if (i % 5 == 0) {
				sum += i;
			} else if (i % 3 == 0) {
				sum += i;
			}
		}

		return sum;
	}

	public static int eulerProblem2(int num) {
		int sum = 0;

		int x = 0, y = 1, z = 1;

		while (z < num) {
			x = y;
			y = z;
			z = x + y;
			// System.out.println("z:"+z);
			if (z % 2 == 0)
				sum += z;
		}

		return sum;
	}

	public static boolean isPalindrome(int num) {
		int reverse = 0;
		int originalNumber = num;

		while (num != 0) {
			reverse = reverse * 10 + num % 10;
			num /= 10;
		}

		return (reverse == originalNumber);
	}

	public static int eulerProblem3(int num1, int num2) {
		int max = 0;
		for (int i = num1; i < 1000; i++)
			for (int j = num2; j < 1000; j++) {
				int product = i * j;
				if (isPalindrome(product)) {
					if (product > max)
						max = product;
				}
			}
		return max;
	}

	public static double eulerProblem6(int num) {
		double result = 0;
		int sumOfSquares = 0;

		double sum = num * (num + 1) / 2;

		result = sum * sum - num * (num + 1) * (2 * num + 1) / 6;
		return result;
	}

	public static int eulerProblem5() {
		int number = 1;
		int count = 1;

		while (number <= 2520) {
			System.out.println("number - :" + number);
			for (int i = 1; i <= 10; i++) {
				if (number % i != 0) {
					continue;
				} else {
					count++;
				}
			}

			if (count == 10)
				return number;
			else
				number++;
		}
		return count;
	}

	public static int eulerProblem16(int number, int power) {

		System.out.println(Math.pow(number, power));
		double sum = Math.pow(number, power);
		int summ = 0;
		/*
		 * while (sum != 0) { summ+= sum%10; sum = sum/10; }
		 * 
		 */
		String digits = new Double(sum).toString();

		for (char c : digits.toCharArray())
			sum += c - '0';

		System.out.println("summ = " + sum);

		return 0;
	}
	
	//euler 10
	 public static int countPrimes(int n) {
	       
	       int numOfPrimes = 0;
	       
	       boolean[] isPrime = new boolean[n+1];
	       
	       for (int i=2; i<=n; i++) {
	           isPrime[i] = true;
	       }
	       
	       for (int i=2; i*i <= n; i++) {
	           if (isPrime[i]) {
	               for (int j=i; i*j <= n; j++) {
	                   isPrime[i*j]=false;
	               }
	           }
	       }
	       
	       for (int i=2; i <= n; i++) {
	           if(isPrime[i])
	               numOfPrimes++;
	       }
	       
	       return numOfPrimes;
	   }

	public static void main(String[] args) {

	}

}