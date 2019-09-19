/**
 * @author <Bharath Kannan> This class contains the solution for Worksheet1 of Semester 2.
 * 
 */

 public class Worksheet1 {

	// Exercise 1
/**
 * Writing a method with the powers, anything raised to the power of 0 returns a value of 1.  else calculate the power value.
 * @param m
 * @param n
 * @return
 */
	 static int power(int m, int n) {
	     if (n == 0) {
		 return 1;
	     } else {
		 return (m * power(m, n - 1));
	     }
	}

     /*
Fast Power. Given integers m, n >= 0, compute m^n more efficiently using
m^n = 1, if n = 0
(m^n/2)^2, if n even
mm^n-1, if n odd 
      */
/**
 * A method to return the value of power in a more faster efficient manner. 
 * @param m
 * @param n
 * @return
 */
	 static int fastPower(int m, int n) {
	     if (n == 0) {
		 return 1;
	     } else if (n%2 ==0) {
		 return (fastPower(m*m, n/2));
	     } else {
		 return (m * fastPower(m, n - 1));
	     }
	}

	// Exercise 2
/**
 * Inverting the signs on the values in the list. 
 * @param list
 * @return
 */
	 static List<Integer> negateAll(List<Integer> a) {
	     
	     if (a.isEmpty()) {
		 return a;
	     } else {
		 return new List<Integer>(-a.getHead(), negateAll(a.getTail())); // Inverse the signs. Multiply -1 by any number will invert the signs
	     }
	}

	// Exercise 3
/**
 * Trying to find the x value in the list. 
 * @param x
 * @param a
 * @return
 */
	 static int find(int x, List<Integer> a) {
		 
		 if (a.getHead() == x) {
			 return 0;
		 } else if (a.isEmpty()) {
			 throw new IllegalArgumentException("Empty list");
		 } else {
			 return find(x, a.getTail()) + 1; // This is the counter which acts like a count++ 
		 }
	}

	// Exercise 4
/**
 * Checking to see if all the values are positive, if they are, a boolean value of true should be returned.
 * @param a
 * @return
 */
	 static boolean allPositive(List<Integer> a) {
	
		 if (a.isEmpty()) {
			 return true;
		 } else if (a.getHead() > 0) {
			 return allPositive(a.getTail());
		 } else {
			 return false;
		 }
	}

	// Exercise 5
/**
 * The output should only return the positive values, any negative values are withheld.
 * @param a
 * @return
 */
	 static List<Integer> positives(List<Integer> a) {
		if (a.isEmpty()) {
			return a;
		} else if (a.getHead() > 0) {
			return new List<Integer>(a.getHead(), positives(a.getTail()));
		} else {
			return positives(a.getTail());
		}
	}

	// Exercise 6
/**
 * Checking to see whether values are stored in ascending order, if they are then return the value of true
 * @param a
 * @return
 */
	 static boolean sorted(List<Integer> a) {
		 // comparing one part of the list to the next one
	 
		 if (a.isEmpty()) {
			 return true;
		 } else if (a.getTail().isEmpty()) {
				 return true;
		 } else if (a.getHead() <= a.getTail().getHead()) {
			 return sorted(a.getTail());
		 } else {
			 return false;
		 } 
	 } 

	// Exercise 7
/**
 * A code to merge the lists of both a and b and sort them in ascending order.
 * Returning the values of a and b if the lists are empty.
 * If a is less than the b value, we return the new lists and merge the a and b. 
 * @param a
 * @param b
 * @return 
 */
	 static List<Integer> merge(List<Integer> a, List<Integer> b) {
		 if (a.isEmpty()) {
			 return b;
		 }
		 else if (b.isEmpty()) {
			 return a;
		 }
		 else if (a.getHead() <= b.getHead()) {
			 return new List<Integer>(a.getHead(), merge(a.getTail(), b));
		 } else {
			 return new List<Integer>(b.getHead(), merge(a, b.getTail()));
		 }
	}

	// Exercise 8
/**
 * A code that detects duplicates and removes them if it finds them. 
 * If the a get Head equals to the get tail and get head, remove the duplicates
 * by running the a get Tail in the argument. 
 * If no duplicates are found, the list is returned. 
 * @param a
 * @return
 */
	static List<Integer> removeDuplicates(List<Integer> a) {
		if (a.isEmpty()) {
			return a;
		} else if (a.getTail().isEmpty()) {
			return a;
		} 
		else if (a.getHead() == a.getTail().getHead()) {
			return removeDuplicates(a.getTail());
		} else 
		return new List<Integer>(a.getHead(), removeDuplicates(a.getTail()));
	}
	
	 public static void main(String[] args) {
	    	
	    	int firstValue = 2;
	    	int secondValue = 9;
	    	System.out.println("Exercise 1: " + firstValue + " to the power of " + secondValue);
	    	System.out.println("Exercise 1 - Power: " + power(firstValue, secondValue));
	    	System.out.println("Exercise 1 - fastPower: " + fastPower(firstValue, secondValue));
	    	
	    	
	    	List<Integer> a = new List(2, new List(-5, new List(8, new List(0, new List()))));
	      	System.out.println("Exercise 2 Original:" + a);
	      	System.out.println("Exercise 2 Answer:" + negateAll(a));
	      	
	      	List<Integer> b= new List<>(7, new List<> (5, new List<>(3, new List<>(8, new List<>()))));
	      	System.out.println("Exercise 3 Before: " + b);
	      	System.out.println("Exercise 3 Finding Element 3" );
	        System.out.println("Exercise 3 Answer: Index " + find(3,b));
	        
	        List<Integer> c = new List<>(2, new List<> (3, new List<>(5, new List<>(8, new List<>(2, new List<>())))));
	        System.out.println("Exercise 4 Before: " + c);
	        System.out.println("Exercise 4 Answer: " + allPositive(c));
	        
	        // List<Integer> d = new List<>(2, new List<> (3, new List<>(-5, new List<>(8, new List<>(-2, new List<>())))));
	        List d = new List<>(2, new List<> (3, new List<>(-5, new List<>(8, new List<>(-2, new List<>())))));
	        System.out.println("Exercise 5 Before: " + d);
	        System.out.println("Exercise 5 Answer: " + positives(d));
	        
	        List e = new List<>(2, new List<> (3, new List<>(5, new List<>(8, new List<>(9, new List<>())))));
	        System.out.println("Exercise 6 Before: " + e);
	        System.out.println("If it's sorted in ascending order, return true");
	        System.out.println("Exercise 6 Answer: " + sorted(e));
	        
	        List f2 = new List<>(5, new List<> (7, new List<>(8, new List<>(9, new List<>()))));
	        
	        List f = new List<>(2, new List<> (5, new List<>(5, new List<>(8, new List<>()))));
	        System.out.println("Exercise 7 Before: " + f + " and " + f2);
	        System.out.println("Exercise 7 Answer: " + merge(f, f2));
	        
	        List g = new List<>(2, new List<> (5, new List<>(5, new List<>(7, new List<>(8, new List(8, new List(9, new List())))))));
	        System.out.println("Exercise 8 Before: " + g);
	        System.out.println("Exercise 8 Answer: " + removeDuplicates(g));
	    
	    }
	
}
