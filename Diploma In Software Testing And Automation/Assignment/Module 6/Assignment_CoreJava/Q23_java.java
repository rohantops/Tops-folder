package Assignment;

public class Q23_java {
	 static void reverse(int a[],int r) {
		int[] b = new int[r];
		int j= r;
		for (int i = 0; i < r; i++) {
			b[j-1] = a[i];
			j = j-1;
		}
		System.out.println("reverse array is: \r");
		for (int s = 0; s < r; s++) {
			System.out.println(b[s]);
		}
	}

	public static void main(String[] args) {
		int [] arr = {50,60,70,80,90};
		reverse(arr,arr.length );

	}

}
