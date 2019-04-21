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
		System.out.println(year+"년"+country+"국적"+artist+"가 부른"+title);
	}
	public static void main(String[] args) {
		Practices song = new Practices("Dancing Queen","ABBA",1978,"스웨덴");
		song.show();
		
	}
}