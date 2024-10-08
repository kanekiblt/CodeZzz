
import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        int num, inv, div, valor;
        String capicua;
        try (Scanner input = new Scanner(System.in)) {
            do {
                System.out.print("Ingresa un número capicúa: ");
                num = input.nextInt();
                valor = num;
                inv = 0;

                while (num > 0) {
                    div = num % 10;
                    inv = inv * 10 + div;
                    num = num / 10;
                }

                if (valor == inv) {
                    capicua = "SI";
                } else {
                    capicua = "NO";
                }

                System.out.println("El número " + valor + " " + capicua + " es capicúa");

                System.out.print("¿Quieres ingresar otro número? (S/N): ");
                char respuesta = input.next().charAt(0);
                if (respuesta == 'N' || respuesta == 'n') {
                    break;
                }

            } while (true);
        }
    }
}
