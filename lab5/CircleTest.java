package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {

	@Test
	public void testP() {
		Point p = new Point(0,0);
		Circle c = new Circle(p, 5);
		double Per = 2* Math.PI * 5.0;
		assertEquals(Per,c.perimeter(),0.001);
	}
	
	@Test
	public void testArea(){
		Point p = new Point(0,0);
		Circle c = new Circle(p, 5);
		double A = Math.PI * 5.0 * 5.0;
		assertEquals(A,c.areaOfcircle(), 0.001);
	}
	
    @Test
    public void testIsEqualPerimeter_True() {
        Point c1 = new Point(0, 0);
        Point c2 = new Point(1, 1);
        Circle circle1 = new Circle(c1, 5.0);
        Circle circle2 = new Circle(c2, 5.0);
        assertTrue(circle1.isEqualperimeter(circle2));
    }

    @Test
    public void testIsEqualPerimeter_False() {
        Point c1 = new Point(0, 0);
        Point c2 = new Point(1, 1);
        Circle circle1 = new Circle(c1, 5.0);
        Circle circle2 = new Circle(c2, 3.0);
        assertFalse(circle1.isEqualperimeter(circle2));
    }

    @Test
    public void testIsEqualArea_True() {
        Point c1 = new Point(0, 0);
        Point c2 = new Point(1, 1);
        Circle circle1 = new Circle(c1, 5.0);
        Circle circle2 = new Circle(c2, 5.0);
        assertTrue(circle1.isEqualarea(circle2));
    }

    @Test
    public void testIsEqualArea_False() {
        Point c1 = new Point(0, 0);
        Point c2 = new Point(1, 1);
        Circle circle1 = new Circle(c1, 5.0);
        Circle circle2 = new Circle(c2, 3.0);
        assertFalse(circle1.isEqualarea(circle2));
    }
    
}
