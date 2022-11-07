package learningplan_binarysearch1;

public class searchinsertposition_35 {
	
	public static int searchInsert(int[] nums, int target) {
		
		int left = 0;
		int right = nums.length - 1;
		
		while (left <= right) {
			
			int midpoint = left + (right-left)/2;
			
			if (nums[midpoint] == target) {
				return midpoint;
			}
			
			else if (nums[midpoint] > target) {
				if ((midpoint <= 0) || (nums[midpoint-1] < target)) {
					return midpoint;
				}
				
				else {
					right = midpoint - 1;
				}
			}
			
			else if (nums[midpoint] < target) {
				if ((midpoint >= nums.length-1) || (nums[midpoint+1] > target)) {
					return (midpoint+1);
				}
				else {
					left = midpoint + 1;
				}
			}
			
		}
		
		return -1;
        
    }

	public static void main(String[] args) {
		
		int[] nums = {1,3,5,6};
		
		System.out.println(searchInsert(nums, 7));
		System.out.println(searchInsert(nums, 0));
		System.out.println(searchInsert(nums, 5));
		System.out.println(searchInsert(nums, 2));

	}

}
