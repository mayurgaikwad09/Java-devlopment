import java.util.*;
class calculater {
	public static void main(String[]args){
             Scanner obj= new Scanner (System.in);
           System.out.println("enter your num1:");
	      int x= obj.nextInt();
	     
	        System.out.println("enter your num2:");
                 int y=obj.nextInt();

		 System.out.println("Enter your oprator:");
		  char ch = obj.next().charAt(0);

	         
                //int x=5;
		//int y=6;
		//char ch ='+';



		switch(ch){
			case '+':
				System.out.println(x+y);
				break;

			case '-' :
				System.out.println(x-y);
				break;
				
		}
	}
}

