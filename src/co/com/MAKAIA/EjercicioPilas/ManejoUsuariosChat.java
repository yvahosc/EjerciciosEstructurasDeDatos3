package co.com.MAKAIA.EjercicioPilas;

import co.com.MAKAIA.Peticiones.Peticiones;
import java.util.Stack;

public class ManejoUsuariosChat {
    private static ManejoUsuariosChat manejoUsuariosChat;
    private Stack<Usuario> pilaUsuarios = new Stack<>();

    private ManejoUsuariosChat(){}

    public static ManejoUsuariosChat getManejoUsuariosChat(){
        if(manejoUsuariosChat == null) {
            manejoUsuariosChat = new ManejoUsuariosChat();
        }
        return manejoUsuariosChat;
    }

    public void conectarUsuarioAlChat(){
        String nombre = Peticiones.pedirTexto("Ingrese el nombre del " +
                "usuario a agregar:");
        Usuario usuario = new Usuario(nombre);
        pilaUsuarios.push(usuario);
        System.out.println("El usuario '" + usuario + "' fue agregado " +
                "exitosamente al chat.");
    }

    public void mostrarUsuariosEnChat(){
        if(pilaUsuarios.isEmpty()){
            System.out.println("No hay usuarios en el chat.");
        }else{
            System.out.println("\nUsuarios en el chat:");
            for (int i = pilaUsuarios.size() - 1; i >= 0 ; i--) {
                System.out.println(pilaUsuarios.get(i));
            }
        }
    }

    public void desconectarUsuarioDelChat(){
        if(pilaUsuarios.isEmpty()){
            System.out.println("No hay usuarios en el chat.");
        } else{
            mostrarUsuariosEnChat();
            String nombre = Peticiones.pedirTexto("Ingrese el nombre del " +
                    "usuario a desconectar:");
            if(!usuarioEstaEnElChat(nombre)){
                System.out.println("El usuario " + nombre + " no se encuentra" +
                        " en el chat.");
            }else{
                if(nombre.equals(pilaUsuarios.peek().getNombre())){
                    Usuario usuarioADesconectar = pilaUsuarios.pop();
                    System.out.println("El usuario '" + usuarioADesconectar +
                            "' fue desconectado del chat.");
                    mostrarUsuariosEnChat();
                } else{
                    System.out.println("No es posible desconectar al usuario "
                            + nombre + ".");
                }
            }
        }
    }

    public boolean usuarioEstaEnElChat(String nombreUsuarioABuscar){
        boolean usuarioEstaIncluidoEnElChat = false;
        for(Usuario usuario: pilaUsuarios){
            if(usuario.getNombre().equals(nombreUsuarioABuscar)){
                usuarioEstaIncluidoEnElChat = true;
                break;
            }
        }
        return usuarioEstaIncluidoEnElChat;
    }
}
