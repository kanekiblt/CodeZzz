import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion, numero;
            while (true) {
                System.out.println("Seleccione una opción:");
                System.out.println("1. Tablas de multiplicar");
                System.out.println("2. Tablas de dividir");
                System.out.println("3. Tablas de sumar");
                System.out.println("4. Tablas de restar");
                System.out.println("5. Salir");
                opcion = scanner.nextInt();

                if (opcion == 5) {
                    break;
                }

                System.out.println("Ingrese el número de la tabla (1-10):");
                numero = scanner.nextInt();

                switch (opcion) {
                    case 1 -> {
                        for (int i = 1; i <= 10; i++) {
                            System.out.println(numero + " x " + i + " = " + (numero * i));
                        }
                    }
                    case 2 -> {
                        for (int i = 1; i <= 10; i++) {
                            System.out.println(numero + " / " + i + " = " + (numero / (double) i));
                        }
                    }
                    case 3 -> {
                        for (int i = 1; i <= 10; i++) {
                            System.out.println(numero + " + " + i + " = " + (numero + i));
                        }
                    }
                    case 4 -> {
                        for (int i = 1; i <= 10; i++) {
                            System.out.println(numero + " - " + i + " = " + (numero - i));
                        }
                    }
                    default -> System.out.println("Opción no válida.");
                }
            }
        }
    }
}
