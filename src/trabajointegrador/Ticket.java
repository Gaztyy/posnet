package trabajointegrador;
public class Ticket {
   private String nombreApellido;
   private double montoTotal;
   private double montoCuota;

    public Ticket(String nombreApellido, double montoTotal, double montoCuota){
        this.nombreApellido = nombreApellido;
        this.montoTotal = montoTotal;
        this.montoCuota = montoCuota;
    }
    @Override
    public String toString() {
        return "\n\t\tTicket: " + "\nnombre y Apellido: " + nombreApellido + "\nmontoTotal: " + montoTotal + "\nmontoPorCouta: " + montoCuota ;
    }
    
}
