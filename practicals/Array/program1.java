import java.io.*;
class demo{
	public static void main(String[]args) throws IOException{

		BufferedReader Br = new BufferedReader (new InputStreamReader(System.in));

		System.out.println("Enter your Size");

                   int size = Integer.parseInt(Br.readLine());

		   char arr []= new char[size];


		   System.out.println("Enter your Element");

		   for(int i=0;i<size;i++){
			   arr[i]=Br.readLine().charAt(0);

		}

		 

		  for(int i=0;i<size;i++){
                       
			  if(arr[i]=='A'|| arr[i]=='E'|| arr[i]=='I'|| arr[i]=='O'|| arr[i]=='U'|| arr[i]=='a'|| arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){

	              System.out.println(arr[i]+" vowel is ata index " + i);             
	
		 }
		  }
	}
}


	
	
	
		  
/*
WAP to print array if the usre given size is even then only print alternet element otherwise print whole array
	Ex 1) size=5;
              enter elemrn=1,2,7,17,58.
		      ex2] size=6
		      enter elem=10,9,8,7,6,5;

            alternate elements are =10,8,6 */
