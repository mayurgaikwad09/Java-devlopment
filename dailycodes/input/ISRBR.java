import java.io.*;
      class UserInput{
	      public static void main(String []args)throws IOException {


		      InputStreamReader obj1 = new InputStreamReader (System.in);
		      BufferedReader obj2 = new BufferedReader(obj1);

		      System.out.println("Enter your name");
		      String name = obj2.readLine();
		      System.out.println("Name:" + name);
	      }
      }



