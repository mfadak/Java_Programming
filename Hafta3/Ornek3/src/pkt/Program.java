package pkt;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ülke: ");
		String ulke = in.next();
		String uyruk = ulke == "Turkiye" ? "Turk" : "Yabanci";
		System.out.println("Uyruk: "+uyruk);
	}
}
