public class Primes {
	public static int countPrimes(int n) {
		boolean[] input = new boolean[ (n + 1)];
		long p = 2;
		long i = 2;
		// count the number of primes
		int count = 0;
		long startIndex = i;
		while (true) {
			// setting all the multiples of p to true
			while (p * i <= n) {
				input[(int) (p * i)] = true;
				i++;
			}
			// resetting the value of i to the next element after the current
			// one
			startIndex++;
			i = startIndex;
			// and find the next false value in input
			while (i <= n && input[(int) i]) {
				i++;
			}
			if (i > n) {
				break;
			}
			// p is the next prime to be considered
			p = i;
		}
		for (int k = 2; k < n; k++) {
			if (!input[k]) {
				// System.out.print(k + " ");
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countPrimes(19));
	}
}
