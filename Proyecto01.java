package proyecto01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        while (!exit) {
            char answer;
            System.out.println("\n*****************");
            System.out.println("Elige una opción");
            System.out.println("A.Ordenamiento de Datos");
            System.out.println("B.Busqueda de datos");
            System.out.println("C. Agregar datos");
            System.out.println("D. Editar datos");
            System.out.println("E. Eliminar datos");
            System.out.println("F. Verificar disponibilidad");
            System.out.println("G. Mostrar información");
            System.out.println("H. Mostrar información por ID");
            System.out.println("I.Verificar conexión");
            System.out.println("J.Arreglos");
            System.out.println("K.Comparación precios");
            System.out.println("L. Salir");
            System.out.println("*****************");
            answer = menu.next().charAt(0); 
            answer=Character.toUpperCase(answer);
            switch (answer) {
                //Sub menú  que despliega las opciones donde se utiliza el algoritmo de ordenamiento
                case 'A':
                    boolean exit1 = false;
                    while (!exit1) {
                        char answer2;
                        
                        System.out.println("\n*****************");
                        System.out.println("Elige una opción");
                        System.out.println("A.Ver edad de perros");
                        System.out.println("B. Ver productos");
                        System.out.println("C. Ver edad de los voluntarios");
                        System.out.println("D.Salir");
                        System.out.println("*****************");
                        answer2 = menu.next().charAt(0);
                        answer2=Character.toUpperCase(answer2);
                        switch (answer2) {
                            //Llama al algoritmo de ordenamiento por seleccion
                            case 'A':
                                System.out.print("Precios de los Productos: ");
                                double precios[] = {9.8, 7.0, -2.4, 18, -5};
                                System.out.println(Arrays.toString(precios));
                                System.out.print("Precios de los Productos de menor a mayor: ");
                                precios = ordenarArreglo_seleccion(precios);
                                System.out.println(Arrays.toString(precios));
                                break;
                            //Llama al algoritmo de ordenamiento por seleccion  
                            case 'B':
                                System.out.print("Edad de los voluntarios: ");
                                int edad[] = {25, 54, 21, 18, 16};
                                System.out.println(Arrays.toString(edad));
                                System.out.print("Edad de los voluntarios de menor a mayor: ");
                                edad = ordenar_seleccion(edad);
                                System.out.println(Arrays.toString(edad));
                                break;
                            //Llama al algoritmo de ordenamiento por seleccion
                            case 'C':
                                int perro_Edad[] = {5, 1, 8, 10, 2};
                                System.out.print("Edad de los perros: ");
                                System.out.println(Arrays.toString(perro_Edad));
                                System.out.print("Edad de los perros de menor a mayor: ");
                                perro_Edad = ordenar_seleccion(perro_Edad);
                                System.out.println(Arrays.toString(perro_Edad));
                                break;
                            case 'D':
                                System.out.println("Adiós");
                                exit1 = true;
                                break;
                            default:
                                System.out.println("Opción no valida");
                                break;
                        }
                        break;
                    }
                    break;
                //Sub menú  que despliega las opciones donde se utiliza el algoritmo de busqueda
                case 'B':
                    boolean exit2 = false;
                    while (!exit2) {
                        char answer3;
                        System.out.println("\n*****************");
                        System.out.println("Elige una opción");
                        System.out.println("A.Busqueda de edad de perros");
                        System.out.println("B.Busqueda de precios de productos");
                        System.out.println("C.Salir");
                        System.out.println("*****************");
                        answer3 = menu.next().charAt(0);
                        answer3=Character.toUpperCase(answer3);
                        switch (answer3) {
                            case 'A' -> {
                                try {
                                    Scanner edad_entrada = new Scanner(System.in);
                                    System.out.println("Digite la cantidad de perros para el arreglo: ");
                                    int size = edad_entrada.nextInt();
                                    int[] array_perros = new int[size];

                                    for (int i = 0; i < array_perros.length; i++) {
                                        System.out.println("Digita la edad del perro en la posicion: " + i);
                                        array_perros[i] = edad_entrada.nextInt();
                                    }
                                    System.out.println("Lista de edades: ");
                                    array_perros = ordenar_seleccion(array_perros);
                                    System.out.println("Arreglo ordenado" + Arrays.toString(array_perros));
                                    busquedaEdad_perros(array_perros, size);
                                    break;
                                } catch (Exception e) {
                                    System.out.println("El caracter ingresado es incorrecto o invalido");
                                }
 
                            }
                            case 'B' -> {
                                try {
                                    Scanner precioEntrada = new Scanner(System.in);
                                    System.out.println("Digite la cantidad de precios para el arreglo: ");
                                    int p = precioEntrada.nextInt();
                                    double[] array_precios = new double[p];
                                    Scanner precio_entrada = new Scanner(System.in);
                                    for (int i = 0; i < array_precios.length; i++) {
                                        System.out.println("Digita el precio en la posicion: " + i);
                                        array_precios[i] = precio_entrada.nextDouble();
                                    }
                                    System.out.println("Lista de precios: ");
                                    array_precios = ordenarArreglo_seleccion(array_precios);
                                    System.out.println("Arreglo ordenado" + Arrays.toString(array_precios));
                                    busqueda_precio(array_precios, p);
                                    break;
                                } catch (Exception e) {
                                    System.out.println("El caracter ingresado es incorrecto o invalido");
                                }

                            }
                            case 'C' -> {
                                System.out.println("Adiós");
                                exit2=true;
                                break;
                            }

                            default -> {
                                System.out.println("Opción no valida");
                                break;
                            }
                        }
                        break;
                    }
                    break;
                    
                    //Opción C que permite agregar datos en la base de datos de acuerdo a los distintos objetos.
                case 'C':
                    boolean exit3 = false;
                    while (!exit3) {
                        char answer4;
                        System.out.println("\n*****************");
                        System.out.println("Elige una opción");
                        System.out.println("A.Agregar Productos");
                        System.out.println("B.Agregar perro");
                        System.out.println("C.Agregar voluntario");
                        System.out.println("D.Salir");
                        System.out.println("*****************");
                        answer4 = menu.next().charAt(0);
                        answer4=Character.toUpperCase(answer4);
                        switch (answer4) {
                            case 'A':
                                boolean exit4 = false;
                                while (!exit4) {
                                    char answer5;
                                    System.out.println("\n*****************");
                                    System.out.println("Elige una opción");
                                    System.out.println("A.Agregar producto de higiene");
                                    System.out.println("B.Agregar producto de alimento");
                                    System.out.println("C.Agregar producto de accesorio");
                                    System.out.println("D.Salir");
                                    System.out.println("*****************");
                                    answer5 = menu.next().charAt(0);
                                    answer5=Character.toUpperCase(answer5);
                                    switch (answer5) {
                                        case 'A':
                                            createHig();
                                            break;
                                        case 'B':
                                            createAl();
                                            break;
                                        case 'C':
                                            createAcces();
                                            break;
                                        case 'D':
                                            System.out.println("Adiós");
                                            exit4 = true;
                                            break;
                                        default:
                                            System.out.println("Opción no valida");
                                            break;

                                    }

                                }
                                break;

                            case 'B':
                                createPerro();
                                break;
                            case 'C':
                                createVol();
                                break;
                            case 'D':
                                System.out.println("Adiós");
                                exit3 = true;
                                break;
                            default:
                                System.out.println("Opción no valida");
                                break;
                        }

                    }
                    break;
                //Opción D que permite editar datos en la base de datos de acuerdo a los distintos objetos.
                case 'D':
                    boolean exit5 = false;
                    while (!exit5) {
                        char answer6;
                        System.out.println("\n*****************");
                        System.out.println("Elige una opción");
                        System.out.println("A.Editar Productos");
                        System.out.println("B.Editar perro");
                        System.out.println("C.Editar voluntario");
                        System.out.println("D.Salir");
                        System.out.println("*****************");
                        answer6 = menu.next().charAt(0);
                        answer6=Character.toUpperCase(answer6);
                        switch (answer6) {
                            case 'A':
                                updatePro();
                                break;
                            case 'B':
                                updatePerro();
                                break;
                            case 'C':
                                updateVol();
                                break;
                            case 'D':
                                System.out.println("Adiós");
                                exit5 = true;
                                break;
                            default:
                                System.out.println("Opción no valida");
                                break;

                        }

                    }
                    break;
                    
                    //Opción E que permite eliminar datos en la base de datos de acuerdo a los distintos objetos.
                case 'E':
                    boolean exit6 = false;
                    while (!exit6) {
                        char answer7;
                        System.out.println("\n*****************");
                        System.out.println("Elige una opción");
                        System.out.println("A.Eliminar Productos");
                        System.out.println("B.Eliminar perro");
                        System.out.println("C.Eliminar voluntario");
                        System.out.println("D.Salir");
                        System.out.println("*****************");
                        answer7 = menu.next().charAt(0);
                        answer7=Character.toUpperCase(answer7);
                        switch (answer7) {
                            case 'A':
                                deletePro();
                                break;
                            case 'B':
                                deletePerro();
                                break;
                            case 'C':
                                deleteVol();
                                break;
                            case 'D':
                                System.out.println("Adiós");
                                exit6 = true;
                                break;
                            default:
                                System.out.println("Opción no valida");
                                break;

                        }

                    }
                    break;
                    
                    //Opción F que permite verificar la disponibilidad de distintos productos.
                case 'F':
                    boolean exit7 = false;
                    while (!exit7) {
                        char answer8;
                        System.out.println("\n*****************");
                        System.out.println("Elige una opción");
                        System.out.println("A.Verificar disponibilidad productos de higiene");
                        System.out.println("B.Verificar disponibilidad de alimentos");
                        System.out.println("C.Verificar disponibilidad de Accesorios");
                        System.out.println("D.Salir");
                        System.out.println("*****************");
                        answer8 = menu.next().charAt(0);
                        answer8=Character.toUpperCase(answer8);
                        switch (answer8) {
                            case 'A':
                                dispHig();
                                break;
                            case 'B':
                                dispAl();
                                break;
                            case 'C':
                                dispAcces();
                                break;
                            case 'D':
                                System.out.println("Adiós");
                                exit7 = true;
                                break;
                            default:
                                System.out.println("Opción no valida");
                                break;
                        }
                    }
                    break;
                    //Opción G que muestra todos los campos de cada tabla de la base de datos.
                case 'G':

                    boolean exit8 = false;
                    while (!exit8) {
                        char answer8;
                        System.out.println("\n*****************");
                        System.out.println("Elige una opción");
                        System.out.println("A.Mostrar informacion de productos");
                        System.out.println("B.Mostrar informacion de perros");
                        System.out.println("C.Mostrar informacion de voluntarios");
                        System.out.println("D.Salir");
                        System.out.println("*****************");
                        answer8 = menu.next().charAt(0);
                        answer8=Character.toUpperCase(answer8);
                        switch (answer8) {
                            case 'A':
                                readallPro();
                                break;
                            case 'B':
                                readallperro();
                                break;
                            case 'C':
                                readallVol();
                                break;
                            case 'D':
                                System.out.println("Adiós");
                                exit8 = true;
                                break;
                            default:
                                System.out.println("Opción no valida");
                                break;
                        }
                    }
                    break;
                       //Opción H que muestra todos los campos de un ID en especifico de la base de datos.
                case 'H':
                    boolean exit9 = false;
                    while (!exit9) {
                        char answer8;
                        System.out.println("\n*****************");
                        System.out.println("Elige una opción");
                        System.out.println("A.Mostrar informacion de productos por ID");
                        System.out.println("B.Mostrar informacion de perros por ID");
                        System.out.println("C.Mostrar informacion de voluntarios por ID");
                        System.out.println("D.Salir");
                        System.out.println("*****************");
                        answer8 = menu.next().charAt(0);
                        answer8=Character.toUpperCase(answer8);
                        switch (answer8) {
                            case 'A':
                                readPro();
                                break;
                            case 'B':
                                readPerro();
                                break;
                            case 'C':
                                readVol();
                                break;
                            case 'D':
                                System.out.println("Adiós");
                                exit9 = true;
                                break;
                            default:
                                System.out.println("Opción no valida");
                                break;
                        }
                    }
                    break; 
                    //Permite verificar si existe conexión a la base de datos
                case 'I':
                    conex();
                    break;
                    //Opción J que hace uso de arreglos y arreglos tipo objetos, también metodos tipo Cast.
                case 'J':
                    boolean exit10 = false;
                    while (!exit10) {
                        char answer8;
                        System.out.println("\n*****************");
                        System.out.println("Elige una opción");
                        System.out.println("A.Agregar dato (Arreglo de tipo objeto)");
                        System.out.println("B.Editar dato (Arreglo)");
                        System.out.println("C.Eliminar dato (Arreglo)");
                        System.out.println("D.Salir");
                        System.out.println("*****************");
                        answer8 = menu.next().charAt(0);
                        answer8=Character.toUpperCase(answer8);
                        switch (answer8) {
                            case 'A':
                                Scanner q =new Scanner(System.in);
                                int id;
                                double ida=1;
                                Productos e[]=new Productos[1];
                                String nombre,tipo,caducidad,tipoAccesorio;
                                float precio,litros;
                                int cantidad;
                                Scanner d = new Scanner(System.in);
                                Scanner c = new Scanner(System.in);
                                Scanner w = new Scanner(System.in);
                                Scanner v = new Scanner(System.in);

                                System.out.println("Introduzca el ID: ");
                                id = v.nextInt();
                                System.out.println("Escribe el nombre del producto: ");
                                nombre = d.nextLine();
                                System.out.println("Escribe el precio del producto: ");
                                precio = d.nextFloat();
                                System.out.println("Escribe la cantidad del producto: ");
                                cantidad = d.nextInt();
                                System.out.println("Clasifica el tipo del producto: ");
                                tipo = c.nextLine();
                                System.out.println("Escribe la capacidad, en litros, del producto: ");
                                litros = c.nextFloat();
                                System.out.println("Escribe la fecha de caducidad del producto: ");
                                caducidad = w.nextLine();
                                System.out.println("Escribe el tipo de accesorio del producto: ");
                                tipoAccesorio = w.nextLine();
                                e[0]=new Productos(id,nombre,precio,cantidad,tipo,litros,caducidad,tipoAccesorio);
                                System.out.println("Arreglo de un objeto= "+"["+e[0].getId() + ", " +e[0].getNombre() + ", " +(int)e[0].getPrecio()+ ", "+e[0].getCantidad()+ ", "+e[0].getTipo()+ ", "+e[0].getHigiene()+ ", "+e[0].getAlimento()+ ", "+e[0].getAccesorios()+"]");     
                               
                                break;
                            case 'B':
                                int posicion;
                                String editar_p;
                                ArrayList lista_editar = new ArrayList();

                                lista_editar.add(8.78);
                                lista_editar.add(4.22);
                                lista_editar.add(5.11);
                                lista_editar.add(8.99);
                                lista_editar.add(12.99);
                                System.out.println("Lista de precios actuales: " + lista_editar);
                                System.out.print("Digita la posición del precio a editar: ");
                                Scanner editar_pos = new Scanner(System.in);
                                posicion = editar_pos.nextInt();
                                System.out.print("Ingresa el nuevo precio: ");
                                Scanner editar_precio = new Scanner(System.in);
                                editar_p = editar_precio.nextLine();
                                lista_editar.set(posicion, editar_p);
                                System.out.print("Lista actualizada: " + lista_editar.toString());
                                break;
                            case 'C':
                                ArrayList eliminar = new ArrayList();
                                eliminar.add("8.78");
                                eliminar.add("4.20");
                                eliminar.add("5.10");
                                eliminar.add("8.99");
                                eliminar.add("12.99");

                                System.out.println("Lista de precios actuales: " + eliminar.toString());
                                System.out.println("Ingrese el precio que quiere eliminar: ");
                                Scanner precioprod = new Scanner(System.in);
                                String marcaBorrada = precioprod.nextLine();
                                eliminar.remove(marcaBorrada);
                                System.out.println("Lista actualizada: " + eliminar.toString());
                                break;
                            case 'D':
                                System.out.println("Adiós");
                                exit10 = true;
                                break;
                            default:
                                System.out.println("Opción no valida");
                                break;
                        }
                    }
                    break;
                    //Opción K permite comparar precios entre 2 diferentes productos.
                case 'K':
                    float precio;
                    float precio2;       
                    Productos b[]= new Productos[2];
                    Scanner d = new Scanner(System.in);
                    System.out.println("****Primer dato****");
                    System.out.println("Escribe el precio 1 a comparar: ");
                    precio = d.nextFloat();
                    b[0] = new Productos(precio);
                    System.out.println("****Segundo dato****");
                    Scanner de = new Scanner(System.in);
                    System.out.println("Escribe el precio 2 a comparar: ");
                    precio2 = de.nextFloat();
                    b[1] = new Productos(precio2);
                    System.out.println("Precio uno igual que precio 2="+b[0].igualQue(b[1]));
                    System.out.println("Precio uno menor que precio 2="+b[0].menorQue(b[1]));
                    System.out.println("Precio uno menor o igual que precio 2="+b[0].menorIgual(b[1]));
                    System.out.println("Precio uno mayor que precio 2="+b[0].mayorQue(b[1]));
                    System.out.println("Precio uno mayor o igual que precio 2="+b[0].mayorIgual(b[1]));
                    break;
                case 'L':
                    System.out.println("Adiós");
                    exit = true;
                    break;

                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }

    }

    //Uso del algoritmo de ordenamiento de seleccion para ordenar arreglo
    public static double[] ordenarArreglo_seleccion(double a[]) {
        int indiceMenor, n;

        n = a.length;

        for (int i = 0; i < n - 1; i++) {
            indiceMenor = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            double var_tempo = a[i];
            if (i != indiceMenor) {
                a[i] = a[indiceMenor];
            }
            a[indiceMenor] = var_tempo;
        }
        return a;
    }

    //Uso del algoritmo de ordenamiento de seleccion para ordenar arreglo
    public static int[] ordenar_seleccion(int a[]) {
        int indiceMenor, n;

        n = a.length;

        for (int i = 0; i < n - 1; i++) {
            indiceMenor = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            int var_tempo = a[i];
            if (i != indiceMenor) {
                a[i] = a[indiceMenor];
            }
            a[indiceMenor] = var_tempo;
        }
        return a;
    }


    
    //Funciona para la busqueda de edad en la clase perros.
    public static int[] busquedaEdad_perros(int array_perros[], int size_) {
        int count = 0;
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese la edad que busca en el arreglo: ");
        count = numero.nextInt();

        int nBuscado = count;
        int inferior = 0;
        int centro;
        int superior = size_ - 1;

        while (inferior <= superior) {
            centro = (superior + inferior) / 2;
            if (array_perros[centro] == nBuscado) {
                System.out.println("La edad está en la posición: " + centro);
                break;
            } else if (nBuscado < array_perros[centro]) {
                superior = centro - 1;
                System.out.println("No se encontró");
            } else {
                inferior = centro + 1;
            }

        }
        return array_perros;
    }
    
    //Funciona para la busqueda de precios en la clase productos.
    public static double[] busqueda_precio(double array_precios[], int p) {
        Scanner precio_entrada = new Scanner(System.in);
        double c = 0;
        System.out.println("Ingrese el precio del producto que busca: ");
        c = precio_entrada.nextDouble();

        double numBuscado = c;
        int inf = 0;
        int cnt;
        int sup = p - 1;

        while (inf <= sup) {
            cnt = (sup + inf) / 2;
            if (array_precios[cnt] == numBuscado) {
                System.out.println("El precio está en la posición: " + cnt);
                break;
            } else if (numBuscado < array_precios[cnt]) {
                sup = cnt - 1;
            } else {
                inf = cnt + 1;
                System.out.println("No se encontró");
            }
        }
        return array_precios;
    }
    //**************************************
    //**            PRODUCTOS             **
    //**************************************
    
    //Metodos de leer, agregar, editar y eliminar para la clase Productos, conectada a la base de datos.

    private static void readPro() {
        try {
            List<Productos> lista = new ArrayList<>();
            Scanner scan = new Scanner(System.in);
            int id, size;
            System.out.println("Digite el ID a buscar:");
            id = scan.nextInt();
            ProductoBase base = new ProductoBase();
            lista = base.read(id);
            size = lista.size();
            System.out.println("*ID*" + "    " + "*Nombre*" + "    " + "*Precio*" + "    " + "*Cantidad*" + "    " + "*Tipo*" + "    " + "*Higiene*" + "    " + "*Alimento*" + "    " + "*Accesorios*");
            for (int i = 0; i < size; i++) {
                System.out.println(lista.get(i).getId() + "        " + lista.get(i).getNombre() + "        " + lista.get(i).getPrecio() + "        " + lista.get(i).getCantidad() + "        " + lista.get(i).getTipo() + "        " + lista.get(i).getHigiene() + "        " + lista.get(i).getAlimento() + "        " + lista.get(i).getAccesorios());
            }
        } catch (Exception e) {
            System.out.println("El caracter ingresado es incorrecto o invalido");
        }
    }

    private static void readallPro() {

        List<Productos> lista = new ArrayList<>();
        ProductoBase base = new ProductoBase();
        lista = base.readAll();
        int size=lista.size();
        System.out.println("*ID*" + "    " + "*Nombre*" + "    " + "*Precio*" + "    " + "*Cantidad*" + "    " + "*Tipo*" + "    " + "*Higiene*" + "    " + "*Alimento*" + "    " + "*Accesorios*");
        for (int i = 0; i < size; i++) {
            System.out.println(lista.get(i).getId() + "        " + lista.get(i).getNombre() + "        " + lista.get(i).getPrecio() + "        " + lista.get(i).getCantidad() + "        " + lista.get(i).getTipo() + "        " + lista.get(i).getHigiene() + "        " + lista.get(i).getAlimento() + "        " + lista.get(i).getAccesorios());
        }
    }

    private static void deletePro() {
        try {
            Scanner scan = new Scanner(System.in);
            int id;
            System.out.println("Digite el ID del dato que desea eliminar");
            id = scan.nextInt();
            ProductoBase b = new ProductoBase();
            System.out.println(b.delete(id));

        } catch (Exception e) {
            System.out.println("El caracter ingresado es incorrecto o invalido");
        }
    }



    private static void updatePro() {
        try{
            String nombre, tipo, caducidad, tipoAccesorio;
            float precio, litros;
            int cantidad, id;
            Scanner scan1 = new Scanner(System.in);
            Scanner scan2 = new Scanner(System.in);
            Scanner scan3 = new Scanner(System.in);
            Scanner scan4 = new Scanner(System.in);

            System.out.println("Introduzca el ID a modificar: ");
            id = scan4.nextInt();
            System.out.println("Escribe el nombre del producto: ");
            nombre = scan1.nextLine();
            System.out.println("Escribe el precio del producto: ");
            precio = scan1.nextFloat();
            System.out.println("Escribe la cantidad del producto: ");
            cantidad = scan1.nextInt();
            System.out.println("Clasifica el tipo del producto: ");
            tipo = scan2.nextLine();
            System.out.println("Escribe la capacidad, en litros, del producto: ");
            litros = scan2.nextFloat();
            System.out.println("Escribe la fecha de caducidad del producto: ");
            caducidad = scan3.nextLine();
            System.out.println("Escribe el tipo de accesorio del producto: ");
            tipoAccesorio = scan3.nextLine();
            ProductoBase b = new ProductoBase();
            System.out.println(b.update(id, nombre, precio, cantidad, tipo, litros, caducidad, tipoAccesorio));
        }catch(Exception e){
            System.out.println("El caracter ingresado es incorrecto o invalido");
        }


        
    //**************************************
    //**           FIN PRODUCTOS          **
    //**************************************

    }
    
    //Metodo creado para verificar la conexion a la base de datos
    public static void conex() {
        if (cnx.getConexion() != null) {
            System.out.println("La conexion ha sido correcta");
        } else {
            System.out.println("No se ha conectado a la base de datos");
        }
    }

    //**************************************
    //**         PRODUCTO ALIMENTO        **
    //**************************************
    
    //Metodos de agregar y verificar disponibilidad para la subclase Alimento en la clase Productos, conectada a la base de datos.
    private static void createAl() {
       try{
           String nombre, tipo, caducidad;
           float precio;
           int cantidad;
           Scanner scan1 = new Scanner(System.in);
           Scanner scan2 = new Scanner(System.in);
           Scanner scan3 = new Scanner(System.in);
           System.out.println("Escribe el nombre del producto: ");
           nombre = scan1.nextLine();
           System.out.println("Escribe el precio del producto: ");
           precio = scan1.nextFloat();
           System.out.println("Escribe la cantidad del producto: ");
           cantidad = scan1.nextInt();
           System.out.println("Clasifica el tipo del producto: ");
           tipo = scan2.nextLine();
           System.out.println("Escribe la fecha de caducidad del producto: ");
           caducidad = scan3.nextLine();
           AlimentoBase b = new AlimentoBase();
           Alimento e = new Alimento(nombre, precio, cantidad, tipo, caducidad);
           System.out.println(b.createw(e));
       }catch(Exception e){
           System.out.println("El caracter ingresado es incorrecto o invalido");
       }
    }

    private static void dispAl() {
        try{
            Scanner scan = new Scanner(System.in);
            int id;
            System.out.println("Digite el ID del alimento para ver su disponibilidad: ");
            id = scan.nextInt();
            AlimentoBase b = new AlimentoBase();
            System.out.println("Unidades disponibles: " + b.dispo(id));
        }catch(Exception e){
            System.out.println("El caracter ingresado es incorrecto o invalido");
        }
    }

    //**************************************
    //**        PRODUCTO ACCESORIO        **
    //**************************************
    
    //Metodos de agregar y verificar disponibilidad para la subclase Accesorios en la clase Productos, conectada a la base de datos.
    private static void createAcces() {
        try{
            String nombre, tipo, tipoAccesorio;
            float precio;
            int cantidad;
            Scanner scan1 = new Scanner(System.in);
            Scanner scan2 = new Scanner(System.in);
            Scanner scan3 = new Scanner(System.in);
            System.out.println("Escribe el nombre del producto: ");
            nombre = scan1.nextLine();
            System.out.println("Escribe el precio del producto: ");
            precio = scan1.nextFloat();
            System.out.println("Escribe la cantidad del producto: ");
            cantidad = scan1.nextInt();
            System.out.println("Clasifica el tipo del producto: ");
            tipo = scan2.nextLine();
            System.out.println("Escribe el tipo de accesorio del producto: ");
            tipoAccesorio = scan3.nextLine();
            AccesoriosBase b = new AccesoriosBase();
            Accesorios e = new Accesorios(nombre, precio, cantidad, tipo, tipoAccesorio);
            System.out.println(b.createw(e));
        }catch(Exception e){
            System.out.println("El caracter ingresado es incorrecto o invalido");
        }
    }

    private static void dispAcces() {
        try{
            Scanner scan = new Scanner(System.in);
            int id;
            System.out.println("Digite el ID del accesorio para ver su disponibilidad: ");
            id = scan.nextInt();
            AccesoriosBase b = new AccesoriosBase();
            System.out.println("Unidades disponibles: " + b.dispo(id)); 
        }catch(Exception e){
            System.out.println("El caracter ingresado es incorrecto o invalido");
        }
    }

    //**************************************
    //**         PRODUCTO HIGIENE         **
    //**************************************
    
    //Metodos de agregar y verificar disponibilidad para la subclase Higiene en la clase Productos, conectada a la base de datos.
    private static void createHig() {
        try{
            String nombre, tipo;
            float precio, litros;
            int cantidad;
            Scanner scan1 = new Scanner(System.in);
            Scanner scan2 = new Scanner(System.in);
            Scanner scan3 = new Scanner(System.in);
            System.out.println("Escribe el nombre del producto: ");
            nombre = scan1.nextLine();
            System.out.println("Escribe el precio del producto: ");
            precio = scan1.nextFloat();
            System.out.println("Escribe la cantidad del producto: ");
            cantidad = scan1.nextInt();
            System.out.println("Clasifica el tipo del producto: ");
            tipo = scan2.nextLine();
            System.out.println("Escribe el tamaño(En litros) del producto: ");
            litros = scan3.nextFloat();
            HigieneBase b = new HigieneBase();
            Higiene e = new Higiene(nombre, precio, cantidad, tipo, litros);
            System.out.println(b.createw(e));
        }catch(Exception e){
            System.out.println("El caracter ingresado es incorrecto o invalido");
        }
    }

    private static void dispHig() {
        try{
            Scanner scan = new Scanner(System.in);
            int id;
            System.out.println("Digite el ID del producto de higiene para ver su disponibilidad: ");
            id = scan.nextInt();
            HigieneBase b = new HigieneBase();
            System.out.println("Unidades disponibles: " + b.dispo(id));
        }catch(Exception e){
            System.out.println("El caracter ingresado es incorrecto o invalido");
        }
    }

    //**************************************
    //**              PERROS              **
    //**************************************
    
    //Metodos de leer, agregar, editar y eliminar para la clase Perros, conectada a la base de datos.
    private static void createPerro() {
        try {
            String nombre, raza, color, descripcionFisica;
            Scanner scan1 = new Scanner(System.in);
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Escribe el nombre del perro: ");
            nombre = scan1.nextLine();
            System.out.println("Escribe la raza del perro: ");
            raza = scan1.nextLine();
            System.out.println("Escribe el color del perro: ");
            color = scan1.nextLine();
            System.out.println("Escribe una breve descripcion fisica del perro:");
            descripcionFisica = scan2.nextLine();
            PerrosBase b = new PerrosBase();
            Perros e = new Perros(nombre, raza, color, descripcionFisica);
            System.out.println(b.create(e));
        } catch (Exception e) {
            System.out.println("El caracter ingresado es incorrecto o invalido");
        }
        
    }

    private static void updatePerro() {
        try {
            String nombre, raza, color, descripcionFisica;
            int id;
            Scanner scan1 = new Scanner(System.in);
            Scanner scan2 = new Scanner(System.in);
            Scanner scan3 = new Scanner(System.in);
            System.out.println("Escribe el ID a modificar:");
            id = scan3.nextInt();
            System.out.println("Escribe el nombre del perro: ");
            nombre = scan1.nextLine();
            System.out.println("Escribe la raza del perro: ");
            raza = scan1.nextLine();
            System.out.println("Escribe el color del perro: ");
            color = scan1.nextLine();
            System.out.println("Escribe una breve descripcion fisica del perro:");
            descripcionFisica = scan2.nextLine();
            PerrosBase b = new PerrosBase();
            System.out.println(b.update(id, nombre, raza, color, descripcionFisica));

        } catch (Exception e) {
            System.out.println("El caracter ingresado es incorrecto o invalido");
        }
    }

    private static void deletePerro() {
        try {
            Scanner scan = new Scanner(System.in);
            int id;
            System.out.println("Digite el ID del dato que desea eliminar");
            id = scan.nextInt();
            PerrosBase b = new PerrosBase();
            System.out.println(b.delete(id));
        } catch (Exception e) {
            System.out.println("El caracter ingresado es incorrecto o invalido");
        }
    }

    private static void readallperro() {
        List<Perros> lista = new ArrayList<>();
        PerrosBase base = new PerrosBase();
        lista = base.readAll();
        int size=lista.size();
        System.out.println("*ID*" + "     " + "*Nombre*" + "     " + "*Raza*" + "           " + "*Color*" + "              " + "*Descripcion Fisica*");
        for (int i = 0; i < size; i++) {
            System.out.println(lista.get(i).getID() + "        " + lista.get(i).getNombre() + "        " + lista.get(i).getRaza() + "        " + lista.get(i).getColor() + "        " + lista.get(i).getDescripcionFisica());
        }
    }

    private static void readPerro() {
        try {
            List<Perros> lista = new ArrayList<>();
            Scanner scan = new Scanner(System.in);
            int id;
            System.out.println("Digite el ID a buscar:");
            id = scan.nextInt();
            PerrosBase base = new PerrosBase();
            lista = base.read(id);
            System.out.println("*ID*" + "     " + "*Nombre*" + "     " + "*Raza*" + "           " + "*Color*" + "              " + "*Descripcion Fisica*");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i).getID() + "        " + lista.get(i).getNombre() + "        " + lista.get(i).getRaza() + "        " + lista.get(i).getColor() + "        " + lista.get(i).getDescripcionFisica());
            }
        } catch (Exception e) {
            System.out.println("El caracter ingresado es incorrecto o invalido");
        }
    }
    
    //**************************************
    //**              FIN PERROS           **
    //**************************************

    //**************************************
    //**           VOLUNTARIOS            **
    //**************************************
    
    //Metodos de leer, agregar, editar y eliminar para la clase Voluntarios, conectada a la base de datos.
    private static void createVol() {
        try {
            String nombres, apellidos, nTelefono;
            int edad;
            Scanner scan1 = new Scanner(System.in);
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Escribe el nombre del voluntario: ");
            nombres = scan1.nextLine();
            System.out.println("Escribe el apellido del voluntario: ");
            apellidos = scan1.nextLine();
            System.out.println("Escribe la edad del voluntario: ");
            edad = scan1.nextInt();
            System.out.println("Digita el numero telefonico del voluntario: ");
            nTelefono = scan2.nextLine();
            VoluntariosBase b = new VoluntariosBase();
            Voluntarios e = new Voluntarios(nombres, apellidos, edad, nTelefono);
            System.out.println(b.create(e));
        } catch (Exception e) {
            System.out.println("El caracter ingresado es incorrecto o invalido");
        }
    }

    private static void updateVol() {
        try {
            String nombres, apellidos, nTelefono;
            int edad, id;
            Scanner scan = new Scanner(System.in);
            Scanner scan2 = new Scanner(System.in);
            Scanner scan3 = new Scanner(System.in);
            System.out.println("Introduzca el ID a modificar: ");
            id = scan3.nextInt();
            System.out.println("Escribe el nombre del producto: ");
            nombres = scan.nextLine();
            System.out.println("Escribe el precio del producto: ");
            apellidos = scan.nextLine();
            System.out.println("Escribe la cantidad del producto: ");
            edad = scan.nextInt();
            System.out.println("Clasifica el tipo del producto: ");
            nTelefono = scan2.nextLine();
            VoluntariosBase b = new VoluntariosBase();
            System.out.println(b.update(id, nombres, apellidos, edad, nTelefono));
        } catch (Exception e) {
            System.out.println("El caracter ingresado es incorrecto o invalido");
        }        
    }

    private static void deleteVol() {
        try {
            Scanner scan = new Scanner(System.in);
            int id;
            System.out.println("Digite el ID del voluntario que desea eliminar");
            id = scan.nextInt();
            VoluntariosBase b = new VoluntariosBase();
            System.out.println(b.delete(id));
        } catch (Exception e) {
            System.out.println("El caracter ingresado es incorrecto o invalido");
        }
    }

    private static void readVol() {
        try {
            List<Voluntarios> lista = new ArrayList<>();
            Scanner scan = new Scanner(System.in);
            int e;
            System.out.println("Digite el ID a buscar:");
            e = scan.nextInt();
            VoluntariosBase base = new VoluntariosBase();
            lista = base.read(e);
            int size = lista.size();
            System.out.println("*ID*" + "    " + "*Nombres*" + "    " + "*Apellidos*" + "    " + "*Edad*" + "    " + "*nTelefono*");
            for (int i = 0; i < size; i++) {
                System.out.println(lista.get(i).getID() + "        " + lista.get(i).getNombres() + "        " + lista.get(i).getApellidos() + "        " + lista.get(i).getEdad() + "        " + lista.get(i).getNumeroDeTelefono());
            }  
        }catch(Exception e){
            System.out.println("El caracter ingresado es incorrecto o invalido");
        }
    }

    private static void readallVol() {
        List<Voluntarios> lista = new ArrayList<>();
        VoluntariosBase base = new VoluntariosBase();
        lista = base.readAll();
        int size=lista.size();
        System.out.println("*ID*" + "    " + "*Nombres*" + "    " + "*Apellidos*" + "    " + "*Edad*" + "    " + "*nTelefono*");
        for (int i = 0; i < size; i++) {
            System.out.println(lista.get(i).getID() + "        " + lista.get(i).getNombres() + "        " + lista.get(i).getApellidos() + "        " + lista.get(i).getEdad() + "        " + lista.get(i).getNumeroDeTelefono());
        }
    }
    //**************************************
    //**           FIN VOLUNTARIOS         **
    //**************************************
}   
