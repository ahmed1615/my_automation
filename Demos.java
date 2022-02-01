package concepts;

public class Demos {
	
	public static void main(String args[]) {
		Car bmw=new Car();
		bmw.increaseSpeed();
		Car con2=new Car(30,"hola","red");
		System.out.println(con2.getColor());
		String hey="hello world";
		System.out.println(hey);
		String revese="";
		for(int i=hey.length()-1;i>=0;i--) {
			
			System.out.print(hey.charAt(i));
		}
		
	}
}
