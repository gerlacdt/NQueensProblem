package test;

import static org.junit.Assert.*;

import org.junit.Test;

import de.schach.NQueensAlgorithm;


public class NQueensAlgorithmTest {
	
	@Test 
	public void board4FieldsTest() {
		NQueensAlgorithm queenAlgorithm = new NQueensAlgorithm();
		queenAlgorithm.execute(4);
		assertTrue(queenAlgorithm.getNumberOfSolutions() == 2);
	}
	
	@Test 
	public void board5FieldsTest() {
		NQueensAlgorithm queenAlgorithm = new NQueensAlgorithm();
		queenAlgorithm.execute(5);
	}
	
	@Test 
	public void board6FieldsTest() {
		NQueensAlgorithm queenAlgorithm = new NQueensAlgorithm();
		queenAlgorithm.execute(6);
	}
	
	@Test 
	public void board7FieldsTest() {
		NQueensAlgorithm queenAlgorithm = new NQueensAlgorithm();
		queenAlgorithm.execute(7);
	}
	
	@Test 
	public void board8FieldsTest() {
		NQueensAlgorithm queenAlgorithm = new NQueensAlgorithm();
		queenAlgorithm.execute(8);
		assertTrue(queenAlgorithm.getNumberOfSolutions() == 92);
	}
}
