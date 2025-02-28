package icc.pruebas;

import java.util.Scanner;

public class Frecuencias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de frecuencias");
        int frecuencias = sc.nextInt();
        System.out.println("La frcuencia es: " + frecuencias);
        System.out.println("Dame tu nombre");
        sc.nextLine();
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre);
    }

}
