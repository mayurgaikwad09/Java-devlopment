class employye{
	public static void main(String args[]){

		boolean trainingCompleted= false;
		int bonusPoints=10;

		if(trainingCompleted && ++bonusPoints>10){
			System.out.println("bonus Approved");

		}else{
			System.out.println("bonus not approved");

		}
		System.out.println("Bonus points =" +bonusPoints);

	}
} 

