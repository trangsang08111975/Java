
public class program1 {
// Exercise 1: (Optional): Datatype Casting 
/* Question 1:Khai báo 2 số lương có kiểu dữ liệu là float. 
	Khởi tạo Lương của Account 1 là 5240.5 $ 
	Khởi tạo Lương của Account 2 là 10970.055$ 
	Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra 
	Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra 
	
		
*/
	
	float Salary1; 
	float Salary2; 
	Salary1 = (float) 5240.5; 
	Salary2 = (float) 10970.055; 
	System.out.println("Salary1: " + Salary1 + "||  Salary2: " + Salary2); 
	
	int roundSalary1 = (int) Salary1; 
	int roundSalary2 = (int) Salary2; 
	System.out.println("roundSalary1: " + roundSalary1 + " ||  roundSalary2: " + roundSalary2); 
	
	
/* Question 2: Lấy ngẫu nhiên 1 số có 5 chữ số 
 * (những số dưới 5 chữ số thì sẽ thêm có số 0 ở đầu cho đủ 5 chữ số) 	
 */
	
	int min = 0;
	int max = 99999;
	int a = (int) (Math.random() * max) + min; 
	while (a < 10000) { a = a * 10; } 
	System.out.println("Số ngẫu nhiên: " + a); 
	
	
/*Question 3: 
 * Lấy 2 số cuối của số ở Question 2 và in ra. 
 * Gợi ý: 
 * Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối 
 * Cách 2: chia lấy dư số đó cho 100 
 */
	
	int min = 0;
	int max = 99999;
	int a = (int) (Math.random() * max) + min;
	while (a < 10000) {
	a = a * 10;}
	
	System.out.println("Số ngẫu nhiên: " + a); 
	String b = String.valueOf(a); 
	System.out.println("Hai số cuối: " + b.substring(3)); 
	
	
/*Question 4: Viết 1 method nhập vào 2 
 * số nguyên a và b và trả về thương của chúng 
 * 
 */
	question4(); 
	public static void question4() {
		
		int a, b; 
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Nhập a = "); 
		a = scanner.nextInt(); 
		do { 
			System.out.println("Nhập b = "); 
			b = scanner.nextInt();
			if (b == 0) { 
			System.out.println("Vui lòng nhập b khác 0 !");
		}
		} while (b == 0);
		  scanner.close();
		  System.out.println("Thương: " + (float) a / (float) b); 
	}
	
/*Exercise 2 (Optional): Default value 
 *Question 1: Không sử dụng data đã insert từ bài trước,
 * tạo 1 array Account và khởi tạo 5 phần tử theo cú pháp 
 * (sử dụng vòng for để khởi tạo): 
 * 	
 */
	private static void question1() {
		
		Account[] accArray = new Account[5]; 
		for (int i = 0; i < accArray.length; i++{
			Account acc = new Account();    
			acc.email = "Email " + i;   
			acc.userName = "User name " + i;   
			acc.fullName = "Full name " + i;   
			acc.createDate = LocalDate.now();   
			accArray[i] = acc;   
			System.out.println( "Thông tin Account " + i 
					+ " Email: " + accArray[i].email 
					+ " UserName: " + accArray[i].userName        
					+ " FullName: " + accArray[i].fullName 
					+ " CreateDate: " + accArray[i].createDate); 
			
		}
	}
	
/* Exercise 3(Optional): Boxing & Unboxing 
 * 	Question 1: Question 1: Khởi tạo lương có datatype 
 * là Integer có giá trị bằng 5000. 
 * Sau đó convert lương ra float và 
 * hiển thị lương lên màn hình (với số float có 2 số sau dấu thập phân)  
 */
	
	private static void question1() {
		Integer salary = 5000; 
		System.out.printf("%2.2f", (float) salary); 
		
	
	}
	
	private static void Question2() {
		String s = "1234567"; 
		int i = Integer.parseInt(s); 
		System.out.println(i);
	}
	private static void Question3() {
		Integer i = 1234567; 
		int i1 = i.intValue(); 
		System.out.println(i1);
		}

	
	/*Excercise 4: string
	 * 
	 */
	public static void question2() {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in); 
		System.out.println("Nhập vào chuỗi 1: ");
		String s1 = sc1.next();
		System.out.println("Nhập vào chuỗi 2: ");
		String s2 = sc1.next(); 
		System.out.println("Kết quả sau khi nối chuỗi: " + s1 + " " + s2);   
		sc1.close();
		
	public static void question3() {
		Scanner scanner = new Scanner(System.in); 
		String name;
		System.out.println("Nhập Tên: ");
		name = scanner.nextLine();
		String firstCharacter = name.substring(0, 1).toUpperCase(); 
		String leftCharacter = name.substring(1);
		System.out.println("char at:"+ name.charAt(1)); 
		name = firstCharacter + leftCharacter;
		System.out.println(name); 
		scanner.close();
		
		
	public static void question4() {
		String name;
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Nhập tên: ");
		name = scanner.nextLine();
		name = name.toUpperCase()
		for (int i = 0; i < name.length(); i++) {
			System.out.println("Ký tự thứ " + i + " là: " + name.charAt(i)); 
		}
			
			
		}
		scanner.close();
	}
	
	public static void question5() {
		Scanner scanner = new Scanner(System.in);  
		System.out.println("Nhập họ: ");   
		String firstName = scanner.nextLine();  
		System.out.println("Nhập tên: ");   
		String lastName = scanner.nextLine();   
		System.out.println("Họ tên đầy đủ: " + firstName.concat(lastName));   
		scanner.close();  
	}
	
		
	}
	
	

