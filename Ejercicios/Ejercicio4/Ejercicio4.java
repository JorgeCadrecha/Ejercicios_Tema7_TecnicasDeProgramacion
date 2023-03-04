package Ejercicio4;

public class Ejercicio4 {
    
    public static final int AGUA = 0;
    public static final int BARCO = 1;
    public static final int TOCADO = 2;
    public static final int HUNDIDO = 3;

    
    private int[][] tablero;

    
    public Ejercicio4() {
        this.tablero = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                this.tablero[i][j] = AGUA;
            }
        }
    }

    
    public void depositarBarco(int fila, int columna) {
        this.tablero[fila][columna] = BARCO;
    }

    
    public boolean disparar(int fila, int columna) {
        if (this.tablero[fila][columna] == BARCO) {
            this.tablero[fila][columna] = TOCADO;
            if (this.hundido(fila, columna)) {
                System.out.println("¡Hundido!");
                return true;
            } else {
                System.out.println("¡Tocado!");
                return false;
            }
        } else {
            System.out.println("Agua...");
            return false;
        }
    }

    
    private boolean hundido(int fila, int columna) {
        int tamano = 1;
        while (fila + tamano < 10 && this.tablero[fila + tamano][columna] == TOCADO) {
            tamano++;
        }
        if (fila + tamano < 10 && this.tablero[fila + tamano][columna] == BARCO) {
            return false;
        }
        tamano = 1;
        while (columna + tamano < 10 && this.tablero[fila][columna + tamano] == TOCADO) {
            tamano++;
        }
        if (columna + tamano < 10 && this.tablero[fila][columna + tamano] == BARCO) {
            return false;
        }
        return true;
    }

    
    public void visualizacion() {
        System.out.print("  ");
        for (int j = 0; j < 10; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 10; j++) {
                switch (this.tablero[i][j]) {
                    case AGUA:
                        System.out.print(". ");
                        break;
                    case BARCO:
                        System.out.print("O ");
                        break;
                    case TOCADO:
                        System.out.print("X ");
                        break;
                    case HUNDIDO:
                        System.out.print("# ");
                        break;
                }
            }
            System.out.println();
        }
    }
}
