class Demo{

	int x=10;

        void work(){
                System.out.println("Start work");
                System.out.println("End work");
        }

        public static void main(String[]args){

        Demo obj=new Demo();
            System.out.println(obj.x);
	    obj.work();
       System.out.println("End main");
	}
}

