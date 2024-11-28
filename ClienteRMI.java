import java.rmi.Naming;
import java.util.Scanner;

public class ClienteRMI {
    public static void main(String[] args) {
        try {
            // Obtener la referencia al objeto remoto del servidor RMI
            BMIRemoto bmiRemoto = (BMIRemoto) Naming.lookup("rmi://localhost/BMIRemoto");

            // Crear un objeto Scanner para leer las entradas del usuario
            Scanner scanner = new Scanner(System.in);

            // Pedir al usuario el peso y la altura antes de entrar al menú
            System.out.print("Introduce tu peso en kg: ");
            double peso = scanner.nextDouble();
            System.out.print("Introduce tu altura en metros: ");
            double altura = scanner.nextDouble();

            // Calcular el BMI utilizando los valores de peso y altura
            double bmi = bmiRemoto.calcularBMI(peso, altura);
            String bmiFormateado = String.format("%.2f", bmi);
            // Menú de opciones
            int opcion = 0;
            do {
                // Mostrar el menú
                System.out.println("\nMenú:");
                System.out.println("1. Calcular BMI");
                System.out.println("2. Ver categoría del BMI");
                System.out.println("3. Salir");
                System.out.print("Selecciona una opción: ");
                
                // Leer la opción seleccionada
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        // Recálculo del BMI
                        bmi = bmiRemoto.calcularBMI(peso, altura);
                        System.out.println("Tu BMI es: " + bmiFormateado);
                        break;

                    case 2:
                        // Mostrar la categoría del BMI
                        String categoria = bmiRemoto.obtenerCategoriaBMI(bmi);
                        System.out.println("Categoría del BMI: " + categoria);
                        break;

                    case 3:
                        System.out.println("Saliendo del programa.");
                        break;

                    default:
                        System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                        break;
                }

            } while (opcion != 3);  // Continuar hasta que el usuario elija salir

        } catch (Exception e) {
            System.err.println("Error en el cliente: " + e.toString());
            e.printStackTrace();
        }
    }
}
