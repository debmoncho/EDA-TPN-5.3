
package eda.tpn.pkg5.pkg3;

public class Arbol {
    
    private Nodo raiz;

    public Arbol() {
        this.raiz = null;
    }
    
    
    public Nodo insertarN(Nodo raiz, int valor) {

        if (raiz == null) {
            
            raiz = new Nodo(valor);
            return raiz;
        }
        
        if (valor < raiz.valor) {
            raiz.izquierdo = insertarN(raiz.izquierdo, valor);
        } else {
            raiz.derecho = insertarN(raiz.derecho, valor);
        }

        return raiz;
    }
    
    
    public void recorridoPreorden(Nodo nodo) {
        if (nodo == null) {
            return;
        }

        // Visita el nodo raíz
        System.out.print(nodo.valor + " ");

        // Recorre el subárbol izquierdo
        recorridoPreorden(nodo.izquierdo);

        // Recorre el subárbol derecho
        recorridoPreorden(nodo.derecho);
    }
    
    
    
    public void busqueda(Nodo nodo, int valor) {

        //Nodo punt = new Nodo();
        //punt = raiz;
        Nodo punt = nodo;

        while (punt != null && punt.valor != valor) {

            if (valor < punt.valor) {
                punt = punt.izquierdo;
            } else {
                punt = punt.derecho;
            }

        }

        if (punt == null) {
            System.out.println("No se encontro el ingrediente [" + valor + "]");
        } else {
            System.out.println("Se encontro el ingrediente [" + valor + "] buscado");
        }

    }
    
}
