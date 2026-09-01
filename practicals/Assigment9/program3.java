import java.util.*;

class remark{
	public static void main(String[]args){
		System.out.println("Enter your grade");

		Scanner obj = new Scanner(System.in);
                 
		char grade= obj.next().charAt(0);


		switch (grade){

			case 'O' :
				System.out.println("outstanding");
				 break;

			case 'A':
				 System.out.println("Excellent");
				 break;


                        case 'B':
                                 System.out.println("very good");
                                 break;


                        case 'C':
                                 System.out.println("Good");
                                 break;


                        case 'D':
                                 System.out.println("Avg");
                                 break;

                                
                              default:
				 System.out.println("Fail");
		}
	}
}



