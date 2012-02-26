package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import de.schach.NQueensAlgorithm;
import de.schach.Point;
import de.schach.Checkboard;

public class SchachbrettTest {
	
	@Test
	public void board8PrintTest() {
		Point e = new Point(4,3);
		Point f = new Point(6,1);
		
		List<Point> points = new ArrayList<Point>();
		points.add(e);
		points.add(f);
		
		Checkboard brett = new Checkboard(points, 8);  // board with 8 column/rows
		brett.print();
		
		assertTrue(brett.getField(e));
		assertTrue(brett.getField(f));
	}
	
	@Test
	public void board4PrintTest() {
		System.out.println("\n----------------------------");
		Point a = new Point(3,3);
		Point b = new Point(1,0);
		Point c = new Point(2,2);
		Point d = new Point(1,3);
		
		List<Point> points = new ArrayList<Point>();
		points.add(a);
		points.add(b);
		points.add(c);
		points.add(d);
		Checkboard board = new Checkboard(points, 4);
		board.print();
		
		assertTrue(board.getField(d));
	}

	@Test
	public void interfereTest() {
		
		Point a = new Point(0,0);
		Point b = new Point(1,1);
		Point c = new Point(1,2);
		Point d = new Point(2,1);
		Point e = new Point(4,3);
		Point f = new Point(6,1);
		
		assertTrue(a.doInterfere(b));
		assertFalse(a.doInterfere(c));
		assertTrue(b.doInterfere(c));
		assertTrue(d.doInterfere(e));
		assertTrue(e.doInterfere(f));
		assertTrue(d.doInterfere(f));
	}
}
