package learningplan_binarysearch1;

public class GuessNumberHigherOrLower_374 {
	
	private static int N=6;
	
	private static int guess(int guess) {
		
		if (guess == N)
			return 0;
		if (guess > N)
			return -1;
		if (guess < N)
			return 1;
		
		return -2;
		
	}
	
	public static int guessNumber(int n) {
		
		int left = 1;
		int right = n;
		
		while (left <= right) {
	    	
			int mid = left + (right-left)/2; // typically same as left+right, this prevents overflow of 32-bit
	    	int is_correct = guess(mid);
	    	
	    	if (is_correct == 0) return mid;
	    	if (is_correct == 1) left = mid + 1;
	    	if (is_correct == -1) right = mid - 1;
	    	
	    }
		
		return -1;
	    
	}
	
	public static void main(String[] args) {
		
		System.out.println(guessNumber(10));
	
	}

}
