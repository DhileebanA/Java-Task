public class Coding1_25{
	public static void main(String[] arg){
		int arr[][] = {{2,2},{3,3}};
		int arr1[][] = {{3,3},{2,2}};
		int arrmul[][] = new int[2][2];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr1.length;j++){
				arrmul[i][j]=arr[i][j]+arr1[i][j];
				System.out.println(arrmul[i][j]);
			}
		}
	}
}