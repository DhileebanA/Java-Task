class Coding1_30{
	String reverseWord="";
	public static void main(String args[]){
		Coding1_30 obj = new Coding1_30();
		obj.palindrome("MALAYALAM");
	}
	void palindrome(String word){
		for(int i=0;i<word.length();i++){
			reverseWord=word.substring(i,i+1)+reverseWord;
		}
		if(reverseWord.equalsIgnoreCase(word)){
			System.out.print(word+" is a Palindrome");
		}else{
			System.out.print(word+" is not a Palindrome");
		}
		
	}
}