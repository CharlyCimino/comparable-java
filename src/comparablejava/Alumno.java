package comparablejava;

/**
 *
 * @author caemci
 */

public class Alumno implements Comparable<Alumno> {
    // Para que los alumnos sean comparables con otros, se implementa la interface 'Comparable<T>'
    private String nombre;
    private String apellido;
    private int nota;

    public Alumno(String nombre, String apellido, int nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
    }
    
    // La interface 'Comparable' obliga a sobreescribir el método 'compareTo'
    @Override
    public int compareTo(Alumno otro) {
        // De esta manera ordena de menor a mayor
        return this.nota - otro.nota;
        // Para ordenar de mayor a menor:
        // return otro.nota - this.nota;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " Nota: " + nota;
    }
}
