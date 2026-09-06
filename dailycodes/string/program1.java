class stringdemo{
	public static void main(String args[]){

		String str1="kanha";
		String str2= new String("kanha");
		String str3="kanha";
		String str4=new String("kanha");

		System.out.println(str1==str2);
		System.out.println(str1==str3);


		System.out.println(str2==str4);

           

                System.out.println (str1.equals(str2));
                System.out.println (str1.equals(str3));
                System.out.println(str2.equals(str4));







	}
}

