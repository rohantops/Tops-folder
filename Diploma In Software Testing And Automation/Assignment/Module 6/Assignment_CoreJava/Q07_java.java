package Assignment;

public class Q07_java {

	public static void main(String[] args) {
		//1.
		for(int i =1;i<=5;i++) {//rows
			for(int j =1;j<=i;j++) {//columns
				System.out.print(j);
			}
			System.out.println();
		}
		//2.
		for (int i = 1; i <= 5; i++) {
	        for (int j = 1; j <= i; j++) {
	            if ((i + j) % 2 == 0) {
	                System.out.print("1 ");
	            } else {
	                System.out.print("0 ");
	            }
	        }
	        System.out.println();
	    }
		//3.
		for ( int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		//4.
		int number = 3;
		int m ,n;
		
		for(m = 1; m <= number; m ++)
		{
			for(n = 1; n <= number-m; n++)
			{
				System.out.print(" ");
				
			}
			for(n = 1; n <= m*2-1; n++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(m = number - 1; m > 0; m -- )
		{
			for(n = 1; n <= number-m; n ++)
			{
				System.out.print(" ");
			}
			for(n = 1; n <= m*2-1; n++)
			{
				System.out.print("*");
				
			}
			System.out.println();
	}


	    
	 
		

	}

}
