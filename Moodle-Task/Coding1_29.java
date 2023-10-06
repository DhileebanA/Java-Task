class Coding1_29{
	int num1=1,num2=2,num3;
	String output=num1+" "+num2;
	public static void main(String args[]){
		Coding1_29 obj = new Coding1_29();
		obj.fibonacciSeries(5);
	}
	void fibonacciSeries(int num){
		for(int i=2;i<num;i++){
			num3=num1+num2;
			num1=num2;
			num2=num3;
			output+=" "+num3;
		}
		System.out.print(output);
	}
}