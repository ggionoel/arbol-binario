/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

import java.util.Scanner;

/**
 *
 * @author omarl
 */
public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int opcionMenu = 0;
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        Scanner leer3 = new Scanner (System.in);

        ArbolEnteros arbEnt = new ArbolEnteros();
        ArbolCadenas arbCad = new ArbolCadenas();
        do {
            System.out.println("\n\n");
            System.out.println(" |                 MENÚ                         |");
            System.out.println(" |----------------------|-----------------------|");
            System.out.println(" | 1. Insertar datos    | 8. Recorre InOrden L  |");
            System.out.println(" | 2. Buscar dato       | 9. Recorre PostOerde L|");
            System.out.println(" | 3. Recorre InOrden   | 10. Recorre PreOrden L|");
            System.out.println(" | 4. Recorre PostOrden | 11. _______________   |");
            System.out.println(" | 5. Recorre PreOrden  | 12. _______________   |");
            System.out.println(" | 6. Insestar dato L   | 13. _______________   |");
            System.out.println(" | 7. Buscar dato L     | 20. Salir             |");
            opcionMenu = leer.nextInt();
            switch (opcionMenu) {
                case 1:
                    System.out.println("Insertar datos: ");
                    int dato = leer2.nextInt();
                    arbEnt.insertar(dato);
                    break;
                case 2:
                    System.out.println("Buscar dato: ");
                    int buscar = leer2.nextInt();
                    arbEnt.existe(buscar);
                    System.out.println("Dato Encontrado: " + buscar);
                    break;
                case 3:
                    System.out.println("Recorriendo inOrden");
                    arbEnt.inorden();
                    break;
                case 4:
                    System.out.println("Recorriendo postOrden");
                    arbEnt.postorden();
                    break;
                case 5:
                    System.out.println("Recorriendo preOrden");
                    arbEnt.preorden();
                    break;
                case 6:
                    System.out.println("Insertar datos Letras");
                    String valor = leer3.nextLine();
                    arbCad.insertar(valor);
                    break;
                case 7:
                    System.out.println("Buscar dato Letras");
                    String buscar1 = leer3.nextLine();
                    System.out.println("Dato Encontrado: "+buscar1);
                    break;
                case 8:
                    System.out.println("Recorriendo inOrden Letras");
                    arbCad.inorden();
                case 9:
                    System.out.println("Recorriendo postOrden Letras");
                    arbCad.postorden();
                case 10:
                    System.out.println("Recorriendo preOrden Letras");
                    arbCad.preorden();
            }
        } while (opcionMenu != 20);

    }

}
