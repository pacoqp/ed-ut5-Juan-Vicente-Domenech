    import java.util.Scanner;

    public class PruebaGit{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Pedimos al usuario que ingrese los dos números
            System.out.print("Ingrese el primer número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double numero2 = scanner.nextDouble();

            // Realizamos las operaciones
            double suma = numero1 + numero2;
            double resta = numero1 - numero2;
            double multiplicacion = numero1 * numero2;
            double division = numero1 / numero2;

            // Mostramos los resultados
            System.out.println("La suma es: " + suma);
            System.out.println("La resta es: " + resta);
            System.out.println("La multiplicación es: " + multiplicacion);
            System.out.println("La división es: " + division);
        }
    }
