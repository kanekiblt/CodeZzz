import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el primer número:");
            int num1 = scanner.nextInt();
            System.out.println("Ingrese el segundo número:");
            int num2 = scanner.nextInt();

            int mcd = calcularMCD(num1, num2);
            int mcm = calcularMCM(num1, num2, mcd);

            System.out.println("El máximo común divisor (MCD) es: " + mcd);
            System.out.println("El mínimo común múltiplo (MCM) es: " + mcm);
        }
    }

    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int calcularMCM(int a, int b, int mcd) {
        return (a * b) / mcd;
    }
}
