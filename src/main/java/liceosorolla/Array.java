package main.java.liceosorolla;

public class Array {
	
	public static int calculaMximo( int[] letras)  throws Exception {
		int maximo=0;
		for(int i =0;i<=letras.length-1;i++) {
			if(i==0) {
				maximo= letras[i];
			}else if(maximo<letras[i]){
				maximo= letras[i];
			}
		}
		
		return maximo;
	}
	
	public static void main(String[] args) throws Exception {
		int maximo=0;
		int[]numeros={1,25,5,15,10};
		System.out.println("La mediana es "+calcularMediana(numeros));
		maximo = calculaMximo(numeros);
		System.out.println("El numero mas alto es "+maximo);
		System.out.println("El numeor mas bajo es "+minimo(numeros));
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
	  public static int minimo(int[]array) {
		  int min=array[0];
		  for(int i=0;i<array.length;i++) {
			  if(array[i]<min) {
				  min=array[i];
			  }
		  }
		  return min;
	  }
}
