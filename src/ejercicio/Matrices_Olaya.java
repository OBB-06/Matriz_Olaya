package ejercicio;

import java.util.Random;
import java.util.Scanner;

public class Matrices_Olaya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = new int[5][5]; // Matriz de 5x5
		
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Matriz:");
		for (int i = 0; i < matriz.length; i++) { // Iterar filas
		    for (int j = 0; j < matriz[i].length; j++) { // Iterar columnas
		        System.out.print(matriz[i][j] + "-"); // Mostrar elemento
		    }
		    System.out.println(); // Salto de línea al final de cada fila
		}
		
	}	

}
