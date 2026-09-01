import java.io.*;

class input1 {
	public static void main(String[]args) throws IOException{
	     
   
	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                   
	       System.out.println("Enter society name");
	       String socName = br.readLine();

	       System.out.println("Enter flat no");
	         int flatNo =Integer.parseInt(br.readLine()); 

		 System.out.println("Enter rent ");
                   double rent = Double.parseDouble(br.readLine());

		   System.out.println("Enter wing");
		   char wing = br.readLine().charAt(0);

		    System.out.println("socity name:"+ socName );
		     System.out.println("Enter flat no"+ flatNo);
		      System.out.println("Enter rent"+rent);
		       System.out.println("Enter wing"+wing);
	}
}




		 

         
 	       
