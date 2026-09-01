import java.io.*;
class Mayur{
	public static void main(String args[]) throws IOException{
		BufferedReader obj= new BufferedReader(new InputStreamReader(System.in));
           
		System.out.println("ENter array Size");
		  int size=Integer.parseInt(obj.readLine());

      		  int arr[] = new int[size];

 
		  System.out.println("ENter yout array data:");

		  for (int i=0;i<size;i++){
                     
			  arr[i]=Integer.parseInt(obj.readLine());
		  }

		  int sum=0;
		  System.out.println("The dadat is :");
                   
		  for(int j=0;j<size;j++){
                     sum=sum+arr[j];
	}
	System.out.println(sum);
	

}
}
