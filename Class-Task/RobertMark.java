import java.util.Scanner;
class RobertMark{
    public static void main(String args[]){
        Scanner inputObj = new Scanner(System.in);
	System.out.print("Your Name :");
	String name = inputObj();
	System.out.print("Mark 1 :");
        byte m1 = inputObj.nextByte();
	System.out.print("Mark 2 :");
	byte m2 = inputObj.nextByte();
	System.out.print("Mark 3 :");
	byte m3 = inputObj.nextByte();
	int total = m1+m2+m3;
	float percent = total/3;
	System.out.println("Hi!, "+name);
	System.out.println("Your Total mark is "+total);
	System.out.print("Your Percentage is "+ percent+"%");
    }
}