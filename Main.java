package Ejercicio1_cuentaBancaria;

public class Main {
    public static void main(String[] args) {
 CuentaBancaria cuenta1 = new CuentaBancaria("112233", "Tiziano Galetto", 1000.0);
        System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("Nombre del titular: " + cuenta1.getNombreTitular());
        System.out.println("Saldo: " + cuenta1.getSaldo());
        System.out.println(cuenta1.Depositar(500.0));
        System.out.println(cuenta1.Extraer(200.0));
    }
}
