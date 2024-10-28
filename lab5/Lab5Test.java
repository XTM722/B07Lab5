package lab5;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.Assertions;
import java.util.List;
import java.util.ArrayList;
class Lab5Test {
	@Test 
	void testCalculateArea(){
			Point A = new Point(0,0);
			Point B = new Point(0,4);
			Point C = new Point(3,0);
			Point D = new Point(1,2);
			Rectangle R = new Rectangle(A,B,C,D);
	    assertEquals(12, R.area()); 
	}
	@Test
	void testCalculatePerimeter() {
		Point A = new Point(0,0);
		Point B = new Point(0,4);
		Point C = new Point(3,0);
		Point D = new Point(1,2);
		Rectangle R = new Rectangle(A,B,C,D);
    assertEquals(14, R.perimeter()); 
    }
}
