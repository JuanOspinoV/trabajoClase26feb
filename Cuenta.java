public class Cuenta {

    private double saldo;

    // Constructor sin saldo inicial
    public Cuenta() {
        saldo = 0;
    }

    // Constructor con saldo inicial
    public Cuenta(double saldoInicial) {
        if (saldoInicial >= 0) {
            saldo = saldoInicial;
        } else {
            saldo = 0;
        }
    }

    // Depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo = saldo + monto;
            System.out.println("Deposito realizado.");
        } else {
            System.out.println("Monto invalido.");
        }
    }

    // Retirar dinero
    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Monto invalido.");
        } else if (monto > saldo) {
            System.out.println("Fondos insuficientes.");
        } else {
            saldo = saldo - monto;
            System.out.println("Retiro realizado.");
        }
    }

    // Consultar saldo
    public double getSaldo() {
        return saldo;
    }
}
