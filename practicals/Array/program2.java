import java.io.*;
class demo{
        public static void main(String[]args) throws IOException{

                BufferedReader Br = new BufferedReader (new InputStreamReader(System.in));

                System.out.println("Enter your Size");

                   int size = Integer.parseInt(Br.readLine());

                   int arr []= new int[size];


                   System.out.println("Enter your Element");

                   for(int i=0;i<size;i++){
                           arr[i]=Integer.parseInt(Br.readLine());


                }
                       System.out.println("your  Search Element is:");

		       int Searchele= Integer.parseInt(Br.readLine());

                       
                               for(int i=0;i<size;i++){
				       if(Searchele==arr[i]) {
					      System.out.println(i);
				       } else{

					       System.out.println("thre is not in a array in your value");
				       }

			       }
	}
}

