package main.java.liceosorolla;

public class Numero {
	

	public static String comprobarPrimo(int numero) {
		String primo="";
		int contador=0;
		for(int i=2;i<=numero-1;i++) {
			if(numero%i==0) {
				contador++;
			}
		}
		if(contador==0) {
			primo = "si";
		}else {
			primo = "no";
		}
		return primo;
	}
	
	public static int factorial(int numero) {
		int factorial=1;
		for(int i=1;i<=numero;i++) {
			factorial=factorial*i;
		}
		return factorial;

	}
	
	public static void main(String[] args) {
		int numero= 5;
		System.out.println("Este numero "+comprobarPrimo(numero)+" es primo");
		System.out.println("El factorial es "+factorial(numero));
	}

}
