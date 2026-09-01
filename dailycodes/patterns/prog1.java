import java.io.*;
class mayur {
	public static void main(String[]args) throws IOException{

		BufferedReader obj =new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter rows");

		int rows = Integer.parseInt(obj.readLine());

		int num = rows*rows;

		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
		}
	}
}

