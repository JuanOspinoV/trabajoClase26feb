import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("=== BANCO EL AHORRADOR ===");
        System.out.print("Ingrese saldo inicial: ");
        double saldoInicial = teclado.nextDouble();

        Cuenta cuenta = new Cuenta(saldoInicial);

        int opcion;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Monto a depositar: ");
                    double d = teclado.nextDouble();
                    cuenta.depositar(d);
                    break;

                case 2:
                    System.out.print("Monto a retirar: ");
                    double r = teclado.nextDouble();
                    cuenta.retirar(r);
                    break;

                case 3:
                    System.out.println("Saldo actual: " + cuenta.getSaldo());
                    break;

                case 4:
                    System.out.println("Hasta luego.");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 4);

        teclado.close();
    }
}
