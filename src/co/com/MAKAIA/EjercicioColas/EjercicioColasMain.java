package co.com.MAKAIA.EjercicioColas;

import co.com.MAKAIA.Peticiones.Peticiones;

public class EjercicioColasMain {
    public static void main(String[] args) {
        boolean programaEnEjecucion = true;
        ManejoClientes manejoClientes = ManejoClientes.getManejoClientes();

        while(programaEnEjecucion){
            mostrarMenu();
            int opcionMenu = Peticiones.pedirNumeroEntero("Ingrese número de " +
                    "acción que desea realizar:");
            switch (opcionMenu){
                case 1:
                    manejoClientes.agregarClienteALaCola();
                    break;
                case 2:
                    manejoClientes.mostrarClientesEnCola();
                    break;
                case 3:
                    manejoClientes.atenderCliente();
                    break;
                case 4:
                    programaEnEjecucion = false;
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Ingrese un valor válido.");
            }
        }
    }

    public static void mostrarMenu(){
        System.out.println("\nGestión de empleados.");
        System.out.println("1. Agregar un cliente a la cola.");
        System.out.println("2. Mostrar todos los clientes en cola.");
        System.out.println("3. Atender siguiente cliente.");
        System.out.println("4. Salir del programa.");
    }
}
