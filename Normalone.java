package ooptest;

import java.lang.reflect.Array;

public class Normalone  {
	
       
        public static void main(String[] args) {
        	String s="abcdabcd";
        	System.out.println(s);
        	System.out.println(thisone("aabbccdd"));
        	}
        
        
        public static char thisone(String m) {
			for(int i=0;i<m.length();i++) {
				if(m.indexOf(i)==m.lastIndexOf(i)) {
					return(m.charAt(i));
				}
			}
        	
        	return '_';
			
        	
        	
        }
}
        	
        
        


