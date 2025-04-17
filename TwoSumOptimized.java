package arraysAndHashing;

import java.util.HashMap;

public class TwoSumOptimized {

	public static void main(String[] args) {
		int[] input = {1,2,3,4,5};
		int sum =7;
		int[] result =twoSumHash(input,sum);
		for (int k=0; k<result.length; k++)
		{
			System.out.println(result[k]);
		}
		
	}
		

		
		static int [] twoSumHash(int nums[],int target)
		{
			HashMap <Integer,Integer> map= new HashMap<>();
			for (int i=0;i<nums.length;i++) {
				int remainder = target-nums[i];
				if(map.containsKey(remainder))
				{
					return new int[] {map.get(remainder),i};
				}
				map.put(nums[i],i);
				
			}
			return new int[] {};
			
		}
	}


