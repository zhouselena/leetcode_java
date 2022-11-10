package learningplan_binarysearch1;

public class BinarySearch_704 {
	
	public static int search(int[] nums, int target) {
        
		int left = 0;
		int right = nums.length - 1;
		
		while (left <= right) {
			
			int midpoint = (right + left)/2;
			
			if (nums[midpoint] == target) return midpoint;
			else if (nums[midpoint] > target) right = midpoint - 1;
			else if (nums[midpoint] < target) left = midpoint + 1;
			
		}
		
		return -1;
				
    }

	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 4, 5};
		int target = 5;
		
		System.out.println(search(nums,target));

	}

}
