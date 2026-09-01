import java.util.*;
class subscription {
        public static void main(String[]args){
                Scanner obj = new Scanner(System.in);
                
                  System.out.println("Enter your SUB");

		  String name = obj.next();

                switch(name){

                        case "platinum":
                                System.out.println("799");

                                break;

                        case "gold" :
                                System.out.println("599");
                                break;

                        case "silver":
                                System.out.println("399");
                                break;

                        
                        case "bronze" :
                                System.out.println("199");
                                break;

                        case "free":
                                System.out.println("less than 199");
                                break;
			
		
			
			
			default:
                                System.out.println("invalid input");

                }
        }
}
