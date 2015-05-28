public class singleNumber {
	public static int singleNumber(int[] nums) {
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		int arraySize = max - min+1;
		//System.out.println(arraySize);
		boolean bitArray[] = new boolean[arraySize];
		for(int i = 0 ; i < nums.length;i++)
		{
			//we will check if the current value have false
			if(bitArray[nums[i]-min] == false)
			{
			bitArray[nums[i]-min] = true;
			}
			else
			{
				bitArray[nums[i]-min] = false;
			}
		}
		
		for(int i = 0 ; i < arraySize ; i++ )
		{
			if(bitArray[i])
			{
				return i+min;
			}
		}
		
		return 0;

	}

	public static void main(String[] args) {
		{
			int[] input = { };
			System.out.println(singleNumber(input));
		}
	}

}
