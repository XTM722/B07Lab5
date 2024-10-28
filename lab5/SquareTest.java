package lab5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    public void squareNotNull(){
        Point A = new Point(0, 0);
        Point B = new Point(0, 1);
        Point C = new Point(1, 0);
        Point D = new Point(1, 1);
        Square square = new Square(A, B, C, D);
        assertFalse(square == null, "Square object should not be null.");
    }
    @Test
    public void squarePerimeterTest(){
        Point A = new Point(0, 0);
        Point B = new Point(0, 1);
        Point C = new Point(1, 0);
        Point D = new Point(1, 1);
        Square square = new Square(A, B, C, D);
        double perimeter = square.perimeter();
        assertEquals(4.0, perimeter);
    }
    @Test
    public void squareAreaTest(){
        Point A = new Point(0, 0);
        Point B = new Point(0, 1);
        Point C = new Point(1, 0);
        Point D = new Point(1, 1);
        Square square = new Square(A, B, C, D);
        double area = square.area();
        assertEquals(1.0, area);
    }

}