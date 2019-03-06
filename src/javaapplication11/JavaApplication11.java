/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;
import java.util.Scanner;

public class JavaApplication11 {
    Scanner teclado = new Scanner(System.in);
    String [] vectorNombre = new String[5];
    int total=0;
    int precio, cantidad;
    int [] intPrecio = new int[5];
    int [] intCantidad = new int [5];
    public void datos(){
       for (int nombre =0; nombre<vectorNombre.length; nombre++){
        System.out.print("Ingrese el nombre del producto ");
        vectorNombre[nombre] = teclado.nextLine();
       }
    }
       public void pre(){
           for (precio = 0; precio<intPrecio.length; precio ++){
               System.out.print("Ingrese el precio ["+(precio+1)+ "]   ");
               intPrecio[precio] = teclado.nextInt();
           }
       }
       public void cant(){
           for (cantidad = 0; cantidad<intCantidad.length; cantidad++){
               System.out.print("Ingrese la cantidad ["+(cantidad+1)+"]    ");
               intCantidad[cantidad] = teclado.nextInt();
           }
       }
       public void mostrarNombre(){
           for (int nombre =0; nombre<vectorNombre.length; nombre++){
               System.out.print(vectorNombre[nombre]+ "  ");
           }
       }
        public void mostrarPrecio(){
           for ( precio = 0; precio<intPrecio.length; precio ++){
               System.out.print("\n"+intPrecio[precio]+"   ");
           }
       }
       public void mostrarCantidad(){
           for (cantidad = 0; cantidad<intCantidad.length; cantidad++){
               System.out.print(intCantidad[cantidad]+"   ");
           }
       }
       public void mostrarTotal(){  
           total = (precio*cantidad);
           System.out.println("\nEl total es: "+total);
       }
               
   public static void main(String[] args) {
        // TODO code application logic here
        JavaApplication11 nuevo = new JavaApplication11();
        nuevo.datos();
        nuevo.pre();
        nuevo.cant();
        nuevo.mostrarNombre();
        nuevo.mostrarPrecio();
        nuevo.mostrarCantidad();
        nuevo.mostrarTotal();
    }
    
}