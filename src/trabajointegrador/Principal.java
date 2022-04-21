package trabajointegrador;
public class Principal {
    public static void main(String[] args) {
        Posnet posnet = new Posnet();
        Persona titular = new Persona("192.168.3.2","Jose","Perez","1234567","joperez@gmail.com");
        TarjetaCredito tarjetaCredito = new TarjetaCredito("BBVA","5555",15000,EntidadFinanciera.VISA,titular);
        
        Ticket ticket = posnet.efectuarPago(tarjetaCredito,5000,1);
    }
}