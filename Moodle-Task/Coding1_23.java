import java.util.Arrays;
class Coding1_23{
	public static void main (String args[]){
		int arr[] = {1789,2035,1899,1456,2013,1458,2458,1254,1472,2365,1456,2165,1457,2456};
		int arrRev[] = new int[arr.length];
		for(int i=arr.length-1,j=0;i>=0;i--,j++){
			arrRev[j] = arr[i];
		}
		for(int num : arrRev){
			System.out.print(num+",");
		}
	}
}