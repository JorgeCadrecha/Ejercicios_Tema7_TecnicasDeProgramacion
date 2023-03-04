package Ejercicio4;
import java.util.*;

public class Main4 {
    private static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        Ejercicio4 tablero_Jugardor, tablero_Ordenador;
        boolean gana;

        tablero_Ordenador = new Ejercicio4();
        Random random = new Random();
        int x = random.nextInt(Ejercicio4.ancho) + 1;
        int y = random.nextInt(Ejercicio4.largo) + 1;
        tablero_Ordenador.posicionarBarco(x, y);


        tablero_Jugardor = new Ejercicio4();
        System.out.println("Ubique su barco");
        x = introducir("¿Qué columna?(Eje X)", 1, Ejercicio4.ancho);
        y = introducir("¿Qué fila?(Eje Y)", 1, Ejercicio4.largo);
        tablero_Jugardor.posicionarBarco(x, y);

        boolean[][] aleatorio = new boolean[Ejercicio4.ancho][Ejercicio4.largo];

        do {

            System.out.println("Tu tabla de disparo: (Es la que repesenta tus disparos)");
            tablero_Ordenador.mostrar();
            x = introducir("¿Qué columna?(Eje X)", 1, Ejercicio4.ancho);
            y = introducir("¿Qué fila?(Eje Y)", 1, Ejercicio4.largo);
            gana = tablero_Ordenador.disparar(x, y);

            if (gana) {
                System.out.println("Tocado y hundido. Ha ganado");
                tablero_Ordenador.mostrar();
            } else {
                 do {
                        x = random.nextInt(Ejercicio4.ancho) + 1;
                        y = random.nextInt(Ejercicio4.largo) + 1;
                 }while (aleatorio[x-1][y-1]);
                    aleatorio[x-1][y-1] = true;

                 x = random.nextInt(Ejercicio4.ancho) + 1;
                 y = random.nextInt(Ejercicio4.largo) + 1;

                System.out.println("El ordenador disparó en " + x + "(Eje X); " + y + "(Eje Y)");

                gana = tablero_Jugardor.disparar(x, y);

                System.out.println("Tabla de disparo del ordenador: (Es la que repesenta los disparos del ordenador)");
                tablero_Jugardor.mostrar();

                if (gana) {
                    System.out.println("Tocado y hundido. Ha perdido");
                }
            }
        } while (!gana);
    }

    public static int introducir(String mensaje, int min, int max) {
        int valor;

        System.out.println(mensaje);
        valor = console.nextInt();
        console.nextLine();

        while (valor < min || valor > max) {
            System.out.println("El valor debe estar comprendido entre " + min + " y " + max);
            System.out.println(mensaje);
            valor = console.nextInt();
            console.nextLine();
        }
        return valor;
    }

    //Cordenadas del barco de ordenador que no se repitan

    private  Set<String> generarCordenadas;
    private  Random random;

    public  void CordenadasAleatorias() {
        generarCordenadas = new HashSet<>();
        random = new Random();
    }
    public int CordenadasAleatoriasX(int min, int max)
    {
    return random.nextInt(max - min + 1) + min;
    }
    public int CordenadasAleatoriasY(int min, int max)
    {
    return random.nextInt(max - min + 1) + min;
    }
    public String CordenadasAleatoriasXY(int min, int max)
    {
        String cordenadas = null;
    do {
        int x = CordenadasAleatoriasX(min, max);
        int y = CordenadasAleatoriasY(min, max);
    }while (generarCordenadas.contains(cordenadas));
    generarCordenadas.add(cordenadas);
        return cordenadas;
    }


}


