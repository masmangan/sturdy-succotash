package pucrs.qp.adt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NodeTest {

	@Test
	public void testGetData() {
		String expected = "xyz";
		Node n = new Node(expected, null);
		String actual = n.getData();
		assertEquals(expected,actual);
	}

}
