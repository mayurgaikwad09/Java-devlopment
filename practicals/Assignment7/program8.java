class prog8{
	public static void main(String[]args){
		int x=15;
		int y=10;

		if(x>y){
			if(x%y==0)
				if(y%2==0)
					System.out.println("A");
				else
					System.out.println("B");
			else
				System.out.println("c");
		}else{
			System.out.println("D");
		}
	}
}


