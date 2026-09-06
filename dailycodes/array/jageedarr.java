import java.util.*;
 class mayur{
	 public static void main(String[]args){
		  Scanner sc= new Scanner(System.in);

			  System.out.println("Enter your row");

				  int row=sc.nextInt();

		              int arr[][]=new int[row][];
                     
			      System.out.println("Enter your column size for each row");

			      for(int i=0;i<arr.length;i++){
				      int colsize=sc.nextInt();

				      arr[i]=new int [colsize];
			      }

			      System.out.println("enter your data");
                                for(int i=0; i<arr.length; i++){
			      for(int j=0;j<arr[i].length;j++){
				      arr[i][j]=sc.nextInt();
			      }
				}

	 System.out.println("array element are");
	  for(int i=0;i<arr.length;i++){for(int i=0; i<arr.length; i++)for(int i=0; i<arr.length; i++)
		  for(int j=0;j<arr[i].length;j++){
			  System.out.print(arr[i][j]+" ");
		  }
		  System.out.println();
	  }
 }
 }

