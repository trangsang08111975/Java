package Theory;

public class Demo2 {

	public static void main(String[] args) {
		gotoSchool();
		
		int x = getNumber();
		System.out.println(x);
		
		int tong = tinhtong(5,10);
		System.out.println(tong);

	}

	private static void gotoSchool() {
		System.out.println("gotoSchool");
		
	}
	
	private static int getNumber() {
		System.out.println("getNumber");
		return 5;
		
	}
	
	private static int tinhtong(int x, int y) {
		
		return x + y;
		
	}

}
