class mayur{
	public static void main(String args[]){
		int i=1;
		int sum=0;
		int product=1;

		while(i<=10){

			if(i%2!=0){
				sum=sum+i;
			}
			else{
				product=product*i;
			}
			i++;
		}
		System.out.println(sum);
		System.out.println(product);
	}
}

		
