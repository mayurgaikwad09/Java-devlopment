class incrementdemo{
	public static void main(String []args){

		int a=5;
		if(++a>6||a++==6||a<=10){
			System.out.println("inside if");
		}else{
			System.out.println("inside else");
		}

		System.out.println("a="+a);
	}
}


