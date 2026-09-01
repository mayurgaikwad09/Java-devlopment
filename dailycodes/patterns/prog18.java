import java.io.*;
 class patterns4{
         public static void main(String[]args) throws IOException{

                 BufferedReader obj= new BufferedReader(new InputStreamReader(System.in));

                 System.out.println("Enter row");
                  int rows= Integer.parseInt(obj.readLine());

                  

                        for(int i=1;i<=rows;i++){

                              int num=1;
                              char ch='A';
                              for(int j=1;j<=rows;j++){

                                System.out.print(""+ch+num);

                         num++;
                        ch++;


                  }

                            System.out.println();
 }

         }
 }
