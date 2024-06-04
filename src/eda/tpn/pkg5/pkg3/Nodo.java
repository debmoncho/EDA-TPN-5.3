
package eda.tpn.pkg5.pkg3;


public class Nodo {
    
    protected int valor;
    protected Nodo izquierdo;
    protected Nodo derecho;

    public Nodo() {
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
    
}
