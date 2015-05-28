public class rotateArray {
	// rotate array by the given shift

	public static void rotate(int[] nums, int k) {
		int[] newNums = new int[nums.length];
		int newPosition;
		for (int i = 0; i < nums.length; i++) {
			newPosition = (i + k) % nums.length;
			newNums[newPosition] = nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = newNums[i];
		}
	}

	public static void main(String[] args) {
		int[] input = { 1, 2 };
		rotate(input, 1);
	}

}
