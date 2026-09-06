// string buffer
//

     class mayur {
	     public static void main(String[]args){
		     StringBuffer sb1= new StringBuffer("Datta");

		     System.out.println(sb1);
		    System.out.println(sb1.capacity());

		    System.out.println(System.identityHashCode(sb1));
		    //System.out.println(System.IdentityHashcode(sb1));

		    sb1.append("krupa");
		    System.out.println(sb1);

		     System.out.println(sb1.capacity());
		      
		       System.out.println(System.identityHashCode(sb1));
		     //System.out.println(System.IdentityHashcode(sb1));
	     }
     }



