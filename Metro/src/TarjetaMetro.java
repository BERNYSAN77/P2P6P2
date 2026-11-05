public class TarjetaMetro {
    private String tipoDePasajero;
    private String codigo;
    public float saldo;

    public TarjetaMetro(){}
    public TarjetaMetro(float saldo){
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "saldo : " + this.saldo;
    }



}