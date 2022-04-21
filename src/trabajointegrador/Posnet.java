package trabajointegrador;
public class Posnet {
    public static final double RECARGO_POR_CUOTA = 0.03;
    public static final int MIN_CANT_CUOTA = 1;
    public static final int MAX_CANT_CUOTA = 6;

    
    
    public Posnet(){}
   
    public Ticket efectuarPago(TarjetaCredito tarjetaDeCredito, double montoAbonar, int cantCuotas) {
           Ticket ticket = null;
                if (validarDatos(tarjetaDeCredito, montoAbonar, cantCuotas)) {
                    double montoFinal = montoAbonar + montoAbonar*recargoCuota(cantCuotas);
                    if(tarjetaDeCredito.tieneSaldoDisponible(montoFinal)){
                        tarjetaDeCredito.descontar(montoFinal);
                        double montoPorCuota = montoFinal / cantCuotas;
                        String nombreCompleto = tarjetaDeCredito.getNombreCompleto();
                        ticket = new Ticket(nombreCompleto, montoFinal, montoPorCuota);
                    }
        }
                   
           return ticket;
    }

    private boolean validarDatos(TarjetaCredito tarjetaCredito, double montoAbonar, int cantCuotas) {
        boolean isTarjetaValida=false;
        boolean isMontoAbonar=false;
        boolean isCantidadcuota=false;
        
        if(tarjetaCredito != null){
            isTarjetaValida=true;
        }
        if(montoAbonar>=0){
            isMontoAbonar=true;
        }
        if(cantCuotas>=MIN_CANT_CUOTA && cantCuotas<=MAX_CANT_CUOTA){
            isCantidadcuota=true;
        }
        return isTarjetaValida && isMontoAbonar && isCantidadcuota;
    }

    private double recargoCuota(int cantCuotas) {
        return RECARGO_POR_CUOTA*(cantCuotas-1);
    }
}
