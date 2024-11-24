    import java.util.Scanner;

    public class PruebaGit{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Pedimos al usuario que ingrese los tres números
            System.out.print("Ingrese el primer número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double numero2 = scanner.nextDouble();

            System.out.print("Ingrese el tercer número: ");
            double numero3 = scanner.nextDouble();

            // Realizamos las operaciones
            double suma = numero1 + numero2 + numero3;
            double resta = numero1 - numero2 - numero3;
            double multiplicacion = numero1 * numero2 * numero 3;
            double division = numero1 / numero2;

            // Mostramos los resultados
            System.out.println("La suma es: " + suma);
            System.out.println("La resta es: " + resta);
            System.out.println("La multiplicación es: " + multiplicacion);
            System.out.println("La división es: " + division);
        }
    }
