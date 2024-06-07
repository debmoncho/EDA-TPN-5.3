
package eda.tpn.pkg5.pkg3;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Prueba {

    Arbol arbol = new Arbol();
    Nodo nodo;
    Scanner leer = new Scanner(System.in);

    
    public Prueba(int raiz) {
        this.nodo = new Nodo(raiz);
    }

    
    // se construye arbol mediante inserciones
    public void insertarIngrediente() {
        
        boolean ejecucion = true;
        boolean condicion = false;

        do {
            
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("---------- || MENÚ 2 || ----------");
            System.out.println(" ");
            System.out.println("1 - Seleccione 1 si desea guardar un ingrediente");
            System.out.println("2 - Seleccione 2 si desea salir del || Menú 2 ||");
            int eleccion = leer.nextInt();

            try {

                switch (eleccion) {

                    case 1:
                        
                        do {

                            System.out.println("******** || MENÚ 3 || ********");
                            System.out.println("Escriba que ingrediente que desea guardar en nodo del arbol");
                            int ingrediente = leer.nextInt();
                            arbol.insertarN(nodo, ingrediente);

                            System.out.println("¿Desea guardar otro ingrediente?");
                            System.out.println("1 - Si");
                            System.out.println("2 - No");
                            int opcion = leer.nextInt();

                            if (opcion == 2) {
                                condicion = true;
                                break;
                            }

                        } while (condicion = true);

                        break;

                    case 2:

                        System.out.println(" ");
                        System.out.println("Gracias por guardar ingredientes en nuestro arbol. Vuelva pronto :) ");
                        System.out.println(" ");
                        
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

    public void cargarVectorPorDefault() {

        arbol.cargaVectorPorDefecto();

    }
    
//    public void verElementosEnVectorPrueba(){
//        
//        arbol.guardarEnVector(nodo);
//        arbol.visualizarVector();
//        
//    }
    
    public void buscarIngrediente(){
        
        boolean condicion = false;
        boolean encontrado = false;
        
        do {
            
            System.out.println(" ");
            System.out.println("******** || MENÚ 4 || ********");
            System.out.println(" ");
            System.out.println("Ingrese el ingrediente que desea buscar en el árbol");
            int buscar = leer.nextInt();

            for (int i = 0; i < arbol.getVector().length; i++) {

                if (buscar == arbol.getVector()[i]) {
                    System.out.println("Se encontro [" + buscar + "] en Nº de lote: (" + i +")");
                    encontrado = true;
                    condicion = false;
                    break;
                }

            }
            
            if (!encontrado) {
                System.out.println("No se encontró el ingrediente [" + buscar + "] en ningún lote");
            }
            
            System.out.println("¿Desea buscar otro ingrediente?");
            System.out.println("1 - Si");
            System.out.println("2 - No. Salir");
            int opcion = leer.nextInt();

            if (opcion != 1) {
                condicion = true;
            }

        } while (condicion == false);
        
        
    }
    
    
    public void masterMenu(){
        
        cargarVectorPorDefault();
        
        boolean salir = false;
        
        do {            
            
            
            System.out.println("--------------------------------------------------------------");
            System.out.println("|   *    *    *   *   *  MENU PRINCIPAL  *   *   *   *   *   |");
            System.out.println("--------------------------------------------------------------");
            System.out.println(" ");
            System.out.println("¿Que desea hacer?  (elija un numero)");
            System.out.println(" ");
            System.out.println("1 - Construir el arbol mediante inseciones");
            System.out.println("2 - Buscar un ingrediente especifico");
            System.out.println("3 - Buscar un ingrediente especifico por su Nº de lote");
            System.out.println("4 - Insertar un nuevo ingrediente en el arbol en el lugar correcto");
            System.out.println("5 - Salir y finalizar");
            System.out.println("");
            
            int choice = leer.nextInt();
            
            System.out.println("-------> Ud eligio: [" + choice + "] <-----");
            
            try {
                
                switch (choice) {
                    
                    case 1:
                        
                        insertarIngrediente();
                        arbol.guardarEnVector(nodo);
                        break;
                        
                    case 2: 
                        
                        int kihago;
                        
                        try {

                            do {

                                System.out.println(" ");
                                System.out.println("Ingrese el ingrediente que desea encontrar:");

                                int elemento = leer.nextInt();

                                arbol.busqueda(nodo, elemento);

                                System.out.println(" ");
                                System.out.println("¿Desea buscar otro ingrediente?");
                                System.out.println("1- Si");
                                System.out.println("2- No. Salir");

                                kihago = leer.nextInt();

                            } while (kihago == 1);

                        } catch (InputMismatchException e) {

                            System.out.println(" ");
                            System.out.println("--------------------------------------------------------------");
                            System.out.println("******** >>> Por favor, ingrese UN NÚMERO válido <<< *******");
                            System.out.println("--------------------------------------------------------------");
                            System.out.println(" ");
                            leer.nextLine();

                        }
                        
                        
                        break;
                        
                    case 3:
                        
                        buscarIngrediente();
                        System.out.println(" ");
                        System.out.println("El Arbol quedo organizado con los ingredientes ordenados de esta forma:");
                        System.out.println(" ");
                        arbol.visualizarVector();
                        System.out.println(" ");
                        break;
                        
                    case 4: 
                        
                        insertarIngrediente();
                        arbol.guardarEnVector(nodo);
                        System.out.println("El Arbol quedo organizado con los ingredientes ordenados de esta forma:");
                        System.out.println(" ");
                        arbol.visualizarVector();
                        System.out.println(" ");
                        break;
                        
                    case 5:
                        
                        System.out.println(" ");
                        System.out.println("Gracias por operar con El Alquimista. Vuelva pronto");
                        System.out.println(" ");
                        salir = true;
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
                System.out.println(" ");
                leer.nextLine();
            }
            
            
        } while (salir == false);
        
        
    }
    
    
    
}
