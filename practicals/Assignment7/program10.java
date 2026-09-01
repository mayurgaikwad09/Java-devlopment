class prog10{
	public static void main(String[]args){
		int a=4;
		if(a++ ==4)
			if(++a==6)
				System.out.println(a);
			else
				System.out.println(--a);
		else
			System.out.println(a);
		System.out.println(a);
	}
}
