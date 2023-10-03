import java.util.Scanner;
class Capitalized{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter sentence : ");
		String word = scanner.nextLine(), capWord="";
		word = word.trim();
		word += " cap ";
		while(word.indexOf(" ")<word.lastIndexOf(" ")){
			capWord+=(word.substring(0,1)).toUpperCase();
			capWord+=word.substring(1,word.indexOf(" "))+" ";
			word = word.substring(word.indexOf(" ")+1);
		}
		System.out.print(capWord);
	}
}