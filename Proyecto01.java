package proyecto01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//
//Programa       : Proyecto01.java
//Programadores  : Daniel Barrera Quezada y José Elías Morales
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
            System.out.println("A.Ordenamiento de Datos");
            System.out.println("B.Busqueda de datos");
            System.out.println("C. Agregar datos");
            System.out.println("D. Editar datos");
            System.out.println("E. Eliminar datos");
            System.out.println("F. Verificar disponibilidad");
            System.out.println("G. Salir");
            System.out.println("");
            System.out.println("*****************");
            
                  
            answer= menu.next().charAt(0);
            switch(answer){
                //Sub menú  que despliega las opciones donde se utiliza el algoritmo de ordenamiento
                case 'A':
                    while(!exit){
                      char answer2;
                        System.out.println("\n*****************");
                        System.out.println("Elige una opción");
                        System.out.println("A.Ver edad de perros");
                        System.out.println("B. Ver productos");
                        System.out.println("C. Ver edad de los voluntarios");
                        System.out.println("D.Salir");
                        System.out.println("*****************");
                        answer2=menu.next().charAt(0);
                        switch(answer2){
                            //Llama al algoritmo de ordenamiento por seleccion
                            case 'A':
                                System.out.print("Precios de los Productos: ");
                                double precios[]= {9.8,7.0,-2.4,18,-5};
                                System.out.println(Arrays.toString(precios));
                                System.out.print("Precios de los Productos de menor a mayor: ");
                                precios=ordenarArreglo_seleccion(precios);
                                System.out.println(Arrays.toString(precios));
                                break;
                            //Llama al algoritmo de ordenamiento por seleccion  
                            case 'B':
                                System.out.print("Edad de los voluntarios: ");
                                int edad[]= {25,54,21,18,16};
                                System.out.println(Arrays.toString(edad));
                                System.out.print("Edad de los voluntarios de menor a mayor: ");
                                edad=ordenarEdad_seleccion(edad);
                                System.out.println(Arrays.toString(edad));
                                break;
                            //Llama al algoritmo de ordenamiento por seleccion
                            case 'C':
                                 int perro_Edad[]= {5,1,8,10,2};
                                 System.out.print("Edad de los perros: ");
                                 System.out.println(Arrays.toString(perro_Edad));
                                 System.out.print("Edad de los perros de menor a mayor: ");
                                 perro_Edad=ordenarPerros_seleccion(perro_Edad);
                                 System.out.println(Arrays.toString(perro_Edad));
                                 break;
                            case 'D':
                                System.out.println("Adiós");
                                exit=true;
                            default:
                                System.out.println("Opción no valida");
                                break;
                        }
                        break;
                    }
                    //Sub menú  que despliega las opciones donde se utiliza el algoritmo de busqueda
                  case 'B':
                       while(!exit){
                        char answer3;
                        System.out.println("\n*****************");
                        System.out.println("Elige una opción");
                        System.out.println("A.Busqueda de edad de perros");
                        System.out.println("B.Busqueda de precios de productos");
                        System.out.println("C.Salir");
                        System.out.println("*****************");
                        answer3= menu.next().charAt(0);
                        switch(answer3){
                            case 'A' -> {
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
                                busquedaEdad_perros(array_perros, size );
                                break;
                                }
                            case 'B' -> {
                                Scanner precioEntrada=new Scanner(System.in);
                                System.out.println("Digite la cantidad de precios para el arreglo: ");
                                int p=precioEntrada.nextInt();
                                double [] array_precios= new double[p];
                                Scanner precio_entrada=new Scanner(System.in);
                                for(int i=0;i<array_precios.length;i++)
                                {
                                    System.out.println("Digita el precio en la posicion: "+i);
                                    array_precios[i]=precio_entrada.nextDouble();
                                }
                                System.out.println("Lista de precios: ");
                                array_precios=ordenarArreglo_seleccion(array_precios);
                                System.out.println("Arreglo ordenado"+ Arrays.toString(array_precios));
                                busqueda_precio(array_precios, p);
                                break;
                                }
                            case 'C' ->
                            {
                                System.out.println("Adiós");
                                exit=true;
                            }
                            
                            default ->
                            {
                                System.out.println("Opción no valida");
                                break;
                            }
                    }
                        break;
                }
                  case 'C': {
                      
                  }
                  break;
                  //Caso para verificar la disponibilidad
                    case 'F':
                            {
                                disp();
                            }   
                            break;
                    case 'G':
                    {
                        System.out.println("Adiós");
                                exit=true;
                    }
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
     
     public static int[] busquedaEdad_perros(int array_perros[], int size_){
        int count=0;
        Scanner numero=new Scanner(System.in); 
        System.out.println("Ingrese la edad que busca en el arreglo: ");
                   count=numero.nextInt();
                  
                   int nBuscado=count;
                   int inferior=0;
                   int centro;
                   int superior=size_-1;

                   while(inferior<=superior)
                   {
                   centro=(superior+inferior)/2;
                   if(array_perros[centro]==nBuscado)
                   {
                   System.out.println("La edad está en la posición: "+centro);
                   break;
                   }else if(nBuscado<array_perros[centro])
                   {superior=centro-1;
                   System.out.println("No se encontró");
                           }
                   else
                   {inferior=centro+1;
                           }
                  
                   }
                   return array_perros;
     }  
     
    
     
     public static double[] busqueda_precio(double array_precios[],int p){
        Scanner precio_entrada=new Scanner(System.in);
        double c=0;
        System.out.println("Ingrese el precio del producto que busca: ");
                c=precio_entrada.nextDouble();
       
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
           return array_precios;     
   } 
            //Metodo utilizado para saber la disponibilidad de un producto
            private static void disp() {

            Scanner xd=new Scanner(System.in);
            int e;
            System.out.println("Digite el ID del producto para ver su disponibilidad: ");
            e=xd.nextInt();
            ProductoBase b= new ProductoBase();
            System.out.println("Unidades disponibles: "+b.disp(e));
        
    }     
     
}
