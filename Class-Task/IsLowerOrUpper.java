import java.util.Scanner;
class IsLowerOrUpper{
	public static void main(String args[]){
		Scanner inputObj = new Scanner(System.in);
		int upper = 0;
		System.out.print("Enter your Sentance : ");
		String a = inputObj.nextLine(),b;
		a = a.replaceAll(" ","");
		for(int i=0;i<a.length();i++){
			b=a.substring(i,i+1);
			if(b==b.toUpperCase()){
				upper+=1;
			}
		}
		System.out.println("No of Lowercase : "+(a.length()-upper));
		System.out.println("No of Uppercase: "+upper);
	}
}