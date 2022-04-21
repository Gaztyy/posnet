package trabajointegrador;
public class TarjetaCredito {
    private String entidadBancaria,numeroTarjeta;
    private double saldo;
    public EntidadFinanciera entidadFinanciera;
    public Persona titular;

    public TarjetaCredito(String entidadBancaria, String numeroTarjeta, double saldo, EntidadFinanciera entidadFinanciera, Persona titular) {
        this.entidadBancaria = entidadBancaria;
        this.numeroTarjeta = numeroTarjeta;
        this.saldo = saldo;
        this.entidadFinanciera = entidadFinanciera;
        this.titular = titular;
    }

    public boolean tieneSaldoDisponible(double montoFinal) {
        return saldo>=montoFinal;
    }

    void descontar(double montoFinal) {
        saldo-=montoFinal;
    }

    public String getNombreCompleto() {
        return titular.getNombre()+titular.getApellido();
    }
    
    @Override
    public String toString() {
        return "TarjetaDeCredito:" + "\nentidad bancaria:" + entidadBancaria + "\nnúmero de tarjeta:" + numeroTarjeta + "\nsaldo:" + saldo + "\ntitular:" + titular + "\nentidad financiera:" + entidadFinanciera;
    }
}