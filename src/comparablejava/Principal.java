package comparablejava;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author caemci
 * @see https://github.com/caemci
 */
public class Principal {

    public static void main(String[] args) {
        // Genero una lista de alumnos
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add( new Alumno("Juan","Fulano",9) );
        alumnos.add( new Alumno("Pedro","Mengano",7) );
        alumnos.add( new Alumno("Luis","Sultano",8) );
        alumnos.add( new Alumno("Luis","Sultano",6) );
        alumnos.add( new Alumno("Luis","Sultano",8) );
        
        // Genero lista de autos
        ArrayList<Auto> autos = new ArrayList<>();
        autos.add( new Auto("Senaolt","Hangoo",1600) );
        autos.add( new Auto("Debrolet","Qrisma",2000) );
        autos.add( new Auto("Goord","Gocus",1800) );
        
        System.out.println("Listado de alumnos original");
        UtilCollections.mostrarColeccion(alumnos); // Mostrar
        Collections.sort(alumnos); // Se ordenan por nota de forma ascendente
        System.out.println("\nListado de alumnos tras ordenar");
        UtilCollections.mostrarColeccion(alumnos); // Mostrar
        
        System.out.println("\nListado de autos original");
        UtilCollections.mostrarColeccion(autos);
        System.out.println("No puede ordenarse, sus elementos no son 'Comparables'");
        //Collections.sort(autos); NO COMPILA
    }
    
    public static void mostrarAL(ArrayList<?> al) {
        for (Object object : al) {
            System.out.println(object);
        }
    }
}
