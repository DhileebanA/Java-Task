import java.util.Arrays;
class ArrayMethods{
	public static void main (String args[]){
		int[] arr = new int[5];
		arr[0] = 6;
		arr[1] = 7;
		arr[2] = 8;
		arr[3] = 9;
		arr[4] = 10;
		System.out.println(arr[0]);
		System.out.println(arr.length);

		int[] cpArr = Arrays.copyOf(arr,arr.length);
		System.out.println(cpArr[0]);
		System.out.println(cpArr);

		String arrStr = cpArr.toString();
		System.out.println(arrStr);

		boolean equals = Arrays.equals(arr,cpArr);
		System.out.println(equals);

		int[] arr1 = {1,8,3,4,5,6,7,2};
		Arrays.sort(arr1);

		for(int num : arr1){
			System.out.print(num);
		}
	}
}