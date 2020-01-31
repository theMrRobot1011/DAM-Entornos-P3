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
		
		maximo = calculaMximo(numeros);
		System.out.println("El numero mas alto es "+maximo);
	}
}
