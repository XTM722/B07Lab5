package Lab5;

public class Circle {
	Point A;
	double radius;
	public Circle (Point A1, double radius1) {
		this.A = A1;
		this.radius = radius1;
		}
		public double perimeter() {
		return Math.PI *(2*radius);
		}
		public double areaOfcicle() {
			return Math.PI *(radius*radius);
			}
		public boolean isEqualperimeter(Circle c1) {
		double c = c1.radius;
		if( c== radius) {
			return true;
		}
		return false;
		}
		public boolean isEqualarea(Circle c1) {
			double c = c1.radius;
			if( c== radius) {
				return true;
			}
			return false;
			}
}
