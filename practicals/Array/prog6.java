/*
WAP to print array if the usre given size is even then only print alternet element otherwise print whole array
        Ex 1) size=5;
              enter elemrn=1,2,7,17,58.
                      ex2] size=6
                      enter elem=10,9,8,7,6,5;

            alternate elements are =10,8,6 */

  import java.io.*;
  class ArrayDemo{
	  public static void main(String[]args) throws IOException {

		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                 System.out.println("Enter your size");
		  int size=Integer.parseInt(br.readLine());
                    int arr[]=new int[size];
                       
				
		    System.out.println("Enter your data");
                     for (int i=0;i<size;i++){
			     arr[i]=Integer.parseInt(br.readLine());

                           
                        
		     }           
 
                                 System.out.println("your data is :");
			     if(size%2==0){
				        for (int i=0;i<size;i++){
	                 		if(i%2==0){
				    System.out.println(arr[i]);
			       
					
			}
				}

			          }
			       else{ 
				     for (int i=0;i<size;i++){
				       System.out.println(arr[i]);
					}

		     }
	  }
  
	  
  
  }
		     

