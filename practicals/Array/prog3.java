import java.io.*;
 class mayur{
	 public static void main(String[]args) throws IOException{

         		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                      System.out.println("ENter your size");
		 int size= Integer.parseInt(br.readLine());

		 int arr[]=new int [size];

		 System.out.println("Enter your Element");

		 for(int i=0;i<size;i++){
			 arr[i]=Integer.parseInt(br.readLine());

		 }
		 int count=0;
		 System.out.println("your count is");

		 for(int i=0;i<size;i++){
			 if(arr[i]%4==0){
				 count++;
			 }
		
		 }
		 System.out.println(count);
	 }
 }

                         	



