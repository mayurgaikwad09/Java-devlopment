class prog18{
	public static void main(String []args){

		int a=5;
		int b=5;

		if(a++ == ++b)
			if(a==b++)
				System.out.println(a+b);
			else
				System.out.println(a*b);
		else
			System.out.println(a-b);
		System.out.println(a+" "+b);
	}
}
