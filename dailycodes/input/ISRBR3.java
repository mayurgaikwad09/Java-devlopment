import java.io.*;
   class Student {
	   public static void main(String[]args)throws IOException{

		  BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		  System.out.println("Enter student Name:  ");
		  String stname = br.readLine();

		  System.out.println("Enter Roll No");
		   int stroll = Integer.parseInt(br.readLine());

		   System.out.println("Enter Marks");
		   float stmark = Float.parseFloat(br.readLine());

		   System.out.println("ENter Grade");
		   char StGrd = br.readLine().charAt(0);

                      System.out.println("this student is Good");
                   boolean stys = Boolean.parseBoolean(br.readLine());
                              


				   System.out.println("student name "+stname);
				   System.out.println("roll no "+stroll);
				   System.out.println("student mark "+stmark);
				    System.out.println("Student Grd "+StGrd);
				    System.out.println("Student is Good " +stys);
	   }
   }



