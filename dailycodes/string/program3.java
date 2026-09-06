class Stringdemo{

	public static void main(String[]args){

		String str1="Ashish";
		String str2="khare";


		System.out.println(str1);
		System.out.println(str2);

		 System.out.println(System.identityHashCode(str1));
                  
		  System.out.println(System.identityHashCode(str2));
		str1=str1.concat(str2);

		System.out.println(str1);
		System.out.println(str2);



		 System.out.println(System.identityHashCode(str1));
		  System.out.println(System.identityHashCode(str2));
	}
}

