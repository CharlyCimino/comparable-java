package comparablejava;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author caemci
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Genero lista de alumnos
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add( new Alumno("Juan","Fulano",9) );
        alumnos.add( new Alumno("Pedro","Mengano",7) );
        alumnos.add( new Alumno("Luis","Sultano",8) );
        
        // Genero lista de autos
        ArrayList<Auto> autos = new ArrayList<>();
        autos.add( new Auto("Senaolt","Hangoo",1600) );
        autos.add( new Auto("Debrolet","Qrisma",2000) );
        autos.add( new Auto("Goord","Gocus",1800) );
        
        System.out.println("Listado de alumnos original y ordenado: ");
        System.out.println(alumnos); // Mostrar
        Collections.sort(alumnos); // Ordenar
        System.out.println(alumnos); // Mostrar
        
        System.out.println("\nListado de autos original: ");
        System.out.println(autos);
        // Collections.sort(autos); NO COMPILA
        
    }
    
}
