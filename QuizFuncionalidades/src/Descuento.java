public abstract class Descuento extends Tarjeta{
    public String tipo;
    private double descuento;

    public Descuento(String numeroDeCuenta, double valorApertura, String mes, String tipo) {
        super(numeroDeCuenta, valorApertura, mes);
        this.tipo = tipo;
    }
    public String getNumeroDeCuenta() {
        return super.getNumeroDeCuenta();
    }
    public double apertura= getValorApertura();
    public String getMes() {
        return super.getMes();
    }

    public double calcu() {
        double tota = 0;
        if (tipo == "Joven") {
            descuento = 0.11;
            tota= getValorDescontado(apertura, descuento);
        }
        else if (tipo == "Nomina") {
            descuento = 0.15;
            tota = getValorDescontado(apertura, descuento);
        }
        else if (tipo == "Visa"){
            descuento = 0.18;
            tota= getValorDescontado(apertura, descuento);
        }
        return tota;
    }

    public double getValorDescontado(double apertura, double descuento) {
        double total;
        total=apertura*descuento;
        return total;
    }

    @Override
    public double cuotaDeManejo(){
        double cuotaMane = 0;
        double valordes =getValorDescontado( apertura, descuento);

        if (tipo == "Joven") {
            cuotaMane = 50000-valordes;
        }
        else if (tipo == "Nomina") {
            cuotaMane = 50000-valordes;
        }
        else if (tipo == "Visa"){
            cuotaMane = 50000-valordes;
        }
        return cuotaMane;
    }


}