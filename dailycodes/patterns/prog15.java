import java.io.*;
 class patterns{
         public static void main(String[]args) throws IOException{

                 BufferedReader obj= new BufferedReader(new InputStreamReader(System.in));

                 System.out.println("Enter row");
                  int rows= Integer.parseInt(obj.readLine());


                  for(int i=1;i<=rows;i++){
                          for(int j=1;j<=rows;j++){
                           System.out.print(i*j);
      

                          }


                          System.out.println();
                  }

         }

 }

