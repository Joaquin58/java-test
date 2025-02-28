package icc.pruebas;

public class Compareto {

    public static void main(String[] args) {
        String cadena1 = "Manzana";
        String cadena2 = "Banana";

        // Comparación usando compareTo
        int resultado = cadena1.compareTo(cadena2);

        if (resultado < 0) {
            System.out.println("La cadena '" + cadena1 + "' es lexicográficamente menor que '" + cadena2 + "'" + " resultado: " + resultado);
        } else if (resultado > 0) {
            System.out.println("La cadena '" + cadena1 + "' es lexicográficamente mayor que '" + cadena2 + "'" + " resultado: " + resultado);
        } else {
            System.out.println("Las cadenas son lexicográficamente iguales");
        }
    }

}
