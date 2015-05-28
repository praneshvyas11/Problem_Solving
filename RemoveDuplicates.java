public class RemoveDuplicates {
	public static int removeDuplicates(int[] nums) {
		// prevMaxIndex keeps track of first index with value MAX
		// we use this to place the element at its right place
		int prevMaxIndex = 0;
		// curMaxIndex is used to keep track of the first element that is
		// set to MAX for the duplicates of an element
		int curMaxIndex = 0;
		int temp = 0;
		int nextI = 0;
		boolean match;
		for (int i = 0; i < nums.length; i++) {
			match = false;
			// while parsing the input array if the element is max then skip
			// remaining loop
			if (nums[i] == Integer.MAX_VALUE) {
				continue;
			}
			// else if it is not max ,mark every matching element with max
			// and for the first value set flag match and mark that index as
			// curMaxIndex
			for (int j = i + 1; j < nums.length && nums[i] == nums[j]; j++) {
				nums[j] = Integer.MAX_VALUE;
				if (!match) {
					curMaxIndex = j;
					match = true;
				}
				nextI = j + 1;
			}
			// after marking all the duplicates of a number we will keep
			// array[i]
			// in its right place by swapping array[i] with array[prevMaxIndex]
			// increment the prevMaxIndex when both prevMaxIndex and curMaxIndex
			// match
			// increment that as well .
			if (prevMaxIndex != 0) {
				temp = nums[i];
				nums[i] = nums[prevMaxIndex];
				nums[prevMaxIndex] = temp;
				prevMaxIndex++;
				if (prevMaxIndex == curMaxIndex) {
					curMaxIndex++;
				}
			} else {
				prevMaxIndex = curMaxIndex;
			}
		}
		if (prevMaxIndex != 0) {
			return prevMaxIndex;
		} else {
			return nums.length;
		}
	}

	public static void main(String[] args) {
		int[] input = { 3, 3, 4, 4, 5, 5, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7,
				7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 12, 12, 12, 12, 12, 12,
				4545, 4545, 4545 };
		System.out.println(removeDuplicates(input));
	}
}
