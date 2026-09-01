 import java.io.*;
 class ArrayDemo{
	 public static void main( String [] args)throws IOException {

		 BufferedReader obj= new BufferedReader( new InputStreamReader(System.in));

                        System.out.println("Enter Size");

			int size = Integer.parseInt(obj.readLine());
			int arr[] = new int [size];


			 System.out.println("Enter array element:");
			  for(int i=0;i<size;i++){
				  arr[i]= Integer.parseInt(obj.readLine());
			  }

			  System.out.println("array element are:");
                                     
				  for(int index =0; index<size; index++){
	
					   if(index%2==1){
						   System.out.println("odd elements are:"+arr[index]);
					  
				   }
				   }

	}
 }

