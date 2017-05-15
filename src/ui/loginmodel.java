package ui;

public class loginmodel {
	
	public static boolean authentication(String username, String password){
		// HARCODED VALUES
		if (username.equals("Trvpbxga") | username.equals("Bvrguillx") && password.equals("amistad")){
			return true;
		} else {
			return false;
		}
		
	}

}
