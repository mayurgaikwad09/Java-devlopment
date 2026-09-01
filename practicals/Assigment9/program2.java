import java.util.*;

class Vehical{
          public static void main(String[]args){
		  System.out.println("Enter your vehical name");
                   Scanner obj= new Scanner(System.in);

			   int number= obj.nextInt();

		   switch(number){
			    case 1 :
				    System.out.println("Bycicle");
				    break;

				      case 2 :
                                    System.out.println("Bike");
                                    break;

				      case 3 :
                                    System.out.println("car");
                                    break;

				      case 4 :
                                    System.out.println("Bus");
                                    break;

				      case 5 :
                                    System.out.println("truck");
                                    break;

				      default:
				    System.out.println("invalid");

		   }
	  }
}


