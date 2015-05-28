public class happyNumber {
public static boolean isHappy(int n) {
        int digit;
        int nextNumber;
        int loop = 0;
	while(n != 1)
	{
		loop++;
		if(loop > 100)
		{
			return false;
		}
		nextNumber = 0;
		while(n >= 10)
		{
			digit = n%10;
			n = n / 10;
			nextNumber = nextNumber + digit*digit;
			
		}
		nextNumber = nextNumber + n*n;
		n = nextNumber;
	
	}
	return true;
    }
public static void main(String[] args) {
	int input = 201;
	System.out.println(isHappy(input));
}

}
