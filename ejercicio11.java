import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese la longitud del primer lado:");
            double a = scanner.nextDouble();
            System.out.println("Ingrese la longitud del segundo lado:");
            double b = scanner.nextDouble();
            System.out.println("Ingrese la longitud del tercer lado:");
            double c = scanner.nextDouble();

            double anguloA = calcularAngulo(a, b, c);
            double anguloB = calcularAngulo(b, a, c);
            double anguloC = calcularAngulo(c, a, b);

            System.out.printf("Ángulo A: %.2f grados%n", anguloA);
            System.out.printf("Ángulo B: %.2f grados%n", anguloB);
            System.out.printf("Ángulo C: %.2f grados%n", anguloC);
        }
    }

    public static double calcularAngulo(double ladoOpuesto, double ladoAdyacente1, double ladoAdyacente2) {
        double coseno = (ladoAdyacente1 * ladoAdyacente1 + ladoAdyacente2 * ladoAdyacente2 - ladoOpuesto * ladoOpuesto)
                / (2 * ladoAdyacente1 * ladoAdyacente2);
        return Math.toDegrees(Math.acos(coseno));
    }
}
