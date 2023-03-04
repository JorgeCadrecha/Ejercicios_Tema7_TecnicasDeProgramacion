package Ejercicio4;

public class Ejercicio4 {

    public static final int ancho = 4;
    public static final int largo = 4;
    public static final char tocado = 'x';
    public static final char no_tocado = '~';
    public static final char barco = 'b';
    public static final char agua = 'a';
    private char[][] tablero = new char[largo][ancho];

    public Ejercicio4() {
        for (int j = 0; j < largo; j++) {
            for (int i = 0; i < ancho; i++){
                this.tablero[j][i] = agua;
            }
        }
    }

    public void posicionarBarco(int x, int y) {
        this.tablero[y - 1][x - 1] = barco;
    }

    public boolean disparar(int x, int y) {
        if (this.tablero[y - 1][x - 1] != barco)
        {
            this.tablero[y - 1][x - 1] = no_tocado;
        }
        else {
            this.tablero[y - 1][x - 1] = tocado;
        }
        return this.tablero[y - 1][x - 1] == tocado;
    }


    public void mostrar() {
        for (int j = 0; j < largo; j++) {
            for (int i = 0; i < ancho; i++)
                if (this.tablero[j][i] == barco || this.tablero[j][i] == agua) {
                    System.out.print("?");
                }
                else {
                    System.out.print(this.tablero[j][i]);
                }
            System.out.println();
        }
    }

}
