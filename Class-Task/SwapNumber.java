import java.util.Scanner;
class SwapNumber{
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);
	System.out.print("Enter First Number :");
	int a = inputObj.nextInt();
	System.out.print("Enter Second Number :");
	int b = inputObj.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("First Number :"+a);
	System.out.print("Second Number :"+b);
   }
}