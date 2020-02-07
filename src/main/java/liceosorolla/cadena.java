package main.java.liceosorolla;

public class cadena {

	public static void main(String[] args) {

		String hola="hola";
		System.out.println("La longitud de "+hola+" es: "+longitud(hola));
	}
	public static int longitud(String cadena) {
		int longitud=cadena.length();
		return longitud;
	}
	public static String MayusMinus(String cadena) {
		String mayusminus = cadena.toUpperCase()+" "+cadena.toLowerCase();
		return mayusminus;
	}
}
