package Theory;

import java.util.Scanner;

public class Theory1 {

	public static void main(String[] args) {
		int test = 10;
		System.out.println(test == 10 ?	"test = 10" : "test !=10");
		
	//	for(int i = 1; i < 20; i = i + 2) {
	//		System.out.println(i);
	//		System.out.println("Lần lặp thứ :" + i );
			
			
	//	int[] points = {1,2,3,5,7,9};
		
	//	for (int i1 : points) {
	//		System.out.println(i1);
			
	//	int i1 = 1;
	//	while (i1 < 10) {
		//	System.out.println(i1);
		//	i1 ++;
			
		//}
		int i3 =1;
		do {
			i3 ++;
			System.out.println(i3);
			
		} while (i3<10);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Moi nguoi dung nhap vao 1 so");
		if(scanner.hasNextInt()) {
		int name = scanner.nextInt();
		System.out.println(name);
		
		}
	}
}
			
		




