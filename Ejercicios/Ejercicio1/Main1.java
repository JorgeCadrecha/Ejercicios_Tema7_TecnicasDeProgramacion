package Ejercicio1;

public class Main1 {
    public static void main(String[] args) {
        Ejercicio1 dado1 = new Ejercicio1();
        Ejercicio1 dado2 = new Ejercicio1();
        Ejercicio1 dado3 = new Ejercicio1();

        dado1.setCaras(6);
        dado2.setCaras(10);
        dado3.setCaras(12);

        int suma = 0;
        do {
            suma = dado1.tirar() + dado2.tirar() + dado3.tirar();
            System.out.println("Suma: " + suma);
        } while (suma < 20);

    }
}
