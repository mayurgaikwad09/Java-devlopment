import java.util.*;
class mayur{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		System.out.println("enter you  size");
		int row= sc.nextInt();
		int column=sc.nextInt();

		int arr[][]=new int[row][column];

		System.out.println("Enter your element");
		 
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){

				arr[i][j]=sc.nextInt();
			}
		}

		System.out.println("your element are");

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();

		}
	}
}

