/*
 * /*
 * @author: Jhoselin Villca Apaza
 * Actividad #1 - Review Programing I.- I.- Quadrant Selection
 * Actividad #1 - Review Programing I.- II.- Last Factorial Digit
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

        System.out.println("---------------------------------");
        System.out.println("|      I.- Quadrant Selection   |");
        System.out.println("---------------------------------");

        System.out.print("Intro coordenada en -> x: ");
        int x_coordenada = lee.nextInt();
        System.out.print("Intro coordenada en -> y: ");
        int y_coordenada = lee.nextInt();

        if (x_coordenada == 0 && y_coordenada == 0) {
            System.out.println("El punto está en el origen");
        } else if (x_coordenada == 0 || y_coordenada == 0) {
            System.out.println("El punto está en un eje");
        } else if (x_coordenada > 0 && y_coordenada > 0) {
            System.out.println("---> Cuadrante 1");
        } else if (x_coordenada < 0 && y_coordenada > 0) {
            System.out.println("---> Cuadrante 2");
        } else if (x_coordenada < 0 && y_coordenada < 0) {
            System.out.println("---> Cuadrante 3");
        } else if (x_coordenada > 0 && y_coordenada < 0) {
            System.out.println("---> Cuadrante 4");
        }

        System.out.println("---------------------------------");
        System.out.println("|   II.- Last Factorial Digit   |");
        System.out.println("---------------------------------");

        System.out.print("Intro cantidad de numeros: ");
        int T = lee.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.print("Factorial de: ");
            int factorial = lee.nextInt();
            int ultimoDigito;
            if (factorial < 0) {
                ultimoDigito = -1;
            } else if (factorial == 0) {
                ultimoDigito = 1;
            } else if (factorial <= 4) {
                int resultadoFactorial = 1;
                for (int j = 2; j <= factorial; j++) {
                    resultadoFactorial *= j;
                }
                ultimoDigito = resultadoFactorial % 10;
            } else {
                ultimoDigito = 0;
            }
            System.out.println("El ultimo digito es: " + ultimoDigito);
        }
    }
}
