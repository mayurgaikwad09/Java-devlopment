class Demo{
	int add(int x,int y){
		return x+y;
	}
	public static void main(String[]args){
		Demo obj = new Demo();
		int retval=obj.add(10,20);
		System.out.println(retval);
		System.out.println(obj.add(10,20));

	}
}
