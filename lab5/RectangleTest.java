package lab5;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.Assertions;
import java.util.List;
import java.util.ArrayList;
class RectangleTest {
	@Test 
	void testCalculateArea(){
			Point A = new Point(0,0);
			Point B = new Point(0,4);
			Point C = new Point(5,0);
			Point D = new Point(5,4);
			Rectangle R = new Rectangle(A,B,C,D);
	    assertEquals(20, R.area()); 
	}
	@Test
	void testCalculatePerimeter() {
		Point A = new Point(0,0);
		Point B = new Point(0,4);
		Point C = new Point(4,0);
		Point D = new Point(4,4);
		Rectangle R = new Rectangle(A,B,C,D);
    assertEquals(16, R.perimeter()); 
    }
}
