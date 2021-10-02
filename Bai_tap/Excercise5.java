// Question 1
package Bai_tap;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import Entity.Account;
import Entity.Department;
import Entity.Group;
import FrontEnd.Exam;

public class Excercise5 {

	public static void main(String[] args) {
		
/*	Scanner scanner = new Scanner (System.in);
		
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("PLease type " + i);
			if (scanner.hasNextInt()) {
				int x = scanner.nextInt();
			scanner.nextLine();
			}
		}
		

	}*/
}

//Question 5


		private static void createAccount(){
			
			Scanner scanner = new Scanner (System.in);	
			Account acc1 = new Account()
			System.out.println("Moi ban nhap ten account : ");
			acc1.fullName = scanner.nextLine();
			System.out.println("Moi ban nhap email cua account :  ");
			acc1.email = scanner.nextLine();
			System.out.println("Moi ban nhap userName cua account : ");
			acc1.userName = scanner.nextLine();
			System.out.println("Moi ban nhap position 1 den 4 cua account" + "1(Dev),2(Test),3(ScrumMaster),4(PM) : ");
			
			switch (scanner.nextInt(){
			
				case 1:
					Position position  = new Position();
					position.name = "DEV";
					account1.positio = position
					break;
					
				case 2:
					Position position  = new Position();
					position.name = "Test";
					account1.positio = position
					break;
					
				case 3:
					Position position  = new Position();
					position.name = "ScrumMaster";
					account1.positio = position
					break;
					
				case 4:
					Position position  = new Position();
					position.name = "PM";
					account1.positio = position
					break;
			}
					System.out.println(createAccount());
				
			}
		// Question 1						
		if(acc1.Department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		}else {System.out.println("Phòng ban của nhân viên này là "
			+ acc1.Department.name);
	  

		}			  
	 
//Question 2
		
		if(acc1.groups.length == 0){
			System.out.println("Nhân viên này chưa có group");
		}else if(acc1.groups.length == 1||acc1.groups.length == 2)
		{			
			System.out.print("Group của nhân viên này là");
			for (Group group : acc1.groups) {
				System.out.print(group.name + " ");
			}
		
			}else if(acc1.groups.length == 3) {
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			
			
		}


		
//Question 3
		System.out.println(acc1.Department == null ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban nhân viên này là: " + acc1.Department.name);
		
		
		

		
//Question 10
		Account[] IsAccount = {acc1,acc2};
		
		for (int i = 0; i < IsAccount.length; i++) {
			
		//System.out.println(IsAccount[i]);
		
			
		System.out.println("Thong tin account thu"+" " +(i+1 +" " +"la:"));
		System.out.println("Email"+" " + IsAccount[i].email);
		System.out.println("Email"+" " + IsAccount[i].fullName);
		System.out.println("Email"+" " + IsAccount[i].Department.name);
		}
		
		
//Question 11
		
		
		Department[] IsDepartment = {dep1,dep2,dep3};
		
		for (int i = 0; i < IsDepartment.length; i++) {
			
			System.out.println("Thong tin Department thu " + " " + (i+1 +" " +"la:"));
			System.out.println("ID"+ ":" + IsDepartment[i].id);
			System.out.println("Name"+ ":" + " " + IsDepartment[i].name);
			
		}
		
		
		
//Question 12
		
		for (int z = 0; z < IsDepartment.length ; z++) {
			if(z>=2) {
				break;
			}
			System.out.println("Thong tin department thu " + (z + 1) + " la:");
			System.out.println("DeptID: " + IsDepartment[z].id);
			System.out.println("DeptName: " + IsDepartment[z].name);
		}
		
//Question 13
		
		Account[] accArray2 = { acc1, acc2, acc3 };   
		for (int i = 0; i < accArray2.length; i++) 
		{    if (i != 1) {     
			System.out.println("Thông tin account thứ " + (i + 1) + " là:");     
			System.out.println("Email: " + accArray2[i].email);    
			System.out.println("Full name: " + accArray2[i].fullName);    
			System.out.println("Phòng ban: " + accArray2[i].Department.name);    }   } 
		 
			
//Question 14:
			
			for (int j = 0; j < IsAccount.length; j++) {
				if (IsAccount[j].id < 4) {
					System.out.println("------------------------------\n");
					System.out.println(IsAccount[j]);
				}
				// Question 15:In ra các số chẵn nhỏ hơn hoặc bằng 20 
				
				for (int i = 1; i <= 20; i++) {   
					if (i%2 ==0 ) {     
						System.out.print(i+ "  ");    }   } 
				
				
				
				
//Question 16: WHILE
				
				
//Question 16-10: In ra thông tin các account bao gồm: 
//Email, FullName và tên phòng ban của họ theo định dạng  		
				

				System.out.println("---------FOR Question 16- 10: In thông tin account:---------");   
				Account[] accArray1 = { acc1, acc2, acc3 };   
				int i = 0;   
				while (i < accArray1.length) {    
					System.out.println("Thông tin account thứ " + (i + 1) + " là:");   
					System.out.println("Email: " + accArray1[i].email);    
					System.out.println("Full name: " + accArray1[i].fullName);    
					System.out.println("Phòng ban: " + accArray1[i].Department.name);    i++;   } // 
				 
				
				
				
}
			
//Question 16- 15: In ra các số chẵn nhỏ hơn hoặc bằng 20 
			
			
			System.out.println("---------Question 16- 15: In ra các số chẵn nhỏ hơn hoặc bằng 20-----------");  
			int i4 = 1;   
			while (i4 <= 20) {    
				if (i4 % 2 == 0) {     
					System.out.print(i4 + "  ");    
					}    i4++;   
					
			} 
//Question 17-12: Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10 
			 
			Account[] accArray2 = { acc1, acc2, acc3 };   int i2 = 0;   do { 
				 
				   if (i2 != 1) {     
					   System.out.println("Thông tin account thứ " + (i2 + 1) + " là:");     
					   System.out.println("Email: " + accArray2[i2].email);    
					   System.out.println("Full name: " + accArray2[i2].fullName);     
					   System.out.println("Phòng ban: " + accArray2[i2].Department.name);    
					   }    i2++;   } 
				while (i2 < accArray2.length); 

			
			
//Exercise 2 (Optional): System out printf 
			
			System.out.println(     "Question 2:Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in ra số nguyên đó ");   
			int i1 = 100000000;   
			System.out.printf(Locale.US, "%,d%n", i1); 
			
			
			
//Question 3: Khai báo 1 số thực = 5,567098 
//và sử dụng lệnh System out printf để in ra số thực đó chỉ bao gồm 4 số đằng sau
			
			System.out.println("-------------Question 3:-------------");   
			float c = 5.567098f;   
			System.out.printf("%5.4f%n", c); 

			
			
//Question 5: Chỉ in ra "MM-DD" của create date trong Question 
			
			String pattern = "MM-dd";  
			simpleDateFormat = new SimpleDateFormat(pattern);   
			for (Exam exam : exams) {    
			date = simpleDateFormat.format(exam.createDate);   
			System.out.println(exam.code + ": " + date);   } 
			 
			
					
			
			
		}
