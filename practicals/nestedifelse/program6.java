class triangle{
	public static void main(String []args){
		int a=5;
		int b=5;
		int c=5;

       if(a==b && a==c && b==c  ){
	       System.out.println("Equalitral triangel");

       }else if(a==b || a==c || b==c){
	       System.out.println("isosceles triange");

       }
       else{
	       System.out.println("Scalen traiange");
       }
	}
}

