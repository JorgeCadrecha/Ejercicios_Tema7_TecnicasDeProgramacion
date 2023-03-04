package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;


    public class Ejercicio2 {

        private static int numClientes = 0;
        private int numCliente;
        private String nombre;

        public Ejercicio2(String nombre) {
            this.nombre = nombre;
            numClientes++;
            numCliente = numClientes;
        }

        public int getNumCliente() {
            return numCliente;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public static void mostrarClientes(ArrayList<Ejercicio2> clientes) {
            for (Ejercicio2 c : clientes) {
                System.out.println("Cliente n.°" + c.getNumCliente() + " [" + c.getNombre() + "]");
            }
        }

        public static void main(String[] args) {
            ArrayList<Ejercicio2> clientes = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            int opcion;
            do {
                System.out.println("-- Menú --");
                System.out.println("1 - Mostrar clientes");
                System.out.println("2 - Crear un cliente");
                System.out.println("3 - Salir");
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("-- Clientes --");
                        mostrarClientes(clientes);
                        break;
                    case 2:
                        System.out.println("¿Nombre?");
                        String nombre = sc.nextLine();
                        clientes.add(new Ejercicio2(nombre));
                        System.out.println("Cliente n.°" + numClientes + " [" + nombre + "] añadido");
                        break;
                    case 3:
                        System.out.println("Adiós🖐");
                        break;
                    default:
                        System.out.println("Opción no valida");
                }
            } while (opcion != 3);
        }

    }

