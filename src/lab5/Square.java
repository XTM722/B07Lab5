package lab5;

public class Square 
{
	Point A;
	Point B;
	Point C;
	Point D;
	public Square(Point A, Point B, Point C,Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	public double perimeter() {
		return 4*A.distance(B);
	}
	public boolean isEquilateral() {
		double dAB = A.distance(B);
		double dBC = B.distance(C);
		double dCA = C.distance(A);
		double dCD = C.distance(D);
		if(dAB==dBC&&dAB==dCA&&dAB==dCD)
			return true;
		else
			return false;
	}
}
