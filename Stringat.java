package java_demo;

public class Stringat {

	public static void main(String[] args) {
		String[] hey="hello hello i am java java for loop if loop".split(" "); 
		for(int i=0;i<hey.length;i++) {
			for(int s=0; s<hey.length;s++) {
				
					System.out.println("the number of "+hey[i]+" ="+i);
				
			}
		}

	}

}
