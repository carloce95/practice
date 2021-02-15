import java.util.Scanner;
import java.util.Locale;
public class TableroArrays {

  public static void main(String[] args) {
	Scanner lector = new Scanner(System.in);
	lector.useLocale(Locale.US);
	int[][] tablero = new int [3][3];
	
	tablero [0][0] = 1;
	tablero [0][1] = 1;
	tablero [0][2] = 1;
	
	tablero [1][0] = 2;
	tablero [1][1] = 2;
	tablero [1][2] = 2;
	
	tablero [2][0] = 3;
	tablero [2][1] = 3;
	tablero [2][2] = 3;
	
	for (int fila = 0; fila < 3; fila++){
	 
	 for (int columna = 0; columna < 3; columna++) {
	         System.out.print (tablero[fila][columna] + " ");
	 }
	    System.out.println ();
	}

	
	}
	
}
