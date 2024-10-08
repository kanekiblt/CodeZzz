import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese la cantidad en pesos (por ejemplo, 577.80):");
            double cantidad = scanner.nextDouble();

            int cantidadPesos = (int) cantidad;
            int cantidadCentavos = (int) Math.round((cantidad - cantidadPesos) * 100);

            int[] billetes = { 500, 200, 100, 50, 20, 10, 5, 2, 1 };
            int[] monedas = { 50, 20, 10, 5, 1 };

            System.out.println("Billetes y monedas necesarios:");

            for (int billete : billetes) {
                int count = cantidadPesos / billete;
                if (count > 0) {
                    System.out.println(count + " billetes de " + billete + " pesos");
                    cantidadPesos -= count * billete;
                }
            }

            for (int moneda : monedas) {
                int count = cantidadCentavos / moneda;
                if (count > 0) {
                    System.out.println(count + " monedas de " + moneda + " centavos");
                    cantidadCentavos -= count * moneda;
                }
            }
        }
    }
}
