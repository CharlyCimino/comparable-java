package comparablejava;

/**
 *
 * @author caemci
 * @see https://github.com/caemci
 */
public class Auto {
    /*
        Los autos no implementan la interface 'Comparable<T>', por lo tanto,
        no cumplen con el contrato de definir cómo se comparan entre sí, para,
        entre otras cosas, establecer cómo se ordenarían en una colección.
    */
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
