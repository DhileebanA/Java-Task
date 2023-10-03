public class ArrayDemo{
	public static void main(String[] arg){
		int x[] = new int [5];
		System.out.print(x);
		for(int i=0;i<x.length;i++){
			x[i] =i;
		}
		for(int i=0;i<x.length;i++){
			System.out.print(x[i]);
		}
	}
}