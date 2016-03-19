package lab;

import static org.junit.Assert.*;

import org.junit.Test;


public class triangleTest {
	private triangle triangle = new triangle();

	@Test
	public void test() {
		
		triangle.TypeOfTriangle(2, 2, 2);
		assertEquals(1,triangle.getResult());
		
		triangle.TypeOfTriangle(2, 1, 2);
		assertEquals(2,triangle.getResult());
		
		triangle.TypeOfTriangle(3, 4, 5);
		assertEquals(3,triangle.getResult());
		
		triangle.TypeOfTriangle(0, 1, 2);
		assertEquals(4,triangle.getResult());
	}
	
}
