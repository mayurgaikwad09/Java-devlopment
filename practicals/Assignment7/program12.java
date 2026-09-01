class prog12{
	public static void main(String[]args){
		int a=10;
		int b=5;

		if(a>b)
			if(a-b==5)
				if(a+b==15)
					if(a*b==50)
						System.out.println("level 4");
					else
						System.out.println("level 3");
				else
					System.out.println("level 2");
			else
				System.out.println("level 1");
		else
			System.out.println("wrong");
	}
}

