import java.util.*;
class pattren {
	public static void main (String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your rows");

        int rows=sc.nextInt();

        int num=1;
        for(int i=1;i<=rows;i++){
          num =1;
          for(int sp=1;sp<=rows-i;sp++){
                System.out.print("\t");
              }
              for(int j=1;j<=i;j++) {
                  if(i%2==1){
                    if(j%2==1){
                      System.out.print((char)(num+96) +"\t");

                    }else{
                      System.out.print(num+"\t");
                    }
 
                    num++;
                  }else{
                    if(j%2==0){
                      System.out.print((char)(num+96) +"\t");
                    }else{
                      System.out.print(num+"\t");
                    }
                     num++;
                  }
                }
                System.out.println();
	}
      }
}      
                    
             

