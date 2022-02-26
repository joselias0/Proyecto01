
      package proyecto01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Proyecto01 {

    
    public static void main(String[] args) {
        
             
        Scanner menu = new Scanner(System.in);
        boolean exit = false;
        
        while(!exit){
            char answer;
            System.out.println("\n*****************");
            System.out.println("Elige una opción");
            System.out.println("A. Ver productos");
            System.out.println("B. Ver edad de los voluntarios");
            System.out.println("C. Ver edad de los perros");
            System.out.println("D. Busqueda de edad de perros");
            System.out.println("E. Busqueda de precios de productos");
            System.out.println("F. Agregar dato");
            System.out.println("G. Editar dato");
            System.out.println("H. Eliminar dato");
            System.out.println("I. Salir");
            System.out.println("\n*****************");
            
                    
            answer= menu.next().charAt(0);
            switch(answer){
                case 'A':
                    System.out.print("Precios de los Productos: ");
                    double precios[]= {9.8,7.0,-2.4,18,-5};
                    System.out.println(Arrays.toString(precios));
                    System.out.print("Precios de los Productos de menor a mayor: ");
                    precios=ordenarArreglo_seleccion(precios);
                    System.out.println(Arrays.toString(precios));
                    
                    break;
                    
                case 'B': 
                    System.out.print("Edad de los voluntarios: ");
                    int edad[]= {25,54,21,18,16};
                    System.out.println(Arrays.toString(edad));
                    System.out.print("Edad de los voluntarios de menor a mayor: ");
                    edad=ordenarEdad_seleccion(edad);
                    System.out.println(Arrays.toString(edad));
                    
                    
                    
                    break;
                
                case 'C':
                    int perro_Edad[]= {5,1,8,10,2};
                    System.out.print("Edad de los perros: ");
                    System.out.println(Arrays.toString(perro_Edad));
                    System.out.print("Edad de los perros de menor a mayor: ");
                    perro_Edad=ordenarPerros_seleccion(perro_Edad);
                    System.out.println(Arrays.toString(perro_Edad));
                break;
                
                case 'D':
                     int perroEdad[]= {5,1,8,10,2};
                    int encontrada;
        
            for(int i=0; i<perroEdad.length; i++){
            System.out.println("El contenido del arreglo es: " + Arrays.toString(perroEdad));
            for (int j=0;j<perroEdad.length;j++){
                System.out.println(" arreglo["+j+"] = " + perroEdad[j]);
                
            } 
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese la edad a buscar: ");
            encontrada=entrada.nextInt();
            
            int edad_buscada=encontrada;
            for (int a=0;a<perroEdad.length;a++)
            {
            if(perroEdad[a]==edad_buscada)
            {
            System.out.println("La edad buscada esta en la posición: "+a);
            }
            }     
           break;
            }
            break;
                case 'E': 
                double productos[]={8.78,4.20,5.10,8.99,12.99};
                double buscar;
                
 
                System.out.println("El contenido del arreglo es: ");
                for (int i=0;i<productos.length;i++)
                {
                 System.out.println(" arreglo["+i+"] = " + productos[i]);
                }
                
                Scanner numero=new Scanner(System.in); 
                System.out.println("Ingrese el precio del producto que busca: ");
                buscar=numero.nextDouble();
       
                double numBuscado=buscar;
                int inferior=0;
                int centro;
                int superior=5-1;

                while(inferior<=superior)
                {
                centro=(superior+inferior)/2;
                if(productos[centro]==numBuscado)
                    {
                    System.out.println("El producto buscado esta en la posición: "+centro);
                    break;
                    }else if(numBuscado<productos[centro])
                    {superior=centro-1;
                    System.out.println("No se encontró");
                    }
                    else {
                    inferior=centro+1;
                    
                    }
                    }  
                    break;
        
                case 'F':
                    ArrayList lista_agregar = new ArrayList();
                    lista_agregar.add(8.78);
                    lista_agregar.add(4.20);
                    lista_agregar.add(5.10);
                    lista_agregar.add(8.99);
                    lista_agregar.add(12.99);
                    System.out.println("Lista de productos: "+ lista_agregar.toString());
                    System.out.print("Agregar un precio a un producto: ");
                    Scanner entrada = new Scanner(System.in);
                    String palabra = entrada.nextLine();
                    lista_agregar.add(palabra);
                    System.out.println("Lista actualizada: "+ lista_agregar.toString());
                    break;
                    
                case 'G':
                    String editar_color;
                    int posicion;
                    ArrayList lista_editar =new ArrayList();
                    lista_editar.add(8.78);
                    lista_editar.add(4.20);
                    lista_editar.add(5.10);
                    lista_editar.add(8.99);
                    lista_editar.add(12.99);
                    
                    System.out.println("Lista de precios actuales: "+ lista_editar);
                    
                    System.out.print("Digita la posición del precio a editar: ");
                    Scanner editar_pos = new Scanner(System.in);
                    posicion=editar_pos.nextInt();
                    
                    
                    
                    System.out.print("Ingresa el nuevo precio: ");
                    Scanner editar_precio = new Scanner(System.in);
                    editar_color = editar_precio.nextLine();
                    
                    lista_editar.set(posicion,editar_color);
                    System.out.print("Lista actualizada: "+ lista_editar.toString());
                    
                    
                    break;
                    
                case 'H':
                    ArrayList eliminar=new ArrayList();
                    eliminar.add("8.78");
                    eliminar.add("4.20");
                    eliminar.add("5.10");
                    eliminar.add("8.99");
                    eliminar.add("12.99");

                         System.out.println("Lista de precios actuales: "+eliminar.toString());
                         System.out.println("Ingrese el precio que quiere eliminar: ");
                         Scanner marcaAutos=new Scanner(System.in);
                         String marcaBorrada=marcaAutos.nextLine();

                    eliminar.remove(marcaBorrada);
                         System.out.println("Lista actualizada: "+eliminar.toString());
                    break;
                    
                    
                case 'I': 
                    System.out.println("Adiós");
                    exit=true;
                    break;
                    
                default:
                    System.out.println("Opción no valida");
                    break;

                    
            }
        }
        
    }
    
    public static double[] ordenarArreglo_seleccion (double a[]){
        int indiceMenor,n;
        
        n = a.length; 
        
        for( int i = 0; i < n-1; i++)
        {
            indiceMenor = i;
            for (int j=i+1; j<n; j++) if(a[j]<a[indiceMenor]) indiceMenor=j;
                double var_tempo= a[i];
            if(i != indiceMenor)
                a[i] = a[indiceMenor];
            a[indiceMenor]=var_tempo;
            }
        return a;
        }
    
    
        public static int[] ordenarEdad_seleccion (int a[]){
        int indiceMenor,n;
        
        n = a.length; 
        
        for( int i = 0; i < n-1; i++)
        {
            indiceMenor = i;
            for (int j=i+1; j<n; j++) if(a[j]<a[indiceMenor]) indiceMenor=j;
                int var_tempo= a[i];
            if(i != indiceMenor)
                a[i] = a[indiceMenor];
            a[indiceMenor]=var_tempo;
            }
        return a;
        }
     
     public static int[] ordenarPerros_seleccion (int a[]){
        int indiceMenor,n;
        
        n = a.length; 
        
        for( int i = 0; i < n-1; i++)
        {
            indiceMenor = i;
            for (int j=i+1; j<n; j++) if(a[j]<a[indiceMenor]) indiceMenor=j;
                int var_tempo= a[i];
            if(i != indiceMenor)
                a[i] = a[indiceMenor];
            a[indiceMenor]=var_tempo;
            }
        return a;
        }
       
}
