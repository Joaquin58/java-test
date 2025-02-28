package icc.pruebas;
public class Lista {
  private Object dato;
  private Lista siguiente;

  /** Construye una lista con un dato, seguida de otra lista. */
  public Lista(Object dato, Lista siguiente) {
    this.dato = dato;
    this.siguiente = siguiente;
  }

  public Object getDato() {
    return dato;
  }

  /** Versión funcional de un método que trabaja con la lista. */
  public static void imprimeLista(Lista l) {
    if(l == null) return;           // Caso base, escrito explícitamente.
    else {
      imprimeLista(l.siguiente);
      System.out.println(l.dato);
    }
  }
}

public class UsoLista {
  public static void main(String[] args) {
    Lista frutas = new Lista("Bananas",
                    new Lista("Manzanas",
                     new Lista("Toronjas",
                      new Lista("Uvas", null))));
    Lista.imprimeLista(frutas);
  }
}