

package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    private static final int FILAS = 10;
    private static final int COLUMNAS = 10;
    private static final char AGUA = 'A';
    private static final char BARCO = 'B';
    private static final char TOCADO = 'T';
    private static final char HUNDIDO = 'H';
    private char[][] tablero;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio3 c = new Ejercicio3();
        int x, y;
        boolean hundido = false;
        c.depositarBarco();
        while (!hundido) {
            c.visualizacion();
            System.out.println("Introduce las coordenadas de disparo X:");
            x = sc.nextInt();
            System.out.println("Introduce las coordenadas de disparo Y:");
            y = sc.nextInt();
            hundido = c.disparar(x, y);
            c.visualizacion();
        }
    }

    public Ejercicio3() {
        tablero = new char[FILAS][COLUMNAS];
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tablero[i][j] = AGUA;
            }
        }
    }

    public void depositarBarco() {
        tablero[0][0] = BARCO;
    }

    public boolean disparar(int x, int y) {
        if (tablero[x][y] == BARCO) {
            tablero[x][y] = TOCADO;
            if (tablero[0][0] == TOCADO) {
                tablero[0][0] = HUNDIDO;
                return true;
            }
        }
        return false;
    }

    public void visualizacion() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

}