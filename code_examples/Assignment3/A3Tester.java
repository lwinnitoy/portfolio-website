/*
 * A3Tester
 *
 * A class to test the methods required for Assignment 3
 *
 */
public class A3Tester {
    
	private static int testPassCount = 0;
	private static int testCount = 0;

    public static void main(String[] args) {
		
		/*
		Uncomment each method one at a time, 
		and implement the method in A3LinkedList.java 
		until all tests pass. It is strongly
		recommended that you add additional tests 
		to ensure the correctness of your implementation.
		*/
		
		/* Part 1: */
		// testAddFront();
		// testAddBack();
		testSizeAndIsEmpty();
		// testRemoveFront();
		// testRemoveBack();
		
		/* Part 2 */
		//testRemoveMiddle();
		testInterleave();
		
		System.out.println("Passed " + testPassCount + " / " + testCount + " tests");
    }
	
		
	public static void testAddFront() {
		System.out.println("\nTesting addFront...");
		String result = "";
		A3LinkedList list1 = new A3LinkedList();
		
		result = list1.frontToBack();
		displayResults(result.equals("{}"), "testAddFront");
		
		list1.addFront("A");
		result = list1.frontToBack();
		displayResults(result.equals("{A}"), "testAddFront");
		
		list1.addFront("V");
		list1.addFront("A");
		list1.addFront("J");
		result = list1.frontToBack();
		displayResults(result.equals("{JAVA}"), "testAddFront");
		result = list1.backToFront();
		displayResults(result.equals("{AVAJ}"), "testAddFront");
	}
	
	public static void testAddBack() {
		System.out.println("\nTesting addBack...");
		String result = "";
		A3LinkedList list1 = new A3LinkedList();
		
		result = list1.frontToBack();
		displayResults(result.equals("{}"), "testAddBack");
		
		list1.addBack("F");
		result = list1.frontToBack();
		displayResults(result.equals("{F}"), "testAddBack");
		
		list1.addBack("U");
		list1.addBack("N");
		result = list1.frontToBack();
		displayResults(result.equals("{FUN}"), "testAddBack");
		result = list1.backToFront();
		displayResults(result.equals("{NUF}"), "testAddBack");
	}
	
	public static void testSizeAndIsEmpty() {
		System.out.println("\nTesting size and isEmpty...");
		int result = 0;
		A3LinkedList list1 = new A3LinkedList();

		result = list1.size();
		displayResults(result==0, "testSizeAndIsEmpty");
		displayResults(list1.isEmpty()==true, "testSizeAndIsEmpty");
		
		list1.addFront("C");
		list1.addFront("S");
		list1.addFront("C");
		result = list1.size();
		displayResults(result==3, "testSizeAndIsEmpty");
		displayResults(list1.isEmpty()==false, "testSizeAndIsEmpty");
		
		list1.addBack("115");
		result = list1.size();
		displayResults(result==4, "testSizeAndIsEmpty");

		list1.removeBack();
		list1.removeBack();
		list1.removeBack();
		list1.removeMiddle();
		result = list1.size();
		displayResults(list1.isEmpty()==true, "testSizeAndIsEmpty");

		
	}
	
	public static void testRemoveFront() {
		System.out.println("\nTesting removeFront...");
		String result = "";
		A3LinkedList list1 = new A3LinkedList();
		
		list1.addBack("P");
		list1.addBack("I");
		list1.addBack("N");
		list1.addBack("K");
		result = list1.frontToBack();
		displayResults(result.equals("{PINK}"), "testRemoveFront");
		
		list1.removeFront();
		result = list1.frontToBack();
		displayResults(result.equals("{INK}"), "testRemoveFront");
		
		/* Write additional tests here to ensure all of your pointers
		   have been updated correctly.
		
		   You should also ensure that your size and isEmpty 
		   methods work with removal as well as addition 
		*/
		
		A3LinkedList list0 = new A3LinkedList();
		result = list0.frontToBack();
		displayResults(result.equals("{}"), "testRemoveFront");

		list1.addFront("P");
		list1.addBack("I");
		list1.addBack("S");
		list1.addBack("H");
		list1.removeFront();
		result = list1.frontToBack();
		displayResults(result.equals("{INKISH}"), "testAddFront, AddBack, RemoveFront");

		result = list1.backToFront();
		displayResults(result.equals("{HSIKNI}"), "testAddFront, AddBack, RemoveFront");

		list1.removeFront();
		list1.removeFront();
		list1.removeFront();
		list1.removeFront();
		list1.removeFront();
		result = list1.frontToBack();
		displayResults(result.equals("{H}"), "testRemoveFront, 1 item left list");

		list1.removeFront();
		result = list1.frontToBack();
		displayResults(result.equals("{}"), "testRemoveFront, empty list");
	}
	
	public static void testRemoveBack() {
		System.out.println("\nTesting removeBack...");
		String result = "";
		A3LinkedList list1 = new A3LinkedList();
		
		list1.addBack("P");
		list1.addBack("I");
		list1.addBack("N");
		list1.addBack("K");
		list1.removeBack();
		list1.addBack("S");
		result = list1.frontToBack();
		displayResults(result.equals("{PINS}"), "testRemoveBack");

		result = list1.backToFront();
		displayResults(result.equals("{SNIP}"), "testRemoveBack");

		list1.removeBack();
		list1.removeBack();
		list1.removeBack();
		list1.removeBack();
		list1.removeBack();

		result = "{}";
		displayResults(result.equals("{}"), "testRemoveBack, empty list");
	}
	
	public static void testRemoveMiddle() {
		System.out.println("\nTesting removeMiddle...");
		
		A3LinkedList list1 = new A3LinkedList();
		String result1 = "";
		list1.addBack("T");
		list1.addBack("A");
		list1.addBack("B");
		list1.addBack("L");
		list1.addBack("E");
		
		list1.removeMiddle();
		result1 = list1.frontToBack();
		displayResults(result1.equals("{TALE}"), "frontToBack after removeMiddle called on TABLE");
		result1 = list1.backToFront();
		displayResults(result1.equals("{ELAT}"), "backToFront after removeMiddle called on TABLE");
		
		list1 = new A3LinkedList();
		list1.addBack("B");
		list1.addBack("E");
		list1.addBack("T");
		list1.addBack("T");
		list1.addBack("E");
		list1.addBack("R");
		
		list1.removeMiddle();
		result1 = list1.frontToBack();
		displayResults(result1.equals("{BEER}"), "frontToBack after removeMiddle called on BETTER");
		result1 = list1.backToFront();
		displayResults(result1.equals("{REEB}"), "backToFront after removeMiddle called on BETTER");
		
		list1 = new A3LinkedList();
		list1.addBack("A");
		
		list1.removeMiddle();
		result1 = list1.frontToBack();
		displayResults(result1.equals("{}"), "frontToBack after removeMiddle called on length 1");
		result1 = list1.backToFront();
		displayResults(result1.equals("{}"), "backToFront after removeMiddle called on length 1");

		// Write additional tests here to ensure all of your pointers
		// and other fields have been updated correctly.

		list1.addBack("B");
		list1.removeMiddle();
		result1 = list1.frontToBack();
		displayResults(result1.equals("{}"), "frontToBack after removeMiddle called on length 1");

		list1.addBack("B");
		list1.addFront("A");
		list1.removeMiddle();
		result1 = list1.frontToBack();
		displayResults(result1.equals("{}"), "frontToBack after removeMiddle called on length 2");

		list1.addBack("B");
		list1.addFront("A");
		list1.addBack("B");
		list1.addFront("A");

		list1.removeMiddle();
		result1 = list1.frontToBack();
		displayResults(result1.equals("{AB}"), "frontToBack after removeMiddle called on length 4");
		result1 = list1.backToFront();
		displayResults(result1.equals("{BA}"), "frontToBack after removeMiddle called on length 4");

		list1.addBack("B");
		list1.addFront("A");
		list1.addBack("B");
		list1.addFront("A");

		list1.removeMiddle();
		result1 = list1.backToFront();
		displayResults(result1.equals("{BBAA}"), "frontToBack after removeMiddle called on length 6");
		result1 = list1.frontToBack();
		displayResults(result1.equals("{AABB}"), "frontToBack after removeMiddle called on length 6");

		list1.removeMiddle();
		list1.removeMiddle();
		list1.removeMiddle();
		list1.removeMiddle();
		list1.removeMiddle();
		list1.removeMiddle();

		list1.addBack("L");
		list1.addBack("i");
		list1.addBack("a");
		list1.addBack("m");
		list1.addBack(" ");
		list1.addBack("W");
		list1.addBack("i");
		list1.addBack("n");
		list1.addBack("n");
		list1.addBack("i");
		list1.addBack("t");
		list1.addBack("o");
		list1.addBack("y");

		result1 = list1.frontToBack();
		displayResults(result1.equals("{Liam Winnitoy}"), "frontToBack after removeMiddle called on liam's name");
	}
	
	
	public static void testInterleave() {
		System.out.println("\nTesting interleave...");
		A3LinkedList list1 = new A3LinkedList();
		A3LinkedList list2 = new A3LinkedList();
		String result1 = "";
		String result2 = "";
		
		list1.addBack("A");
		list1.addBack("B");
		list1.addBack("C");
		list1.addBack("D");
		list1.addBack("E");
		list1.addBack("F");
		list1.addBack("G");
		result1 = list1.frontToBack();
		displayResults(result1.equals("{ABCDEFG}"), "testInterleave, original first list is ABCDEFG");
		
		list2.addBack("L");
		list2.addBack("M");
		list2.addBack("N");
		list2.addBack("O");
		list2.addBack("P");
		list2.addBack("Q");
		list2.addBack("R");
		result2 = list2.frontToBack();
		displayResults(result2.equals("{LMNOPQR}"), "testInterleave, original second list is LMNOPQR");
		
		list1.interleave(list2);
		result1 = list1.frontToBack();
		result2 = list2.frontToBack();
		displayResults(result1.equals("{AMCOEQG}"), "after interleave, first list now contains AMCOEQG");
		displayResults(result2.equals("{LBNDPFR}"), "after interleave, second list now contains LBNDPFR");

		// Write additional tests here to ensure all of your pointers
		// have been updated correctly.
		list1.interleave(list2);

		result1 = list1.frontToBack();
		result2 = list2.frontToBack();
		displayResults(result1.equals("{ABCDEFG}"), "after interleave, first list now contains ABCDEFG");
		displayResults(result2.equals("{LMNOPQR}"), "after interleave, second list now contains LMNOPQR");

		A3LinkedList list3 = new A3LinkedList();
		A3LinkedList list4 = new A3LinkedList();
		list3.addFront("h");
		list3.addFront("i");
		list4.addFront("y");
		list4.addFront("e");
		list3.interleave(list4);
		result1 = list3.frontToBack();
		result2 = list4.frontToBack();
		displayResults(result1.equals("{iy}"), "after interleave, first list now contains iy");
		displayResults(result2.equals("{eh}"), "after interleave, second list now contains eh");

		list1.interleave(list2);
		result1 = list1.backToFront();
		result2 = list2.backToFront();
		displayResults(result1.equals("{GQEOCMA}"), "after interleave, first list now contains GQEOCMA");
		displayResults(result2.equals("{RFPDNBL}"), "after interleave, second list now contains RFPDNBL");

		list3.removeFront();
		list4.removeFront();
		list3.interleave(list4);
		result1 = list3.frontToBack();
		result2 = list4.frontToBack();
		displayResults(result1.equals("{y}"), "after interleave, first list now contains iy");
		displayResults(result2.equals("{h}"), "after interleave, second list now contains eh");


	}
	
	public static void displayResults (boolean passed, String testName) {
       /* There is some magic going on here getting the line number
        * Borrowed from:
        * http://blog.taragana.com/index.php/archive/core-java-how-to-get-java-source-code-line-number-file-name-in-code/
        */
        
        testCount++;
        if (passed)
        {
            System.out.println ("Passed test: " + testName);
            testPassCount++;
        }
        else
        {
            System.out.println ("Failed test: " + testName + " at line "
                                + Thread.currentThread().getStackTrace()[2].getLineNumber());
        }
    }
	
}
