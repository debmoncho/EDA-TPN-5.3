
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

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
    

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
    
}
