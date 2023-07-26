package co.com.MAKAIA.EjercicioColas;

public class Cliente {
    private int ticket;
    private String nombre;

    public Cliente(int ticket, String nombre) {
        this.ticket = ticket;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ticket: " + ticket + ", nombre: " + nombre;
    }
}
