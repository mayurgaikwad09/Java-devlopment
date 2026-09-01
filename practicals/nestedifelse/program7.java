class loan{
	public static void main  (String []args){

		int age =28;
		int salary=5000;

		if(age>=21 && age<=60){
			if(salary>=30000){
				System.out.println("ELigiable for loan");

			}else{
				System.out.println("not eligiable due to salary");

			}
		} else{
			System.out.println("not eligiable due to age");
		}
	}
}

