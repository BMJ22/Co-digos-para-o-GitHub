public class Uni5Exe21{
    public static void main(String[] args) {

     double chico = 1.5;
     double ze = 1.1;
     int contador = 0;

     while (ze < chico) {
     chico = chico + 0.02;
     ze = ze + 0.03; 
     contador++;
     }

     System.out.println("Serão necessários " + contador + " anos");

    }
}
/* Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metros e cresce 3 centímetros por ano. 
Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Zé seja maior que Chico. */