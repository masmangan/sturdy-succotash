package pucrs.qp.adt;

import static org.junit.Assert.*;

import org.junit.Test;
public class LinkedListTest {

	@Test
	public void testAddNodeInLast() {
		LinkedList xs = new LinkedList();
		int expected = 0;
		int actual = xs.getSize();
		assertEquals(expected, actual);
	}

	@Test
	public void testListSingle() {
		LinkedList xs = new LinkedList();
		Node n = new Node("abc", null);
		xs.addNodeInLast(n);
		int expected = 1;
		int actual = xs.getSize();
		assertEquals(expected, actual);
	}

}
