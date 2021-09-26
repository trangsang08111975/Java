package FrontEnd;
import java.time.LocalDate; 


	
import Entity.Account; 
import Entity.Department; 
import Entity.Group; 
import Entity.Position; 
import Entity.Position.PositionName; 
import Entity.Question;
	import Entity.TypeQuestion;

	public class Program {
		public static void main(String[] args, Department dep1) { 
			
//      Tao Account 
			Account acc1 = new Account(); 
					acc1.id = 1;
					acc1.email = "Manh1";   
					acc1.userName = "MANH1";   
					acc1.fullName = "Manh Nguyen 1";   
					acc1.Department = dep1;   
					acc1.Position = pos1;   
					acc1.createDate = LocalDate.now();   
					Group[] groupAcc1 = { group1, group2 };   
					acc1.groups = groupAcc1; 
					
					Account acc2 = new Account();   
					acc2.id = 2;   
					acc2.email = "Manh2";  
					acc2.userName = "MANH2";  
					acc2.fullName = "Manh Nguyen 2";  
					acc2.Department = dep2;   
					acc2.position = pos2; 
					acc2.createDate = LocalDate.of(2021, 03, 17);  
					
					acc2.groups = new Group[] { group3, group2 }; 
					
					Account acc3 = new Account();  
					acc3.id = 3;   
					acc3.email = "manh3";  
					acc3.userName = "MANH3";  
					acc3.fullName = "Manh Nguyen 3";  
					acc3.Department = dep3;   
					acc3.position = pos3;  
					acc3.createDate = LocalDate.now(); 
				
			
//		Tao Department
					  Department dep11 = new Department();   dep11.id = 1;   dep11.name = "Marketing"; 
					 
					  Department dep21 = new Department();   dep21.id = 2;   dep21.name = "Sale"; 
					 
					  Department dep31 = new Department();   dep31.id = 3;   dep31.name = "BOD";
					  
//      Tao Position
					  Position pos11 = new Position();   pos11.id = 1;   pos11.name = PositionName.Dev; 
					  
					  Position pos21 = new Position();   pos21.id = 2;   pos21.name = PositionName.PM; 
					 
					  Position pos31 = new Position();   pos31.id = 3;   pos31.name = PositionName.Scrum_Master; 

//		Tạo Group 
					  Group group11 = new Group();   group11.id = 1;   group11.name = "Testing System"; 
					  
					  Group group21 = new Group();   group21.id = 2;   group21.name = "Development"; 
					 
					  Group group31 = new Group();   group31.id = 3;   group31.name = "Sale"; 
					  
//
					 
					  System.out.println("Accounts Information");
					  System.out.println("Account 1: ID : " 
					  + acc1.id + " Email: " 
					  + acc1.email + " UserName: " + acc1.userName
					  + " FullName: " 
					  + acc1.fullName 
					  + " Department: " 
					  + acc1.Department.name 
					  + " Position: "     
					  + acc1.position.name 
					  + " Group: "
					  + acc1.groups[0].name 
					  +" "
					  + acc1.groups[1].name  
					  + "CreateDate: " 
					  + acc1.createDate); 
					  
					  
					  
					  
					  
			
			
		}
		
		
	}
