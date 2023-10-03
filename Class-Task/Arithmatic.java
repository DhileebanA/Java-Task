import java.util.Scanner;

class Arithmatic{
	public static void main(String args[]){
		int a,b,c,d,e,f;
		Scanner obj = new Scanner(System.in);
		System.out.print("First number: ");
		a=obj.nextInt();
		System.out.print("Second number: ");
		b=obj.nextInt();
		System.out.print("Third number: ");
		c=obj.nextInt();
		System.out.print("Fourth number: ");
		d=obj.nextInt();
		System.out.print("Fifth number: ");
		e=obj.nextInt();
		System.out.print("Sixth number: ");
		f=obj.nextInt();
		System.out.print("Your Result: "+mathda(a,b,c,d,e,f));
	}
	public static int mathda(int a,int b,int c,int d,int e,int f){
		return ((a/b)+c*d-e+f);
	}
}