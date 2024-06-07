
package eda.tpn.pkg5.pkg3;

public class Arbol {
    
    private Nodo raiz;
    private Integer vector[] = new Integer [12];
    
    public Arbol() {
        this.raiz = null;
    }

    public Integer[] getVector() {
        return vector;
    }

    public void setVector(Integer[] vector) {
        this.vector = vector;
    }
    
    
    
    
    public void cargaVectorPorDefecto(){
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = -1;
            
        }
        
    }
    
    
    // Implementacion enlazada
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
    
    
    public void preOrden(Nodo nodo) {

        if (nodo == null) {
            return; //detiene recursividad
            
        } else {
            System.out.print(nodo.getValor() + " ");
            preOrden(nodo.getIzquierdo());
            preOrden(nodo.getDerecho());
        }

    }
    
    
    public void recorrerPreOrden(Nodo raiz) {
        preOrden(raiz); // Inicia el recorrido desde la raíz
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
            System.out.println("---> No se encontro el ingrediente");
        } else {
            System.out.println("---> Se encontro el ingrediente!");
        }

    }
    
    
    // Método para guardar los elementos del árbol en el vector de forma correspondiente
    public void guardarEnVector(Nodo raiz) {
        guardarEnVectorRecursivo(raiz, 0);
    }

    // Método de iteracion recursiva
    private void guardarEnVectorRecursivo(Nodo nodo, int indice) {
        if (nodo != null) {
            vector[indice] = nodo.getValor(); // Guardar el valor en el índice actual
            guardarEnVectorRecursivo(nodo.getIzquierdo(), (2 * indice + 1)); // Llamada recursiva para el hijo izquierdo
            guardarEnVectorRecursivo(nodo.getDerecho(), (2 * indice + 2)); // Llamada recursiva para el hijo derecho
        }
    }
    
    
    public void visualizarVector(){
        
        for (int i = 0; i < vector.length-1; i++) {
            
            System.out.print("["+vector[i]+"]");
            
        }
        
        System.out.println(" ");
        } 
}