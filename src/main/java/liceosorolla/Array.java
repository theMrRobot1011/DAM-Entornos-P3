package main.java.liceosorolla;

public class Array {

	public static void main(String[] args) {
		int[]numeros={1,25,5,15,10};
		System.out.println("La mediana es "+calcularMediana(numeros));
	}
	
	  private static double calcularMediana(int[]numeros){
		  int med=0;
			java.util.Arrays.sort(numeros);
			if(numeros.length%2!=0) {
				med=numeros[numeros.length/2];
			}else {
				med=(numeros[numeros.length/2]+numeros[numeros.length/2-1])/2;
			}
			
			return med;
		}
}
