package lab5;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.Assertions;
import java.util.List;
import java.util.ArrayList;
class Lab5Test {
	@Test 
	void testInvalidLength(){
		try {
			Triangle T = new Triangle(-3,5);
			assertFalse(true);
		}catch(IllegalArgumentException ex) {
			assertEquals(ex.getMessage(),"You crazy person! Length must be positive!");
		}
	}
	@Test
	void testInvalidWidth(){
	try {
		Triangle T = new Triangle(2,-5);
		assertFalse(true);
	}catch(IllegalArgumentException ex) {
		assertEquals("You nutjob! Width must be positive!",ex.getMessage());
	}
}
	@Test
	void testCalculateArea() {
		Triangle T = new Triangle(2,5);
	    assertEquals(10, T.calculateArea()); 
	}
	@Test
	void testCalculatePerimeter() {
		Triangle T = new Triangle(2,6);
	    assertEquals(16, T.calculatePerimeter()); 
	}

	@Test
	void testGetLength() {
		Triangle T = new Triangle(7,6);
	    assertEquals(7, T.getLength()); 
	}

	@Test
	void testGetWidth() {
		Triangle T = new Triangle(7,4);
	    assertEquals(4, T.getWidth()); 
	}

}
