public class Coding1_22{
	public static void main(String[] arg){
	    	int arr[]={25,14,56,15,36,56,77,18,29,49};
		System.out.println(indexOfArr(arr,25));
		System.out.print(indexOfArr(arr,77));
	}
	static int indexOfArr(int arr[],int num){
		int i = 0;
		for(int n : arr){
	        	if(n==num){
				break;
			}
			++i;
	    	}
		return i;
	}
}