import java.io.*;
 class patterns7{
         public static void main(String[]args) throws IOException{

                 BufferedReader obj= new BufferedReader(new InputStreamReader(System.in));

                 System.out.println("Enter row");
                  int rows= Integer.parseInt(obj.readLine());

                     int num=1;
                   for(int i=1;i<=rows;i++){
                      
                           for(int j=1;j<=rows;j++){
                           
          
                           System.out.print(num);
			   num=num+2;
			   }
			   num=num+2;                                                

                            System.out.println();
 }

         }
 }
