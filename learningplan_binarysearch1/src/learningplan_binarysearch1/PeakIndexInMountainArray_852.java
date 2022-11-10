package learningplan_binarysearch1;

public class PeakIndexInMountainArray_852 {
	
	public static int peakIndexInMountainArray(int[] arr) {
		
		int peak = -1;
		
		for (int i = 1; i < arr.length-1; i++) {
			
			if ((arr[i-1] < arr[i]) && (arr[i+1] < arr[i])) {
				peak = i;
				break;
			}
			
		}
		
		return peak;
        
    }

	public static void main(String[] args) {
		
		int[] mountain = {0,2,1,0};
		System.out.println(peakIndexInMountainArray(mountain));

	}

}
