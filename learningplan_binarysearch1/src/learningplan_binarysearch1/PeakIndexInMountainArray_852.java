package learningplan_binarysearch1;

public class PeakIndexInMountainArray_852 {
	
	public static int peakIndexInMountainArray(int[] arr) {
		
		int low = 1;
		int high = arr.length-1;
		int mid;
		
		while (low <= high) {
			
			mid = (low + high) / 2;
			
			if ((arr[mid-1] < arr[mid]) && (arr[mid+1] < arr[mid])){ // if mid is the peak
				return mid;
			}
			
			else if ((arr[mid-1] < arr[mid]) && (arr[mid] < arr[mid+1])) { // otherwise if still climbing up mountain
				low = mid+1;
			}
			else { // otherwise peak is on left of mid, passed peak
				high = mid-1;
			}
			
		}
		
		return -1; // didn't find peak
        
    }

	public static void main(String[] args) {
		
		int[] mountain = {0,2,1,0};
		System.out.println(peakIndexInMountainArray(mountain));

	}

}
