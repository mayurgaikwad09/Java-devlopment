class prog18{
	public static void main(String[]args){
		int a=20;
		int b=15;

		if((a>b&& a%5==0)||(b%3==0)){
			if((a+b)%7==0&&(a-b==5))
				System.out.println("PASS");
			else
				System.out.println("FAIL");
		}else{
			System.out.println("outer failed");
		}
		System.out.println("completed");
	}
}


