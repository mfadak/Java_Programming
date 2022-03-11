package pkt;


public class Program {
	public static boolean KarakterAra(String  icerik, char chr) {
		if(icerik.length() == 0) return false;
		if(icerik.charAt(0) == chr) return true;
		return KarakterAra(icerik.substring(1), chr);
	}
	public static void main(String[] args) {
		String icerik = "Sakarya";
		if(KarakterAra(icerik, 't')) System.out.println("t harfi var");
		else System.out.println("t harfi yok");
		
		if(KarakterAra(icerik, 'y')) System.out.println("y harfi var");
		else System.out.println("y harfi yok");
	}
}
