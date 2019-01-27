package comparablejava;

/**
 *
 * @author caemci
 */
public class Auto {
    // Los autos no implementan la interface 'Comparable<T>', por tanto, no pueden ordenarse
    private String marca;
    private String modelo;
    private int cilindrada;

    public Auto(String marca, String modelo, int cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " " + cilindrada + "cc";
    }
}
