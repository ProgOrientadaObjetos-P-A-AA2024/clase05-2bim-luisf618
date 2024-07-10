/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06l;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {

        TarjetaCredito tar = new TarjetaCredito("Visa", "1111222233334444");

        MayorEdad representante = new MayorEdad("José", tar);

        MenorEdad menor = new MenorEdad("Felipe", representante);

        System.out.printf("Nombre:%s - Nombre de Tarjeta:%s\nNumero de Tarjeta:"
                + " %s\n",
                menor.obtenerNombre(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNombre(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNumero());

    }
}
