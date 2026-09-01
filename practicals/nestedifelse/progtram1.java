class ticket{
	public static void main(String args[]){

		int age=60;
		if(age<=13){
			System.out.println("Child ticket");
		} else if(age>13&& age<59){
			System.out.println("Adult Ticket");
		} else if (age<=60){
			System.out.println("senior citizen");
		}
		else{
			System.out.println("you are not eligible for that ticket");
		}
	}


		
}

