import java.io.*;
 class Oddsum{
	 public static void main(String[]args) throws IOException{

		 BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));

		 System.out.println("Enter your size");
                   int size = Integer.parseInt(obj.readLine());

		   int arr[]= new int[size];

		  System.out.println("enter array elemet");

		 for(int i=0;i<size;i++){
			arr[i]=Integer.parseInt(obj.readLine());

		 }

               System.out.println("the aray element is:");

	       for(int j=0;j<size;j++){
		       System.out.println(arr[j]);


	       }

	 }
 }


