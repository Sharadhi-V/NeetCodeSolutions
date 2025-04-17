package arraysAndHashing;

import java.util.HashSet;

public class HasDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {1,2,3,4,5,1};
		boolean result= hasDuplicate(input);
		System.out.println(result);

	}

	    public static  boolean hasDuplicate(int[] nums) {

	    HashSet <Integer> set = new HashSet<>();
	    for(int i : nums){
	        if(set.add(i)==false)
	        {
	            return true;
	        }
	        
	    }
	      return false;
	    }
	


}
