package co.com.MAKAIA.EjercicioColas;

import co.com.MAKAIA.Peticiones.Peticiones;

import java.util.LinkedList;
import java.util.Queue;

public class ManejoClientes {
    private static ManejoClientes manejoClientes;
    private Queue<Cliente> colaClientes = new LinkedList<>();

    private ManejoClientes(){}

    public static ManejoClientes getManejoClientes(){
        if(manejoClientes == null){
            manejoClientes = new ManejoClientes();
        }
        return manejoClientes;
    }

    public void agregarClienteALaCola(){
        String nombre = Peticiones.pedirTexto("Ingrese el nombre del cliente" +
                " a agregar:");
        int ticket = Peticiones.pedirNumeroEntero("Ingrese el número del " +
                "ticket del  empleado a agregar:");
        Cliente cliente = new Cliente(ticket, nombre);
        colaClientes.offer(cliente);
        System.out.println("El cliente '" + cliente + "' fue agregado " +
                "exitosamente a la cola.");
    }

    public void mostrarClientesEnCola(){
        if(colaClientes.isEmpty()){
            System.out.println("No hay clientes en cola.");
        }else{
            for(Cliente cliente: colaClientes){
                System.out.println(cliente);
            }
        }
    }

    public void atenderCliente(){
        if(colaClientes.isEmpty()){
            System.out.println("No hay clientes en cola.");
        } else{
            Cliente clientePorAtender = colaClientes.poll();
            System.out.println("El cliente '" + clientePorAtender + "' fue " +
                    "atendido exitosamente.");
        }
    }
}
