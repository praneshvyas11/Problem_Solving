public class removeInstances {
	public static int removeValues(int[] nums, int element) {
		// beforeMax is the index of the element before the MAX value
		int beforeMax = nums.length - 1;
		int temp;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == element) {
				nums[i] = Integer.MAX_VALUE;
				//System.out.println(beforeMax);
				if (nums[beforeMax] != element) {
					temp = nums[beforeMax];
					nums[beforeMax] = nums[i];
					nums[i] = temp;
					beforeMax--;
				} else {
					while(nums[beforeMax] == element)
					{
					nums[beforeMax] = Integer.MAX_VALUE;
					beforeMax--;
					}
					temp = nums[beforeMax];
					nums[beforeMax] = nums[i];
					nums[i] = temp;
					beforeMax--;
				}

			}

		}
		/*for(int i = 0; i< nums.length ; i++)
		{
			System.out.print(nums[i]+ " ");
		}*/

		if (beforeMax != -1) {
			return beforeMax + 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		int[] input = {4,2,3,1,3,2,3,4,5,5,5,5,5,5,5,5,4,4,4,4,4,4};
		int element = 4;
		System.out.println(removeValues(input, element));
	}

}
