import java.util.Scanner;

public class Practices {
	String title,artist,country;
	int year;
	public Practices() {
		
	}
	public Practices(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	public void show() {
		System.out.println(year+"��"+country+"����"+artist+"�� �θ�"+title);
	}
	public static void main(String[] args) {
		Practices song = new Practices("Dancing Queen","ABBA",1978,"������");
		song.show();
		
	}
}