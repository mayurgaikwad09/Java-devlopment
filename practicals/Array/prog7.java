
  import java.util.*;
  class ArrayDemo{
          public static void main(String[]args){

                  Scanner sc = new Scanner(System.in);
                 System.out.println("Enter your size");
                  int size= sc.nextInt();
                    char arr[]=new char[]{'A','B','C','D','E','F','G'};
                       

                    System.out.println("Enter your data");
                     
		   char Startchar=sc.next().charAt(0);
		  char endchar=sc.next().charAt(0);
                           
		  int StartIdx=-1;
		  int endIdx=-1;


		    for (int i=0;i<size;i++){
                            if(arr[i]==Startchar){
				    StartIdx=i;

                     }

		     if(arr[i]==endchar){
                                    endIdx=i;
		     }
		    }



                                    
                                 System.out.println("your data is :");
                    
                                        for (int i=StartIdx;i<size;i++){
                                       
                                    System.out.println("|"+arr[i]+"|");


                        }
			System.out.println();
                                }
  }
                          
