import java.util.Arrays;
public class Coding1_24{
	public static void main(String[] arg){
		int arr[] = {1,2,5,5,6,6,7,2}, dist[] = new int[arr.length];
		Arrays.sort(arr);
		int j = 0;
		for(int i=1;i<arr.length;i++){
			if(arr[i-1]==arr[i]){
				dist[j++]=arr[i];
			}
		}
		for(int num : dist){
			if(num!=0){
				System.out.print(num+",");
			}
		}
	}
}