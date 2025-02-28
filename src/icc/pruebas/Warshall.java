// Floyd Warshall Algorithm in Java
public class Warshall {
    // Función para implementar el algoritmo de Floyd-Warshall para una matriz booleana
    void floydWarshall(boolean graph[][], int V) {
        boolean dist[][] = new boolean[V][V];
        
        // Inicializa la matriz de distancias con los valores del grafo
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                dist[i][j] = graph[i][j];
            }
        }

        // Aplica el algoritmo de Floyd-Warshall
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    dist[i][j] = dist[i][j] || (dist[i][k] && dist[k][j]);
                    // System.out.println(dist[i][j] || (dist[i][k] && dist[k][j]));
                }
            }
        }

        // Imprime la matriz de clausura transitiva
        printSolution(dist, V);
    }

    // Función para imprimir la solución
    void printSolution(boolean dist[][], int V) {
        System.out.println("Matriz de clausura transitiva:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print((dist[i][j] ? 1 : 0) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Warshall fw = new Warshall();
        boolean graph[][] = { {true, true, false, false},
                              {false, false, false, true},
                              {true, false, false, false},
                              {false, false, false, false} };
        int V = 4; // Número de vértices
        fw.floydWarshall(graph, V);
    }
}
