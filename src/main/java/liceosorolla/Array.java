package main.java.liceosorolla;

public class Array {

	public static void main(String[] args) {
		int[]numeros={1,25,5,15,10};
		System.out.println("El numero minimo es "+minimo(numeros));
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
