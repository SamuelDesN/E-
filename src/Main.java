import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Que vehiculo entra? (coche, moto, camión, tractor, grua):");
        String tipoVehiculo = scanner.nextLine();
        Vehiculo vehiculo = null;
        switch (tipoVehiculo.toLowerCase()) {
            case "coche":
                vehiculo = new Coche("123ABC", "Rojo", "Toyota");
                break;
            case "moto":
                vehiculo = new Moto("456DEF", "Negro", "Honda");
                break;
            case "camion":
                vehiculo = new Camion("789GHI", "Azul", "Ford");
                break;
            case "tractor":
                vehiculo = new Tractor("101JKL", "Verde", "John Deere");
                break;
            case "grua":
                vehiculo = new Grua("121MNO", "Blanco", "Volvo");
                break;
            default:
                System.out.println("Tipo de vehículo no válido.");
                return;
        }
        vehiculo.describir();
        System.out.println("¿Qué pieza necesita reparación?");
        int numeroPieza = scanner.nextInt();
        scanner.nextLine();

        vehiculo.repararPieza(numeroPieza);
        System.out.println("¿seguir o salir?");
        String continuar = scanner.nextLine();

        if (continuar.equalsIgnoreCase("seguir")) {
            boolean seguirReparando = true;
            while (seguirReparando) {
                vehiculo.describir();
                System.out.println("¿Qué pieza necesita reparación?");
                int numeroPieza2 = Integer.parseInt(scanner.nextLine());
                vehiculo.repararPieza(numeroPieza2);

                System.out.println("¿Seguir reparando este vehiculo?:");
                String decision = scanner.nextLine();
                if (decision.equalsIgnoreCase("salir")) {
                    seguirReparando = false;
                }
            }
        } else {
            System.out.println("Saliendo del taller...");
        }
    }
}