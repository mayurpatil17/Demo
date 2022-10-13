package grouping;

import org.testng.annotations.Test;

public class P1 {
	
	@Test(groups="Smoke")
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test(groups="Smoke")
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test(groups="Functional")
	public void test3() {
		System.out.println("Test 3");
	}
	@Test(groups="Functional")
	public void test4() {
		System.out.println("Test 4");
	}
	@Test(groups="Integration")
	public void test5() {
		System.out.println("Test 5");
	}
	@Test(groups="Integration")
	public void test6() {
		System.out.println("Test 6");
	}

}
