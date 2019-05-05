class Point{
	private int x,y;
	public Point () {this.x = 0;this.y = 0;}
	public Point(int x, int y) {this.x = x; this.y = y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x = x; this.y = y;}
	
}

class ColorPoints extends Point{
	private String color;
	public ColorPoints() {
		this.color = "black";
	}
	public ColorPoints(int x, int y) {
		super(x,y);
	}
	public void setXY(int x, int y) {move(x,y);}
	public void setColor(String color) {this.color = color;}
	public String toString() {
		return color + "색의 (" + getX() + "," + getY() + ")의점";
	}
	
}
public class ColorPoint {
	public static void main(String[] args) {
		ColorPoints zeroPoint = new ColorPoints();
		System.out.println(zeroPoint.toString()+"입니다.");
		
		ColorPoints cp = new ColorPoints(10,10);
		cp.setXY(5,5);
		cp.setColor("red");
		System.out.println(cp.toString()+"입니다.");
	}

}
