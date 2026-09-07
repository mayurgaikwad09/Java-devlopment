class Demo{
	int x=10;
	int y=20;
	static int z=30;
	Demo(){
		System.out.println("Demo constructor");
	}

	public static void main(String []args){

		Demo obj1=new Demo();
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		System.out.println(obj1.z);


                Demo obj2=new Demo();
                System.out.println(obj2.x);
                System.out.println(obj2.y);
                System.out.println(obj2.z);
	}
}

