package Ejercicio1_cuentaBancaria;

public class CuentaBancaria {
  private String numeroCuenta;
    private String nombreTitular;
    private double saldo;  

    public CuentaBancaria(String numeroCuenta, String nombreTitular, double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo.");
        }
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;

    }
    public String Depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto no puede ser negativo.");
        }else {
            saldo += monto;
        }
        return "Depósito realizado. Nuevo saldo: " + saldo;
    }
    public String Extraer(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto no puede ser negativo.");
        }
    if (monto > saldo){
            throw new IllegalArgumentException("Fondos insuficientes para realizar la extracción.");
        } else {
            saldo -= monto;
        }
        return "Extracción realizada. Nuevo saldo: " + saldo;
    }
    public String getNombreTitular() {
        return nombreTitular;
    }
    public double getSaldo() {
        return saldo;
    }
public String getNumeroCuenta() {
        return numeroCuenta;
    }
}
