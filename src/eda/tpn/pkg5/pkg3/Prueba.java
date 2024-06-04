
package eda.tpn.pkg5.pkg3;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Prueba {

    Arbol arbol = new Arbol();
    Nodo nodo;
    Scanner leer = new Scanner(System.in);

    
    public Prueba(Nodo raiz) {
        this.nodo = raiz;
    }

    
    public void insertarIngrediente() {

        boolean ejecucion = true;

        do {

            System.out.println("******** || MENU || ********");
            System.out.println("1 - Seleccione 1 si desea guardar un ingrediente");
            System.out.println("2 - Seleccione 2 si desea salir del menú");
            int eleccion = leer.nextInt();

            try {

                switch (eleccion) {

                    case 1:

                        System.out.println("******** || SUB Menu || ********");
                        System.out.println("Escriba que ingrediente que desea guardar en nodo del arbol");
                        int ingrediente = leer.nextInt();
                        arbol.insertarN(nodo, ingrediente);
                        break;

                    case 2:

                        System.out.println(" ");
                        System.out.println("Gracias por guardar ingredientes en nuestro arbol. Vuelva pronto :) ");

                        ejecucion = false;
                        break;

                    default:
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("Por favor, ingrese UN NÚMERO válido");
                        System.out.println("--------------------------------------------------------------");

                }
            } catch (InputMismatchException e) {
                
                System.out.println(" ");
                System.out.println("--------------------------------------------------------------");
                System.out.println("******** >>> Por favor, ingrese UN NÚMERO válido <<< *******");
                System.out.println("--------------------------------------------------------------");
                leer.nextLine();
                
            }

        } while (ejecucion == true);

    }
 
    public void buscarIngrediente(){
        
        System.out.println("******** || MENU DE BUSQUEDA || ********");
        System.out.println("Ingrese el ingrediente que desea buscar en el arbol");
        int buscar = leer.nextInt();

        
        arbol.busqueda(nodo, buscar);
        
        System.out.println("¿Desea buscar otro ingrediente?");
        
    }
    
    
}
