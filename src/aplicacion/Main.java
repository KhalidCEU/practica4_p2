package aplicacion;
import mates.*;

public class Main {
    public static void usage(int exitstatus) {
        System.out.println("Uso: ./a.out [OPCIONES] <string1> <string2>\n");
        System.out.println("OPCIONES\n");
        System.out.println("\t-h  : Muestra este mensaje\n");
        System.exit(exitstatus);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Error: Se requieren dos cadenas como argumentos\n");
            usage(1);
        }

        if (args[0].equals("-h")  || args.length != 2) {
            usage(0);
        }

        try {
            String str1 = args[0];
            String str2 = args[1];

            System.out.println("La distancia de edición es " +
                CalculadoraDistancias.calcularDistancia(str1, str2)
            );

        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }

    }
}
