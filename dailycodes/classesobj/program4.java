// variables and static method
//



class Demo{
         int x=10;
	 static int y=20;

        static void work(){

		int z=30;

                System.out.println(z);
                System.out.println(y);
		Demo obj=new Demo();
		System.out.println(obj.x);
        }

        public static void main(String[]args){

         System.out.println("Start main");
            work();
	    Demo obj=new Demo();
	    System.out.println(obj.x);
       System.out.println("End main");
	}
}

