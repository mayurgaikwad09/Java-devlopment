import java.io.*;
 class patterns5{
         public static void main(String[]args) throws IOException{

                 BufferedReader obj= new BufferedReader(new InputStreamReader(System.in));

                 System.out.println("Enter row");
                  int rows= Integer.parseInt(obj.readLine());

                          for(int i=1;i<=rows;i++){
                          int num=64+rows;
                        for(int j=1;j<=rows;j++){
                              
                              System.out.print((char)num+" ");
                         num--;

                  }
                   System.out.println();
 }

         }
 }
