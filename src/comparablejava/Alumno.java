package comparablejava;

/**
 *
 * @author caemci
 * @see https://github.com/caemci
 */

public class Alumno implements Comparable<Alumno> {
    /*
        Los alumnos cumplen con el contrato de la interface 'Comparable<T>', por lo tanto,
        son comparables entre sí.
    */
    private String nombre;
    private String apellido;
    private int nota;

    public Alumno(String nombre, String apellido, int nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
    }
    
    // La interface 'Comparable<T>' obliga a sobreescribir el método 'compareTo'
    @Override
    public int compareTo(Alumno otro) {
        /*
            Por lo general, las colecciones suelen llamar a este método para cada elemento
            de forma tal de poder saber si cierto elemento antecede o precede a otro, según el
            número entero que se retorne:
            > Si se retorna cero, los elementos serían iguales.
            > Si se retorna un positivo, el elemento actual precede al otro. 
            > Si se retorna un negativo, el elemento actual antecede al otro. 
        
            La única limitación, es que cada tipo de objeto sabría compararse de una sola manera.
            En este caso, los alumnos se comparan según su nota. Podría ser por cualquier otro criterio.
            Para mayor flexibilidad, habría que usar 'Comparator<T>' (https://github.com/caemci/comparator-java)
        */
        return this.nota - otro.nota; // Se ordenaría por nota de forma ascendente
        // return otro.nota - this.nota; // Se ordenaría por nota de forma descendente
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " Nota: " + nota;
    }
}
