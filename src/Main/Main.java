package Main;

import java.util.Scanner;

import Dominio.Libros;
import Implementacion.LogicaMetodos;

public class Main {

    public static void main(String[] args) {

        LogicaMetodos imp = new LogicaMetodos();
        Libros libros;

        Scanner lectura = new Scanner(System.in);

        String titulo;
        int anioPub;
        String autor;
        int numPg, menuPrinc, indice;
        float precio;

        do {
            System.out.println("Menu Principal");
            System.out.println("1.-Alta");
            System.out.println("2.-Mostrar");
            System.out.println("3.-Buscar");
            System.out.println("4.-Editar");
            System.out.println("5.-Eliminar");
            System.out.println("6.-Buscar por titulo de libro ");
            System.out.println("7.-Buscar por autor");
            System.out.println("8.-Editar buscando por titulo(precio)");
            System.out.println("9.-Eliminar por titulo");
            System.out.println("10.-Salir");

            menuPrinc = lectura.nextInt();
            lectura.nextLine();

            switch (menuPrinc) {

                case 1:
                    try {
                        System.out.println("Ingrese el titulo");
                        titulo = lectura.nextLine();

                        System.out.println("Ingrese el año de publicacion");
                        anioPub = lectura.nextInt();
                        lectura.nextLine();

                        System.out.println("Ingrese el autor");
                        autor = lectura.nextLine();

                        System.out.println("Ingrese el numero de paginas que contien el libro");
                        numPg = lectura.nextInt();
                        lectura.nextLine();

                        System.out.println("Ingrese el precio");
                        precio = lectura.nextFloat();
                        lectura.nextLine();

                        libros = new Libros(titulo, anioPub, autor, numPg, precio);
                        imp.guarda(libros);

                    } catch (Exception e) {
                        System.out.println("Error al guardar: " + e.getMessage());
                    }

                    break;

                case 2:
                    if (imp.mostrar().size() > 0) {
                        System.out.println(imp.mostrar());
                    } else {
                        System.out.println("No hay registro");
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Ingrese el indice del registro a buscar");
                        indice = lectura.nextInt();
                        lectura.nextLine();

                        libros = imp.buscar(indice);
                        System.out.println("Se encontró el libro: " + libros.getTitulo());

                    } catch (Exception e) {
                        System.out.println("Ese índice no existe");
                    }
                    break;

                case 4:
                    try {
                        System.out.println("Ingrese el indice del registro");
                        indice = lectura.nextInt();
                        lectura.nextLine();

                        libros = imp.buscar(indice);
                        System.out.println("Se encontró el libro: " + libros);

                        System.out.println("Ingrese el nuevo nombre del autor");
                        autor = lectura.nextLine();
                        libros.setAutor(autor);

                        System.out.println("Se editó con éxito");

                    } catch (Exception e) {
                        System.out.println("Ese índice no existe");
                    }
                    break;

                case 5:
                    try {
                        System.out.println("Ingrese el indice del registro a eliminar");
                        indice = lectura.nextInt();
                        lectura.nextLine();

                        imp.eliminar(indice);
                        System.out.println("El libro se eliminó con éxito");

                    } catch (Exception e) {
                        System.out.println("Ese índice no existe");
                    }
                    break;

                case 6:
                    System.out.println("Ingrese el titulo del libro que desea buscar");
                    titulo = lectura.nextLine();
                    libros = imp.buscar2(titulo);

                    if (libros == null) {
                        System.out.println("Ese título no existe");
                    } else {
                        System.out.println(libros);
                    }
                    break;

                case 7:
                    System.out.println("Ingrese el autor del libro que desea buscar");
                    autor = lectura.nextLine();
                    libros = imp.buscar3(autor);

                    if (libros == null) {
                        System.out.println("Ese autor no existe");
                    } else {
                        System.out.println(libros);
                    }
                    break;

                case 8:
                    System.out.println("Ingrese el nombre del libro al que desea editar el precio");
                    titulo = lectura.nextLine();
                    libros = imp.buscar2(titulo);

                    if (libros == null) {
                        System.out.println("Ese título no existe");
                    } else {
                        System.out.println("El precio actual del libro \"" + titulo + "\" es: " + libros.getPrecio());
                        System.out.println("Ingrese el nuevo precio");
                        precio = lectura.nextFloat();
                        lectura.nextLine();

                        libros.setPrecio(precio);
                        imp.editar2(titulo, libros);

                        System.out.println("Precio cambiado con éxito");
                    }
                    break;

                case 9:
                    System.out.println("Ingrese el titulo del libro que desea eliminar");
                    titulo = lectura.nextLine();
                    imp.eliminar2(titulo);
                    break;

                case 10:
                    lectura.close();
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (menuPrinc != 10);
    }
}

