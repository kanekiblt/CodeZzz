import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione qué desea calcular:");
            System.out.println("1. Calcular la hipotenusa (C)");
            System.out.println("2. Calcular el cateto A");
            System.out.println("3. Calcular el cateto B");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> calcularHipotenusa(scanner);
                case 2 -> calcularCatetoA(scanner);
                case 3 -> calcularCatetoB(scanner);
                case 4 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida, intente de nuevo.");
            }

        } while (opcion != 4);
    }

    public static void calcularHipotenusa(Scanner scanner) {
        System.out.println("Calcular Hipotenusa (C):");
        System.out.print("Ingrese el cateto A: ");
        double catetoA = scanner.nextDouble();
        System.out.print("Ingrese el cateto B: ");
        double catetoB = scanner.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
        System.out.println("La hipotenusa es: " + hipotenusa);
    }

    public static void calcularCatetoA(Scanner scanner) {
        System.out.println("Calcular Cateto A:");
        System.out.print("Ingrese el cateto B: ");
        double catetoB = scanner.nextDouble();
        System.out.print("Ingrese la hipotenusa C: ");
        double hipotenusa = scanner.nextDouble();

        if (hipotenusa > catetoB) {
            double catetoA = Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(catetoB, 2));
            System.out.println("El cateto A es: " + catetoA);
        } else {
            System.out.println("La hipotenusa debe ser mayor que el cateto B.");
        }
    }

    public static void calcularCatetoB(Scanner scanner) {
        System.out.println("Calcular Cateto B:");
        System.out.print("Ingrese el cateto A: ");
        double catetoA = scanner.nextDouble();
        System.out.print("Ingrese la hipotenusa C: ");
        double hipotenusa = scanner.nextDouble();

        if (hipotenusa > catetoA) {
            double catetoB = Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(catetoA, 2));
            System.out.println("El cateto B es: " + catetoB);
        } else {
            System.out.println("La hipotenusa debe ser mayor que el cateto A.");
        }
    }
}
