import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio1 {
    public static String[] Op(String frase) {
        return frase.split("\\s+");
    }

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Ingrese una frase:");
            String frase = entrada.nextLine();

            String[] palabras = Op(frase);

            if (palabras.length == 0) {
                System.out.println("No hay palabras en la frase");
                return;
            }

            List<String> palabrasLargas = new ArrayList<>();
            List<String> palabrasCortas = new ArrayList<>();
            palabrasLargas.add(palabras[0]);
            palabrasCortas.add(palabras[0]);

            int longMax = palabras[0].length();
            int longMin = palabras[0].length();

            int posLarga = 0;
            int posCorta = 0;
            int posicionActual = 0;

            for (String palabra : palabras) {
                int pInicial = frase.indexOf(palabra, posicionActual);
                posicionActual = pInicial + palabra.length();

                if (palabra.length() > longMax) {
                    longMax = palabra.length();
                    palabrasLargas.clear();
                    palabrasLargas.add(palabra);
                    posLarga = pInicial;
                } else if (palabra.length() == longMax) {
                    palabrasLargas.add(palabra);
                }

                if (palabra.length() < longMin) {
                    longMin = palabra.length();
                    palabrasCortas.clear();
                    palabrasCortas.add(palabra);
                    posCorta = pInicial;
                } else if (palabra.length() == longMin) {
                    palabrasCortas.add(palabra);
                }
            }

            System.out.println("Palabras más largas:");
            for (String pLarga : palabrasLargas) {
                System.out.println(pLarga + " (Posición: " + frase.indexOf(pLarga, posLarga) + ")");
            }

            System.out.println("Palabras más cortas:");
            for (String pCorta : palabrasCortas) {
                System.out.println(pCorta + " (Posición: " + frase.indexOf(pCorta, posCorta) + ")");
            }
        }
    }
}
