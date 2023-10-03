public class ArrayLargeElement{
	public static void main(String[] arg){
		int x[] = {20,37,32,45,20}, high = x[0];
		for(int i=1;i<x.length;i++){
			if(high<x[i]){
				high = x[i];
			}
		}
		System.out.print(high);
	}
}