package learningplan_binarysearch1;

public class ValidPerfectSquare_367 {
	
	public static boolean isPerfectSquare(int num) {
		
		int left = 1;
		int right = num;
		
		while (left <= right) {
			
			if ((num % left == 0) && (left == right)) {
				return true;
			}
			
			left += 1;
			right = num/left;
			
		}
		
		return false;
        
    }

	public static void main(String[] args) {
		
		System.out.println(isPerfectSquare(169));

	}

}
