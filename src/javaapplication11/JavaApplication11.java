/*
Programa de la solucion del parcila de una tiendad el cual 
trata que se ingrese un vector la cantidad de 5 nombres de producuto
5 precio y 5 cantidades, al final realiza el calculo del precio por la cantidad.
*/
package javaapplication11;
import java.util.Scanner;

public class JavaApplication11 {
    Scanner teclado = new Scanner(System.in);
    String [] vectorNombre = new String[5];
    int total=0; //variable total 
    int precio, cantidad; //Varialbes para precio y cantidad
    int [] intPrecio = new int[5];//vector precio
    int [] intCantidad = new int [5]; //vector cantidad 
    public void datos(){//Clase datos 
       for (int nombre =0; nombre<vectorNombre.length; nombre++){ //Ciclo for que recorre el nombre
        System.out.print("Ingrese el nombre del producto ");//Pide los datos del producto
        vectorNombre[nombre] = teclado.nextLine();//Obtioene los datos mendiante el teclado
       }
    }
       public void pre(){//Clase para el precio 
           for (precio = 0; precio<intPrecio.length; precio ++){//Ciclo for para el precio
               System.out.print("Ingrese el precio ["+(precio+1)+ "]   ");//Pide los datos de precio
               intPrecio[precio] = teclado.nextInt();//Obtioene los datos mendiante el teclado
           }
       }
       public void cant(){//Clase para cantidad
           for (cantidad = 0; cantidad<intCantidad.length; cantidad++){//for para que recorre la cantidad
               System.out.print("Ingrese la cantidad ["+(cantidad+1)+"]    ");//Pide los datos de cantidad
               intCantidad[cantidad] = teclado.nextInt();//Obtioene los datos mendiante el teclado
           }
       }
       public void mostrarNombre(){//Clase para mostrar el vector nombre
           for (int nombre =0; nombre<vectorNombre.length; nombre++){//Ciclo for que para mostrar el nombre
               System.out.print(vectorNombre[nombre]+ "  ");//Hace la llamada vector nombre
           }
       }
        public void mostrarPrecio(){//Clase para mostrar el vector precio
           for ( precio = 0; precio<intPrecio.length; precio ++){//Ciclo for para mostrar el precio
               System.out.print("\n"+intPrecio[precio]+"   ");//Hace la llamada al vector y lo imprime.
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
               
   public static void main(String[] args) {//Metodo Pricipal main
        // Metodos de llamada 
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