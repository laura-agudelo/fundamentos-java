import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\nSeleccione una categoría:");
            System.out.println("1. Casteo");
            System.out.println("2. Asignación");
            System.out.println("3. Inc/Dec");
            System.out.println("4. Combinados");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opción deseada: ");

            // Lee la opción del usuario
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                Solve.mostrarEjercicios(opcion);

                int numEjercicio = sc.nextInt();
                if (numEjercicio >= 1 && numEjercicio <= 10) {
                    // Ejecuta el ejercicio seleccionado
                    switch (opcion) {
                        case 1:
                            Solve.ejecutarCasteo(numEjercicio);
                            break;
                        case 2:
                            Solve.ejecutarAsignacion(numEjercicio);
                            break;
                        case 3:
                            Solve.ejecutarIncDec(numEjercicio);
                            break;
                        case 4:
                            Solve.ejecutarCombinados(numEjercicio);
                            break;
                    }
                } else {
                    System.out.println("Número no válido. Debe ser entre 1 y 10.");
                }
            } else if (opcion != 5) {
                System.out.println("Opción no válida. Debe ser entre 1 y 5.");
            }

        } while (opcion != 5);

        System.out.println("Saliendo...");
        sc.close();
    }
}
