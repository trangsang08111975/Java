
public class Thoery {
	
	public static void main(String[] args){
		
		Account[] listAccount = new Account[5];
		
		for(int i = 0; i < listAccount.length ; i++ ) {
			
			listAccount[i] = new Account();
			listAccount[i].id = i+1;
			listAccount[i].fullName = "Nguyen" + (i+1);}
		for (int i = 0; i < listAccount.length; i++) {
			System.out.println(listAccount[i].id + " " + listAccount[i].fullName);
		}
	}
	

}
