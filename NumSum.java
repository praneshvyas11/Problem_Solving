public class NumSum {
	 // find the numbers in the array that sum to the given number
	static int[] getNum(int[] numArray, int num) {
		int[] output = { 0, 0 };
		for (int i = 0; i < numArray.length; i++) {
			for (int j = i + 1; j < numArray.length; j++) {

				if (numArray[i] + numArray[j] == num) {
					output[0] = numArray[i];
					output[1] = numArray[j];
					return output;
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int[] input = {1,0,3,4,11,6,7,0,4};
		int num = 9;
		int[] output = getNum(input , num);
		System.out.println(output[0] + " " + output[1]);

	}
}
