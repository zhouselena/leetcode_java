package learningplan_binarysearch1;

public class ValidPerfectSquare_367 {
	
	public static boolean isPerfectSquare(int num) {
		
		if (num == 1)
			return true;
		
		long left = 1;
		long right = num/2;
		
		while (left <= right) {
			
			long midpoint = left+(right-left)/2;
			
			if (midpoint*midpoint == num) {
				return true;
			}
			if (midpoint*midpoint > num) {
				right = midpoint - 1;
			}
			if (midpoint*midpoint < num) {
				left = midpoint + 1;
			}
			
		}
		
		return false;
        
    }

	public static void main(String[] args) {
		
		System.out.println(isPerfectSquare(2000105819));

	}

}
