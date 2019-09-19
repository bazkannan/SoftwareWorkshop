import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Test;

/** @author 
 *  <Bharath Kannan>
 * This class contains the test cases for Worksheet1 solutions.
 *  <Testing Cases Below>
 */

public class Worksheet1Test {	

	/**
	  * Testing the power method in first part. 
	  */
	 @Test
	 public void testPower() {
		 int expectedValue = 512;
		 int actualValue = Worksheet1.power(2, 9);
		 assertEquals(expectedValue, actualValue);
	 }
	 
	 @Test
	 public void testFastPower() {
		 int expectedValue = 512;
		 int actualValue = Worksheet1.fastPower(2, 9);
		 assertEquals(expectedValue, actualValue);
	 }
	 
	 @Test
	 public void testNegateAll() {
		 List<Integer> a1 = new List<>(2, new List<>(-5, new List<>(8, new List<>(0, new List<>()))));
		 List<Integer> expectedValue = new List<>(-2, new List<>(5, new List<>(-8, new List<>(0, new List<>()))));
		 List<Integer> actualValue = Worksheet1.negateAll(a1);
		 assertEquals(expectedValue, actualValue);
	 } 
	 
	 @Test
	 public void testFind() {
		 List<Integer> a2 = new List<>(7, new List<>(5, new List<>(3, new List<>(8, new List<>()))));
		 int expectedValue = 3;
		 int actualValue = Worksheet1.find(8, a2);
		 assertEquals(expectedValue, actualValue);
	 }
	 
	 @Test
	 public void testAllPositive() {
		 List<Integer> a3 = new List<>(2, new List<>(-5, new List<>(8, new List<>(0, new List<>()))));
		 boolean expectedValue = false;
		 boolean actualValue = Worksheet1.allPositive(a3);
		 assertEquals(expectedValue, actualValue);
	 }
	 
	 @Test
	 public void testPositives() {
		 List<Integer> a4 = new List<>(2, new List<>(3, new List<>(-5, new List<>(8, new List<>(-2, new List())))));
		 List<Integer> expectedValue = new List<>(2, new List<>(3, new List<>(8, new List<>())));
		 List<Integer> actualValue = Worksheet1.positives(a4);
		 assertEquals(expectedValue, actualValue);
	 }
	 
	 @Test
	 public void testSorted() {
		 List<Integer> a5 = new List<>(2, new List<>(3, new List<>(7, new List<>(8, new List<>()))));
		 boolean expectedValue = true;
		 boolean actualValue = Worksheet1.sorted(a5);
		 assertEquals(expectedValue, actualValue);
	 }
	 
	 @Test
	 public void testMerge() {
		 List<Integer> a6 = new List<>(2, new List<>(5, new List<>(5, new List<>(8, new List<>()))));
		 List<Integer> b6 = new List<>(5, new List<>(7, new List<>(8, new List<>(9, new List<>()))));
		 List<Integer> expectedValue = new List<>(2, new List<>(5, new List<>(5, new List<>(5, new List<>(7, new List<>(8, new List<>(8, new List<>(9, new List<>()))))))));
		 List<Integer> actualValue = Worksheet1.merge(a6, b6);
		 assertEquals(expectedValue, actualValue);
	 }
	 
	 @Test
	 public void testRemoveDuplicates() {
		 List<Integer> a7 = new List<>(2, new List<>(5, new List<>(5, new List<>(5, new List<>(7, new List<>(8, new List<>(8, new List<>(9, new List<>()))))))));
		 List<Integer> expectedValue = new List<>(2, new List<>(5, new List<>(7, new List<>(8, new List<>(9, new List<>())))));
		 List<Integer> actualValue = Worksheet1.removeDuplicates(a7);
		 assertEquals(expectedValue, actualValue);
	 }

}
