package motaz;

public class EnglishCourse {
	int studentds;
	int weeks;
	int days;
	

	public static void main(String[] args) {
		EnglishCourse eng=new EnglishCourse();
		int totaldays;
		eng.studentds=10;
		eng.weeks=4;
		eng.days=3;
		totaldays=eng.weeks*eng.days;	
		System.out.println("english course is a total of "+ totaldays+ " days");
		for(int i=0;i<100;i++) {
			System.out.println("SACA EL BLOQUE PORFA");
		}
	}
	
		

}
