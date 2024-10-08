import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;

            while (true) {
                System.out.println("Seleccione una opción:");
                System.out.println("1. Convertir de metros");
                System.out.println("2. Convertir de yardas");
                System.out.println("3. Convertir de pulgadas");
                System.out.println("4. Convertir de pies");
                System.out.println("5. Salir");
                opcion = scanner.nextInt();

                if (opcion == 5) {
                    break;
                }

                System.out.println("Ingrese la cantidad N:");
                int cantidad = scanner.nextInt();

                switch (opcion) {
                    case 1 -> convertirDeMetros(cantidad);
                    case 2 -> convertirDeYardas(cantidad);
                    case 3 -> convertirDePulgadas(cantidad);
                    case 4 -> convertirDePies(cantidad);
                    default -> System.out.println("Opción no válida.");
                }
            }
        }
    }

    public static void convertirDeMetros(int n) {
        System.out.println("CONVERSIONES DE METROS:");
        System.out.printf("%-10s %-10s %-10s %-10s%n", "METROS", "YARDAS", "PULGADAS", "PIES");
        for (int i = 1; i <= n; i++) {
            double yardas = i * 1.09361;
            double pulgadas = i * 39.3701;
            double pies = i * 3.28084;
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f%n", i, yardas, pulgadas, pies);
        }
    }

    public static void convertirDeYardas(int n) {
        System.out.println("CONVERSIONES DE YARDAS:");
        System.out.printf("%-10s %-10s %-10s %-10s%n", "YARDAS", "METROS", "PULGADAS", "PIES");
        for (int i = 1; i <= n; i++) {
            double metros = i * 0.9144;
            double pulgadas = i * 36;
            double pies = i * 1;
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f%n", i, metros, pulgadas, pies);
        }
    }

    public static void convertirDePulgadas(int n) {
        System.out.println("CONVERSIONES DE PULGADAS:");
        System.out.printf("%-10s %-10s %-10s %-10s%n", "PULGADAS", "METROS", "YARDAS", "PIES");
        for (int i = 1; i <= n; i++) {
            double metros = i * 0.0254;
            double yardas = i * 0.0277778;
            double pies = i * 0.0833333;
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f%n", i, metros, yardas, pies);
        }
    }

    public static void convertirDePies(int n) {
        System.out.println("CONVERSIONES DE PIES:");
        System.out.printf("%-10s %-10s %-10s %-10s%n", "PIES", "METROS", "YARDAS", "PULGADAS");
        for (int i = 1; i <= n; i++) {
            double metros = i * 0.3048;
            double yardas = i * 0.333333;
            double pulgadas = i * 12;
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f%n", i, metros, yardas, pulgadas);
        }
    }
}
