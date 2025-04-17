package arraysAndHashing;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String S="Listen";
		String T="Silent";
		System.out.println(isAnagram(S,T));
		
	}
		
		
		    public static boolean isAnagram(String s, String t) {
		        if(s.length()!=t.length()){
		            return false;
		        }
		        s=s.toLowerCase();
		        t=t.toLowerCase();
		        char a[]=s.toCharArray();
		        char b[]=t.toCharArray();
		         Arrays.sort(a);
		         Arrays.sort(b);
		      return Arrays.equals(a,b);
		        
		            }
		

	

}
