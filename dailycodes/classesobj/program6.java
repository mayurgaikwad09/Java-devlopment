class Demo{
        
        int x=10;
    static int y=20;

        void fun(){
                System.out.println("infun");
                //System.out.println("End work");
		System.out.println(y);
        }
	static void gun(){
		System.out.println("Ingun");
	     Demo obj=new Demo();
            System.out.println(obj.x);
            obj.fun();
}
}
class memo{

        public static void main(String[]args){
           int z=30;
	   System.out.println(z);
	   System.out.println(Demo.y);
	   Demo.gun();
        //Demo obj=new Demo();
          //  System.out.println(obj.x);
            //obj.fun();
       System.out.println("End main");
        }

	}


