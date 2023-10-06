import java.util.Arrays;
public class Coding1_26{
	public static void main(String[] arg){
		int arr[] = {5,7,2,4,9};
		Arrays.sort(arr);
		System.out.print(arr[arr.length-1]-arr[0]);
	}
}