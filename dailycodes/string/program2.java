class stringdemo{
	public static void main(String []args){

		String str1="Rahul";
		String str2=new String("Rahul");
		String str3="Rahul";

		String str4=new String("Rahul");

		System.out.println(System.identityHashCode(str1));
                  System.out.println(System.identityHashCode(str2));
		   System.out.println(System.identityHashCode(str3));
		    System.out.println(System.identityHashCode(str4));
		     //System.out.println(System.identityHashCode(str1));







	}
}


