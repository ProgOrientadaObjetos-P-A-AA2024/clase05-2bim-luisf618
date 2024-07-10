/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06l;

/**
 *
 * @author utpl
 */
public class TarjetaCredito {
    
    private String nombre;
    private String numero;
    private Banco banco;

    public TarjetaCredito(String nom, String num, Banco b) {
        nombre = nom;
        numero = num;
        banco = b;
    }
    
    public void establecerBanco(Banco x) {
        banco = x;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public void establecerNumero(String x) {
        numero = x;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerNumero() {
        return numero;
    }
    
    public Banco obtenerBanco() {
        return banco;
    }
    
}
