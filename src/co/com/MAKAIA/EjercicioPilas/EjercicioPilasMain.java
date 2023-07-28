package co.com.MAKAIA.EjercicioPilas;

import co.com.MAKAIA.Peticiones.Peticiones;

public class EjercicioPilasMain {
    public static void main(String[] args) {
        boolean programaEnEjecucion = true;
        ManejoUsuariosChat manejoUsuariosChat =
                ManejoUsuariosChat.getManejoUsuariosChat();

        while(programaEnEjecucion){
            mostrarMenu();
            int opcionMenu =
                    Peticiones.pedirNumeroEntero("Ingrese número de " +
                    "acción que desea realizar:");
            switch (opcionMenu){
                case 1:
                    manejoUsuariosChat.conectarUsuarioAlChat();
                    break;
                case 2:
                    manejoUsuariosChat.mostrarUsuariosEnChat();
                    break;
                case 3:
                    manejoUsuariosChat.desconectarUsuarioDelChat();
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
        System.out.println("\nGestión de usuarios.");
        System.out.println("1. Agregar un usuario al chat.");
        System.out.println("2. Mostrar todos los usuarios en el chat.");
        System.out.println("3. Desconectar usuario del chat.");
        System.out.println("4. Salir del programa.");
    }
}
