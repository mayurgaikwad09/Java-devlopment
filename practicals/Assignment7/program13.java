class prog13{
	public static void main(String []args){
		int a=5;
		if(a>2)
			if(a>10)
				System.out.println("A");
			else if(a==5)
				if(a++==5)
					System.out.println(a);
				else
					System.out.println("B");
			else
				System.out.println("C");
	}
}

