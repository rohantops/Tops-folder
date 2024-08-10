package Assignment;

import org.junit.Assert;
import org.junit.Test;

public class Q01_JUnit {
@Test	
public void test1() {
	System.out.println("test 1 running");
}
@Test
public void test2() {
	System.out.println("test 2 running");
	int a[] = {1,2,3,4,};
	int b[] = {1,2,3,4,5,};
	
	Assert.assertArrayEquals(a, b);
	Assert.assertFalse(true);
}
@Test
public void test3() {
	System.out.println("test 3 running");
}
}
