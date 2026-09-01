import java.util.*;
class color{
	public static void main(String[]args){
		Scanner obj = new Scanner(System.in);
                 System.out.println("Enter your color:");
		String Colour = obj.next();

		switch(Colour){

		     case "Red":
		          System.out.println("stop");
                             
			  break;
                            	             
	              case "Blue":
	                      System.out.println("no such colour in present");
                              
			      break;
	              default :
	                           System.out.println("deault color");
		}
		}
	}
	

