import java.io.*;
 class patterns2{
         public static void main(String[]args) throws IOException{

                 BufferedReader obj= new BufferedReader(new InputStreamReader(System.in));

                 System.out.println("Enter row");
                  int rows= Integer.parseInt(obj.readLine());


                   for(int i=1;i<=rows;i++){
                       int num=1;
		  	   for(int j=1;j<=rows;j++)
			   {
				   if(j%2==0){
                           System.out.print(j*j);


                          } else{



                          System.out.print(j);
                  }

         
			   }
                            System.out.println();
 }

	 }
 }
