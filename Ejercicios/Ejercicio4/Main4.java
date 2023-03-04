package Ejercicio4;


import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Ejercicio4 cuadricula = new Ejercicio4();

        
        int filaBarco = (int) (Math.random() * 10);
        int columnaBarco = (int) (Math.random() * 10);
        cuadricula.depositarBarco(filaBarco, columnaBarco);
        System.out.println("Se ha colocado un barco en la fila " + filaBarco + ", columna " + columnaBarco + ".");

        
        boolean hundido = false;
        while (!hundido) {
            
            cuadricula.visualizacion();

            
            System.out.print("Introduce la fila donde quieres disparar (0-9): ");
            int filaDisparo = scanner.nextInt();
            System.out.print("Introduce la columna donde quieres disparar (0-9): ");
            int columnaDisparo = scanner.nextInt();

            
            hundido = cuadricula.disparar(filaDisparo, columnaDisparo);
        }

       
        cuadricula.visualizacion();
        System.out.println("¡Has hundido el barco!");
    }
}
