import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String expresion;

            do {
                System.out.println("Ingrese una expresión aritmética o 'salir' para terminar:");
                expresion = scanner.nextLine();

                if (expresion.equalsIgnoreCase("salir")) {
                    break;
                }

                StringBuilder operandoA = new StringBuilder();
                double resultado = 0;
                char operador = '+';

                System.out.println("Operandos:");
                for (int i = 0; i < expresion.length(); i++) {
                    char c = expresion.charAt(i);

                    if (Character.isDigit(c) || c == '.') {
                        operandoA.append(c);
                    } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                        if (operandoA.length() > 0) {
                            double valor = Double.parseDouble(operandoA.toString());
                            resultado = realizarO(resultado, valor, operador);
                            System.out.println(operandoA);
                            operandoA.setLength(0);
                        }
                        operador = c;
                        System.out.println("Operador: " + c);
                    }
                }

                if (operandoA.length() > 0) {
                    double valor = Double.parseDouble(operandoA.toString());
                    resultado = realizarO(resultado, valor, operador);
                    System.out.println(operandoA);
                }

                System.out.println("Resultado: " + resultado);

            } while (true);
        } catch (NumberFormatException e) {

        }
        System.out.println("Programa finalizado.");
    }

    private static double realizarO(double a, double b, char operador) {
        return switch (operador) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> b;
        };
    }
}
