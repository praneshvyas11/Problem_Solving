public class plusOne {

	public static int[] plusOne(int[] digits) {
		int[] newNumber;
		newNumber = new int[digits.length + 1];
		int i = digits.length - 1;
		int carryOver = 1;
		while (i >= 0) {
			if (digits[i] + carryOver <= 9) {
				newNumber[i + 1] = digits[i] + carryOver;
				carryOver = 0;
			} else {
				newNumber[i + 1] = 0;
				carryOver = 1;
			}
			i--;
		}
		if (carryOver == 1) {
			newNumber[0] = 1;
		} else {
		for (int k = 1; k < newNumber.length; k++) {
				digits[k - 1] = newNumber[k];
			}
		}
		if (carryOver == 1) {
			return newNumber;
		} else {
			return digits;
		}
	}
	public static void main(String[] args) {
		int[] digits = {};
		int[] output;
		output = plusOne(digits);
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}

}
