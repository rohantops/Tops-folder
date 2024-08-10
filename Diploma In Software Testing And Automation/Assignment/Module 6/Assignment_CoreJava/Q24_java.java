package Assignment;

public class Q24_java {
	public static int getSecondLargest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int r = i + 1; r < total; r++)   
		            {  
		                if (a[i] > a[r])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[r];  
		                    a[r] = temp;  
		                }  
		            }  
		        }  
		       return a[total-2];  
		}

	public static void main(String[] args) {
		int a[]={1,2,9,8,3,6};  
		int b[]={44,66,99,77,33,22,55};  
		System.out.println("Second Largest: "+getSecondLargest(a,6));  
		System.out.println("Second Largest: "+getSecondLargest(b,7));
		

	}

}
