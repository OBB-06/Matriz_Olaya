package ejercicio;

import java.util.Random;
import java.util.Scanner;

public class Matrices_Olaya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = new int[5][5]; // Matriz de 5x5
		
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
		
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100) + 1; // Generar número entre 1 y 100
            }
        }
        System.out.println("Matriz generada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t"); // Mostrar elemento con tabulación
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
        
        System.out.println("\nIntroduce un número para buscar en la matriz:");
        int numeroBuscado = scanner.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numeroBuscado) {
                    System.out.println("El número " + numeroBuscado + " se encuentra en la posición: Fila " + (i + 1) + ", Columna " + (j + 1));
                    encontrado = true;
                }
            }
        }
        
	}	

}
