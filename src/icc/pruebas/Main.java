package icc.pruebas;

public class Main {

    public static void main(String[] args) {
        // int base = Integer.parseInt(args[0]);
        // int altura = Integer.parseInt(args[1]);
        // Triangulo triangulo = new Triangulo(base, altura);
        // System.out.println("el area de tu triangulo es "+ triangulo.calcularArea()+" unidades cuadradas");
        Piramide p = new Piramide(4);
        p.dibujaPiramide(4);
        p.dibujaPiramide2(4);
        // System.out.println(p.dibujaPiramide(4));
    }
}
