import java.io.*;
 class mayur{
         public static void main(String[]args) throws IOException{

                 BufferedReader obj= new BufferedReader(new InputStreamReader(System.in));

                 System.out.println("ENter row");
                  int row= Integer.parseInt(obj.readLine());


                  for(int i=1;i<=row;i++){
                      int num=i*row;
                          for(int j=1;j<=row;j++){
                           System.out.print(num);
                           num=num+row;

                          }


                          System.out.println();
                  }

         }

 }

