   class login {
	   public static void main(String[]args){
	     
             boolean isLoggedln = true;
	     int loginAttempts =0;

	     if(isLoggedln || ++loginAttempts >0){
		     System.out.println("welcome to user");
	     }else{
		     System.out.println("please login");
	     }

	     System.out.println("login attemps"+loginAttempts);
	   }

	   }

