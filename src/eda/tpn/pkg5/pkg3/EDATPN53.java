
package eda.tpn.pkg5.pkg3;

/**
 *
 * @author Deb APBT
 */
public class EDATPN53 {

    
    public static void main(String[] args) {
        
        Prueba kk = new Prueba(6);

//        arbol.insertarN(nodo, 2);
//        arbol.insertarN(nodo, 8);
//        arbol.insertarN(nodo, 1);
//        arbol.insertarN(nodo, 4);
//        arbol.insertarN(nodo, 3);
//        arbol.insertarN(nodo, 5);



        kk.cargarVectorPorDefault();
        
        kk.insertarIngrediente();

        kk.verElementosEnVectorPrueba();
        
        kk.insertarIngrediente();
        
        kk.verElementosEnVectorPrueba();
        

    }
    
}
