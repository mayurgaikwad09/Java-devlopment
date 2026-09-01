import java.util.*;
class week{
        public static void main(String[] args){
           Scanner obj= new Scanner (System.in);
          System.out.println("enter yor day:");
	   int day=obj.nextInt();
                

                switch (day){

                        case 1:
                                System.out.println("sunday");
                                break;


                         case 2:
                                System.out.println("monday");
                                break;



                        case 3:
                                System.out.println("tue");
                                break;


                        case 4:
                                System.out.println("thu");
                                break;


                        case 5:
                                System.out.println("wed");

                                break;
	                 case 6:
                                System.out.println("fri");
                                break;


                         case 7:
                                System.out.println("sat");
                                break;
                        default:
				System.out.println("invalid number");
		}
	}
}

                          
