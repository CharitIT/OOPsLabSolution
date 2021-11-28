package service;

public class CredentialService {

	void generateEmailAddress(String empName,String dept){
		System.out.println("Email --> "+empName+"@"+dept+".company.com");
	}
	
	String generatePassword(){
		 String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
					                 + "0123456789"
					                 + "abcdefghijklmnopqrstuvxyz"
					                 + "!@#$%&*";

		// create StringBuffer size of 10 AlphaNumericString
		 StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < 10; i++) {
		
		// generate a random number between
		int index
		= (int)(AlphaNumericString.length()
		     * Math.random());
		
		// add Character one by one in end of sb
		sb.append(AlphaNumericString
		       .charAt(index));
		}

		return sb.toString();
	}
	
	public void showCredentials(String empName,String dept) {
		generateEmailAddress(empName,dept);
		String pwd = generatePassword();
		System.out.println("Password --> "+pwd);
	}
}
