import java.util.Scanner;
class Coding1_5{
	public static void main(String args[]){
		Scanner inputObj = new Scanner(System.in);
		System.out.print("Input first number: ");
		int num1 = inputObj.nextInt();
		System.out.print("Input second number: ");
		int num2 = inputObj.nextInt();
		System.out.print(num1*num2);
	}
}