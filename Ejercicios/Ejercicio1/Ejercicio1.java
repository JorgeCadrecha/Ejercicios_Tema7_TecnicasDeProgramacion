/*
 * 1. Los dados
Crea una clase modelizando un dado para jugar. Esta clase tiene:

dos atributos de instancia: uno que permite conocer el número de caras que tiene el dado y otro para almacenar la última cara que se extrajo;

dos constructores: uno que recibe como argumento el número de caras para el dado a crear y el otro, sin argumentos, que crea un clásico dado de seis caras;

métodos getter para los dos atributos;

un método setter, solo para cambiar el número de caras;

un método de instancia que permite simular la tirada de los dados, devolviendo el valor extraído aleatoriamente por los dados.

Escribir un algoritmo principal usando esta clase para crear tres dados: uno tiene seis caras, otro tiene diez caras y el último tiene doce caras. Los tres dados se lanzan hasta que la suma de los dados sea mayor o igual a veinte.
 */

 package Ejercicio1;

 import java.util.Random;
 
 public class Ejercicio1 {
 
     private int caras;
     private int cara;
 
     public Ejercicio1(int caras, int cara) {
         this.caras = caras;
         this.cara = cara;
     }
 
     public Ejercicio1() {
         this.caras = 6;
     }
 
     public int getCaras() {
         return caras;
     }
 
     public int getCara() {
         return cara;
     }
 
     public void setCaras(int caras) {
         this.caras = caras;
     }
 
     public void setCara(int cara) {
         this.cara = cara;
     }
 
     public int tirar() {
         Random r = new Random();
         cara = r.nextInt(caras) + 1;
         return cara;
     }
 
 }
 