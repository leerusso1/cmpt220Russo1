
public class Octogon implements Cloneable, Comparable<Octogon> {
	private double side;

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException ex) {
			return null;
		}
	}

	@Override
	public int compareTo(Octogon o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double s1de) {
		this.side = s1de;
	}

	public Octogon() {
		side = 0;
	}

	public Octogon(double side) {
		this.side = side;
	}

	public double getArea() {
		double area = (2 + (4 / (Math.sqrt(2))) * side * side);
		return area;
	}

}
