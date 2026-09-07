class Demo {
	int x=10;
	static int y=20;

	Demo(){
		System.out.println("In constructor");
	}

	void fun(){
		System.out.println("fun");
		System.out.println(x);
		  System.out.println(y);
	}
	static void gun(){
		System.out.println("Static");
                 Demo obj=new Demo();
		 System.out.println(obj.x);
		 System.out.println(obj.y);
	}

	public static void main(String[]args){
		System.out.println(y);
		   Demo obj=new Demo();
		   obj.fun();
		   obj.gun();
	}
}

