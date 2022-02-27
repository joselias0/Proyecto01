package proyecto01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//
//Programa       : Proyecto01.java
//Programadores    : Daniel Barrera Quezada y José Elías Morales
//Descripción    : Proyecto POO
//Fecha Creación : 9 de febrero de 2022
//Revisión       : Ninguna
//

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
                //Llama al algoritmo de ordenamiento por seleccion
                case 'A':
                    System.out.print("Precios de los Productos: ");
                    double precios[]= {9.8,7.0,-2.4,18,-5};
                    System.out.println(Arrays.toString(precios));
                    System.out.print("Precios de los Productos de menor a mayor: ");
                    precios=ordenarArreglo_seleccion(precios);
                    System.out.println(Arrays.toString(precios));
                    
                    break;
                 ///Llama al algoritmo de ordenamiento por seleccion  
                case 'B': 
                    System.out.print("Edad de los voluntarios: ");
                    int edad[]= {25,54,21,18,16};
                    System.out.println(Arrays.toString(edad));
                    System.out.print("Edad de los voluntarios de menor a mayor: ");
                    edad=ordenarEdad_seleccion(edad);
                    System.out.println(Arrays.toString(edad));
                    
                    
                    
                    break;
                    
                ///Llama al algoritmo de ordenamiento por seleccion
                case 'C':
                    int perro_Edad[]= {5,1,8,10,2};
                    System.out.print("Edad de los perros: ");
                    System.out.println(Arrays.toString(perro_Edad));
                    System.out.print("Edad de los perros de menor a mayor: ");
                    perro_Edad=ordenarPerros_seleccion(perro_Edad);
                    System.out.println(Arrays.toString(perro_Edad));
                break;
                
                //Busqueda binaria para buscar la edad de un perro en un arreglo
                
                case 'D':
                    int count=0;
                    Scanner edad_entrada=new Scanner(System.in);
                    System.out.println("Digite la cantidad de perros para el arreglo: ");
                    int size=edad_entrada.nextInt();
                    int[] array_perros=new int[size];

                    for(int i=0;i<array_perros.length;i++)
                    {
                    System.out.println("Digita la edad del perro en la posicion: "+i);
                    
                    array_perros[i]=edad_entrada.nextInt();
                    
                    }
                    System.out.println("Lista de edades: ");
                    array_perros=ordenarPerros_seleccion(array_perros);
                   System.out.println("Arreglo ordenado"+ Arrays.toString(array_perros));
                   Scanner numero=new Scanner(System.in); 

                   System.out.println("Ingrese la edad que busca en el arreglo: ");
                   count=numero.nextInt();
                  
                   int nBuscado=count;
                   int inferior=0;
                   int centro;
                   int superior=size-1;

                   while(inferior<=superior)
                   {
                   centro=(superior+inferior)/2;
                   if(array_perros[centro]==nBuscado)
                   {
                   System.out.println("La edad está en la posición: "+centro);
                   break;
                   }else if(nBuscado<array_perros[centro])
                   {superior=centro -1;
                   System.out.println("No se encontró");
                           }
                   else
                   {inferior=centro+1;
                           }
                   }
                   break;
                   
                   //Busqueda binaria para buscar buscar un precio en un arreglo
                case 'E': 
                    double c=0;
                    double b;
                    Scanner precio_entrada=new Scanner(System.in);
                    System.out.println("Digite la cantidad de precios para el arreglo: ");
                    int p=precio_entrada.nextInt();
                    double [] array_precios= new double[p];

                    for(int i=0;i<array_precios.length;i++)
                    {
                    System.out.println("Digita el precio en la posicion: "+i);
                    
                    array_precios[i]=precio_entrada.nextDouble();
                    
                    }
                    System.out.println("Lista de edades: ");
                    array_precios=ordenarArreglo_seleccion(array_precios);
                   System.out.println("Arreglo ordenado"+ Arrays.toString(array_precios));
                   Scanner n=new Scanner(System.in); 
                
                Scanner buscar=new Scanner(System.in); 
                System.out.println("Ingrese el precio del producto que busca: ");
                c=buscar.nextDouble();
       
                double numBuscado=c;
                int inf=0;
                int cnt;
                int sup=p-1;

                    while(inf<=sup)
                   {
                   cnt=(sup+inf)/2;
                   if(array_precios[cnt]==numBuscado)
                   {
                   System.out.println("El precio está en la posición: "+cnt);
                   break;
                   }else if(numBuscado<array_precios[cnt])
                   {sup=cnt-1;
                   }
                   else
                   {inf=cnt+1;
                   System.out.println("No se encontró");
                           }
                   }
                   break;
                   
                   //Agregar datos
                case 'F':
                    ArrayList lista_agregar = new ArrayList();
                    lista_agregar.add(8.78);
                    lista_agregar.add(4.22);
                    lista_agregar.add(5.11);
                    lista_agregar.add(8.99);
                    lista_agregar.add(12.99);
                    System.out.println("Lista de productos: "+ lista_agregar.toString());
                    System.out.print("Agregar un precio: ");
                    Scanner entrada = new Scanner(System.in);
                    String palabra = entrada.nextLine();
                    lista_agregar.add(palabra);
                    System.out.println("Lista actualizada: "+ lista_agregar.toString());
                    break;
                    
                    //Editar datos
                case 'G':
                    String editar_p;
                    int posicion;
                    ArrayList lista_editar =new ArrayList();
                    lista_editar.add(8.78);
                    lista_editar.add(4.22);
                    lista_editar.add(5.11);
                    lista_editar.add(8.99);
                    lista_editar.add(12.99);
                    
                    System.out.println("Lista de precios actuales: "+ lista_editar);
                    
                    System.out.print("Digita la posición del precio a editar: ");
                    Scanner editar_pos = new Scanner(System.in);
                    posicion=editar_pos.nextInt();
                    
                    
                    
                    System.out.print("Ingresa el nuevo precio: ");
                    Scanner editar_precio = new Scanner(System.in);
                    editar_p = editar_precio.nextLine();
                    
                    lista_editar.set(posicion,editar_p);
                    System.out.print("Lista actualizada: "+ lista_editar.toString());
                    
                    
                    break;
                    
                    //Eliminar datos
                case 'H':
                    ArrayList eliminar=new ArrayList();
                    eliminar.add("8.78");
                    eliminar.add("4.20");
                    eliminar.add("5.10");
                    eliminar.add("8.99");
                    eliminar.add("12.99");

                         System.out.println("Lista de precios actuales: "+eliminar.toString());
                         System.out.println("Ingrese el precio que quiere eliminar: ");
                         Scanner precioprod=new Scanner(System.in);
                         String marcaBorrada=precioprod.nextLine();

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
    
    //Uso del algoritmo de ordenamiento de seleccion para ordenar arreglo
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
    
    //Uso del algoritmo de ordenamiento de seleccion para ordenar arreglo
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
    //Uso del algoritmo de ordenamiento de seleccion para ordenar arreglo 
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
