package motaz;

public class LocalVar {
	//String name= "pub";
	private String name="bub";
	int s=78;
	
	public void test_locl_var() {
		//String name ="ahmed";
		System.out.println("the name of japonsito is "+name);
	}
	public void test_local_var2() {
		//String name= "ahmed2";
		System.out.println("the name of SC japinsito is "+name);
	}
	public void paramerarvar(int s) {
		System.out.println("hery form paramerrvar "+s);
		
	}
	
	public LocalVar test_input(String input) {
		System.out.println("this fuction for inputing anythig "+ input);
		
		return this;
	}
	
	public static void thisoneisS() {
		System.out.println("i am static one");
	}

	public static void main(String[] args) {
		LocalVar testing=new LocalVar();
		testing.test_locl_var();
		testing.test_local_var2();
		testing.paramerarvar(12);
		testing.test_input("here ANY thing ");
		testing.thisoneisS();
	}

}
