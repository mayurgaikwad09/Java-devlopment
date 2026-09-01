import java.io.*;
 class OddSum{
	 public static void main(String[]args) throws IOException{
			 BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

				 System.out.println("Enter array Size:");
                          int size = Integer.parseInt(obj.readLine());
                           int arr[]=new int [size];
                        
			   System.out.println("Enter your array data");
			   for(int i=0;i<size;i++){
				   arr[i]=Integer.parseInt(obj.readLine());
			   }
                                 int sum=0;
			   System.out.println("your Sum of odd no is:");
				   for(int j=0;j<size;j++){
					   if(arr[j]%2==1){
					    sum=sum+arr[j];
				   }
				  
			   }
			     System.out.println(sum);
	 }
 



 }	
