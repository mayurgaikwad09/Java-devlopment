// static methods

class Demo{
            static void fun(){
               System.out.println("Start fun");
	       System.out.println("End fun");
	    }


        static void work(){
                System.out.println("Start work");
		fun();
                System.out.println("End work");
        }

        public static void main(String[]args){

         System.out.println("Start main");
            work();
       System.out.println("End main");
	    }
}

