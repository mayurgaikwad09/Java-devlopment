class prog20{
	public static void main(String[]args){
		int a=5;
		int b=8;
		int c=10;

		if((++a==6 && b++==8)||(--c == 9 && a+b ==14)){
			if(a>b)
				System.out.println("A Greater");
			else
				System.out.println("B Greater");
		}else{
			System.out.println("outer Else");
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}
}

