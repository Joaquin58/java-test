package icc.pruebas;

import java.io.PrintStream;

public class Piramide {

    private static final PrintStream ps = System.out;

    /*
    public Piramide(int base) {
        this.base = base;
    }

    public void dibujaPiramide(int n) {
        int[][] matriz = new int[n][];
        // int num = 1;
        for (int i = n - 1; i >= 0; i--) {
            matriz[n - i - 1] = new int[i + 1];
            for (int j = 0; j < matriz[n - i - 1].length; j++) {
                matriz[n - i - 1][j] = j + 1;
                // num ++;
                System.out.print(matriz[n - i - 1][j] + " ");
            }
            System.out.println();
        }
    }

    public void dibujaPiramide2(int n) {

        int[][] matriz = new int[n][];

        // Llenar la matriz
        for (int i = 0; i < n; i++) {
            // System.out.println(n-i);

            matriz[i] = new int[n - i];
            for (int j = 0; j < n - i; j++) {
                // System.out.println(i + j + 1);
                matriz[i][j] = i + j + 1;
            }
        }

        // Imprimir la matriz con alineación a la derecha
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print("  "); // Espacios para alinear a la derecha
                } else {
                    System.out.print(matriz[i][j - i] + " ");
                }
            }
            System.out.println();
        }
    }
     */
    public static int[][] pascalTriangle(int ren, int col) {
        int contador = 0;
        int[][] triangulo = new int[ren + 1][];
        for (int i = 0; i < triangulo.length; i++) {
            triangulo[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                contador++;
                if (i == j || j == 0) {
                    triangulo[i][j] = 1;
                } else {
                    triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
                }
            }
        }
        return triangulo;
    }

    public static int[][] piramide(int base) {
        int[][] piramide = new int[base][];
        int contador = 0;
        for (int i = 0; i < piramide.length; i++) {
            piramide[i] = new int[base - i];
            for (int j = 0; j < piramide[i].length; j++) {
                piramide[i][j] = contador;
                contador++;
            }
        }
        return piramide;
    }

    // Crear la pirámide original
    public static int[][] crearPiramide(int base) {
        int[][] piramide = new int[base][];
        int contador = 0;
        for (int i = 0; i < piramide.length; i++) {
            piramide[i] = new int[base - i];
            for (int j = 0; j < piramide[i].length; j++) {
                piramide[i][j] = contador++;
            }
        }
        return piramide;
    }

    // Invertir la pirámide verticalmente
    public static int[][] invertirVerticalmente(int[][] piramide) {
        int[][] invertida = new int[piramide.length][];
        for (int i = 0; i < piramide.length; i++) {
            invertida[i] = new int[piramide[piramide.length - 1 - i].length];
            for (int j = 0; j < piramide[piramide.length - 1 - i].length; j++) {
                invertida[i][j] = piramide[piramide.length - 1 - i][j];
            }
        }
        return invertida;
    }

    // Invertir la pirámide horizontalmente
    public static int[][] invertirHorizontalmente(int[][] piramide) {
        int[][] invertida = new int[piramide.length][];
        for (int i = 0; i < piramide.length; i++) {
            invertida[i] = new int[piramide[i].length];
            for (int j = 0; j < piramide[i].length; j++) {
                invertida[i][j] = piramide[i][piramide[i].length - 1 - j];
            }
        }
        return invertida;
    }

    // Transponer la pirámide (intercambiar filas y columnas)
    public static int[][] transponer(int[][] piramide) {
        int maxLength = piramide[0].length;
        for (int i = 1; i < piramide.length; i++) {
            maxLength = Math.max(maxLength, piramide[i].length);
        }
        int[][] transpuesta = new int[maxLength][piramide.length];
        for (int i = 0; i < piramide.length; i++) {
            for (int j = 0; j < piramide[i].length; j++) {
                transpuesta[j][i] = piramide[i][j];
            }
        }
        return transpuesta;
    }

    public static String toStrings(int[][] triangulo) {
        StringBuilder sb = new StringBuilder();
        for (int[] triangulo1 : triangulo) {
            if (triangulo1 != null) {
                for (int j = 0; j < triangulo1.length; j++) {
                    sb.append(triangulo1[j]).append(" ");
                }
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(Piramide.toStrings(Piramide.pascalTriangle(5, 3)));
        System.out.println("Piramide original:");
        System.out.println(Piramide.toStrings(Piramide.piramide(5)));
        System.out.println("\nPiramide invertida horizontalmente:");
        System.out.println(Piramide.toStrings(Piramide.invertirHorizontalmente(Piramide.piramide(5))));
        System.out.println("\nPiramide invertida verticalmente:");
        System.out.println(Piramide.toStrings(Piramide.invertirVerticalmente(Piramide.piramide(5))));
        System.out.println("\nPiramide transpuesta:");
        System.out.println(Piramide.toStrings(Piramide.transponer(Piramide.piramide(5))));

    }
}

// @Override
// public String toString() {
//     return Arrays.deepToString(dibujaPiramide(this.base));
// }

