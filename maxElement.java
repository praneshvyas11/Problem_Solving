import java.util.HashMap;

public class maxElement {

	static int[] viswa ;
	static int max(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] - array[i] < 0) {
				return array[i];
			}
		}

		return array[array.length - 1];
	}

	static int majority(int[] array) {
		HashMap<Integer, Integer> haMap = new HashMap<>();
		Integer value = new Integer(0);
		for (int i = 0; i < array.length; i++) {
			value = haMap.get(array[i]);
			
			if (value == null) {
				haMap.put(array[i], 1);
			} else {
				haMap.put(array[i], value+1);
				if ( value+1 > array.length / 2 )
					return array[i];
			}

		}
		if(array.length == 1)
		{
			return array[0];
		}
		
		return -1;

	}

	public static void main(String[] args) {
		int[] input = {1};
		int output = majority(input);
		if (output == -1)
			System.out.println("NONE");
		else
			System.out.println(output);
	    
		
	}

}
