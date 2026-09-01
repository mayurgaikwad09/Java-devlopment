class mayur{
	public static void main(String[]args){
		int x=3;
		int y=4;

		if(x++>3)
			System.out.println("A");
		else
			if(++y>4)
				if(x==4)
					System.out.println("B");
				else 
					System.out.println("C");
			else 
				System.out.println("D");
		System.out.println(x+" " +y);
	}
}
