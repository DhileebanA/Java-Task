class CountWords{
	public static void main(String arg[]){
		int count = 2;
		String word = "Dhilip is a good boy";
		word = word.trim();
		while(word.indexOf(" ")<word.lastIndexOf(" ")){
			word = word.substring(word.indexOf(" ")+1);
			count++;
		}
		System.out.print(count);
	}
}