import java.util.Scanner;
class Coding1_6{
	public static void main(String args[]){
		Scanner inputObj = new Scanner(System.in);
		System.out.print("Input first number: ");
		int num1 = inputObj.nextInt();
		System.out.print("Input second number: ");
		int num2 = inputObj.nextInt();
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
	}
}