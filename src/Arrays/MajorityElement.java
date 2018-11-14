package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {
	
	 public static int majorityElement(int[] nums) {
	        int ans = -1;
	        HashMap<Integer, Integer> hmap = new HashMap<>();
	        if(nums.length == 1)
	            return nums[0];
	        for(int i = 0;i<nums.length;i++){
	            if(hmap.containsKey(nums[i]))
	            {
	               
	                hmap.put(nums[i],hmap.get(nums[i])+1);
	                
	                if(hmap.get(nums[i]) > nums.length/2)
	                {
	                    ans = nums[i];
	                    break;
	                }
	                
	            }
	            else
	            {
	                hmap.put(nums[i],1);
	        }
	        }
	        return ans;
	        
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++)
			arr[i] = sc.nextInt();
		
		int ans = majorityElement(arr);
		System.out.println(ans);

	}

}
