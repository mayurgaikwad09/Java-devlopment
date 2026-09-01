class mayur {
	public static void main(String[]args){
		int i=1;
		int count=0;

		for(i=1;i<=10;i++){
			if(i%2==0){
				count++;
			}if(count==3){
				break;
			}
		}
		System.out.println(count);
	}
}
				
