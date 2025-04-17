package arraysAndHashing;

import java.util.HashMap;

public class AnagramHash {
	
public static void main(String[] args) {
		
		String S="Listen";
		String T="Silemt";
		System.out.println(isAnagram(S,T));
		
	}
	
	    public static boolean isAnagram(String s, String t) {
	        if(s.length()!=t.length()){
	            return false;
	        }
	        HashMap <Character,Integer> map_s= new HashMap<>();
	        s=s.toLowerCase();
	        t=t.toLowerCase();
	        for(char res:s.toCharArray()){
	            map_s.put(res,map_s.getOrDefault(res,0)+1);
	        }
	        for(char res: t.toCharArray()){
	            if (!map_s.containsKey(res)){
	                return false;
	            }
	            map_s.put(res,map_s.get(res)-1);
	            if(map_s.get(res)<0){
	                return false;
	            }

	        }
	        return true;

	    }
	}


