
public class Excercise13_7 {
	class Square extends geometric_object implements Colorable {

		private double x;
		private double y;
		private double side;

		Square() {
			this(0, 0, 10);
		}

		Square(double x, double y, double side) {
			this.x = x;
			this.y = y;
			this.side = side;
		}

		@Override
		public double getArea() {
			return side * side;
		}

		@Override
		public double getPerimeter() {
			return side * 4;
		}

		@Override
		public String howToColor() {
			return "Color all four sides.";
		}

		public double getX() {
			return x;
		}

		public void setX(double x) {
			this.x = x;
		}

		public double getY() {
			return y;
		}

		public void setY(double y) {
			this.y = y;
		}

		public double getSide() {
			return side;
		}

		public void setSide(double side) {
			this.side = side;
		}
	}

	interface Colorable {

	    String howToColor();
}
