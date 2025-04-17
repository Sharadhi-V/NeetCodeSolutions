package arraysAndHashing;

public class TwoSum {

	public static void main(String[] args) {
		
		int[] input = {1,2,3,4,5};
		int sum =7;
		int[] result =twoSum(input,sum);
		for (int k=0; k<result.length; k++)
		{
			System.out.println(result[k]);
		}
		
		
	}
		    public static int[] twoSum(int[] nums, int target) {

		        for (int i= 0;i< nums.length ;i++) 
		        {
		            for (int j=i+1; j< nums.length;j++){

		                if (nums[i]+ nums[j]==target && i!=j){
		                     int[] result = {i , j};
		                     return result;
		                }		            }
		        }
		       return new  int[] {} ; 
		    }
		

}


