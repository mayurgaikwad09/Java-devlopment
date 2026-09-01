import java.util.*;
class spelling {
	public static void main(String[]args){
		Scanner obj=new Scanner (System.in);
	
	        
	           	
                   System.out.println("Enter your number :");
                   
                  int num =obj.nextInt(); 

		switch(num){

			case 1:
				System.out.println("one");

				break;

			case 2:
				System.out.println("two");
				break;

			case 3:
				System.out.println("three");
				break;

			default:
				System.out.println("invalid input");

		}
	}
}

