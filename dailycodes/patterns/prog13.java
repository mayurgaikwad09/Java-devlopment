import java.io.*;
class Mayur{
	public static void main(String[]args) throws IOException {

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                 System.out.println("Enter your row:");

		int row = Integer.parseInt(br.readLine());
                 char arr[]=new char[row];


		 for(int i=0;i<row;i++){
			 for(int j=0;j<row;j++){
				 if(i%2==0){
                              System.out.print('#');

				 }else{
					 System.out.print('$');

				 }

			 }
			System.out.println();
		 }
	}
}


