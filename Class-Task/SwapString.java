class SwapString{
	public static void main(String arg[]){
		String word1 = "yogesh";
		String word2 = "dhilip";
		word1 = word1+word2;
		word2 = word1.substring(0,(word1.length()-word2.length()));
		word1 = word1.substring(word1.length()-word2.length());
		System.out.println(word1);
		System.out.println(word2);
	}
}