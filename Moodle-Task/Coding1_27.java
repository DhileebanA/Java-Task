public class Coding1_27{
	public static void main(String[] arg){
		int arr[] = {77,77,65,65,65,77};
		boolean bool=false;
		for(int num : arr){
			if(num==77||num==65){
				bool = true;
			}
		}
		System.out.print(bool);
	}
}