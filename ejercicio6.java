import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el primer cateto:");
            double a = scanner.nextDouble();
            System.out.println("Ingrese el segundo cateto:");
            double b = scanner.nextDouble();
            System.out.println("Ingrese la hipotenusa:");
            double c = scanner.nextDouble();

            String tipoTriangulo = clasificarTriangulo(a, b, c);
            System.out.println("El triángulo es: " + tipoTriangulo);
        }
    }

    public static String clasificarTriangulo(double a, double b, double c) {
        double c2 = c * c;
        double sumaCatetos = (a * a) + (b * b);
        if (c2 == sumaCatetos) {
            return "rectángulo";
        } else if (c2 < sumaCatetos) {
            return "acutángulo";
        } else {
            return "obtusángulo";
        }
    }
}
