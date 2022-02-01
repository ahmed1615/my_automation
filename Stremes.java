package concepts;

import java.util.ArrayList;

public class Stremes {

	public static void t3ala() {
		ArrayList<String>array=new ArrayList<String>();
		array.add("ahmed");
		array.add("Almania");
		array.add("holanda");
		array.add("almold");
		long jhjhjh=array.stream().filter(s->s.toLowerCase().startsWith("a")).count();
		
		System.out.println(jhjhjh);
		
	}
	public static void main(String[] args) {
		t3ala();
		ArrayList<String>array=new ArrayList<String>();
		array.add("ahmed");
		array.add("Almania");
		array.add("holanda");
		array.add("almold");
		array.add("hi");
		for(int i=0;i<array.size();i++) {
			if(array.get(i).length()>4&&array.get(i).endsWith("a")){
				System.out.println(array.get(i));
			}
		}
		int count=0;
		for(int i=0;i<array.size();i++) {
			if(array.get(i).toLowerCase().startsWith("a")){
			count++;
			}
		}
		System.out.println("numer of 'a' in this array is " +count);
		String tata="hola como Andan";
		char[] atata=tata.toCharArray();
		for(int z = 0;z<tata.length();z++) {
			if(Character.isUpperCase(tata.charAt(z))) {
				
			}
		}
	
	}

}
