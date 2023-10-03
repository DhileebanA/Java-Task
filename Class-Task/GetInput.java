import java.util.Scanner;

class GetInput{
	public static void main(String[] args){
		String name, password;
		long mobile;
		byte age;
		Scanner inputObj = new Scanner(System.in);
		System.out.print("Your Name :");
		name = inputObj.nextLine();
		System.out.print("Your Password :");
		password = inputObj.nextLine();
		System.out.print("Your Mobile :");
		mobile = inputObj.nextLong();
		System.out.print("Your Age :");
		age = inputObj.nextByte();
		System.out.println("Hi! "+name);
		System.out.println("Your password is "+password);
		System.out.println("Your Mobile no is "+mobile);
		System.out.println("Your password is "+age);
	}
}