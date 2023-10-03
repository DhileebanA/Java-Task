public class ArrayElement{
	public static void main(String[] arg){
		int x[] = {0,1,2,3,4,4}, dist = x[0];
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x.length;j++){
				if(x[i]!=x[j]){
					dist=x[i];
				}
			}
		}
	}
}