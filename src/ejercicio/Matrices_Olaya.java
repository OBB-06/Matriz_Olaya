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
        
        
	}	

}
