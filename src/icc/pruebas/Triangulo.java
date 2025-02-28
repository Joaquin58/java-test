package icc.pruebas;

public class Triangulo {

    private int a = 0;
    private int b = 0;

    public Triangulo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public float calcularArea() {
        float area = (this.a * this.b) / 2;
        return area;
    }

    public static void main(String[] args) {
        Triangulo t = new Triangulo(3, 2);
        System.out.println(t.calcularArea());
    }
}
