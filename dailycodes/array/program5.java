import java.io.*;
class Sumeven{
	public static void main(String[]args) throws IOException{

		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter your size");
                 int size=Integer.parseInt(obj.readLine());

		 int arr[] = new int[size];


                     System.out.println("Enter your array data");

		     for(int i=0;i<size;i++){
			     arr[i]=Integer.parseInt(obj.readLine());
		     }
                       
		     int sum=0;
		     System.out.println("sum of even number is");

		     for(int j=0;j<size;j++){
			     if(arr[j]%2==0){
				sum=sum+arr[j];

			     }
		     }
		     System.out.println(sum);
	}
}



