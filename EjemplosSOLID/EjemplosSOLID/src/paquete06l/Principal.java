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

        Banco ban = new Banco();
        ban.establecerNombre("Banco del Pichincha");

        TarjetaCredito tar = new TarjetaCredito("Visa", "111122223333444", ban);

        MayorEdad representante = new MayorEdad("José", tar);

        MenorEdad menor = new MenorEdad("Felipe", representante);

        System.out.printf("Numero de Tarjeta: %s - Nombre del banco: %s\n",
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNombre(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerBanco().obtenerNombre());
    }
}
