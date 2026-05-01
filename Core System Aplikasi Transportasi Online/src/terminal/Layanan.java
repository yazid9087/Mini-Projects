package terminal;

class Layanan {
    protected String idOrder;
    protected double jarakKm;
    protected double tarifPerKm;

    Layanan(String idOrder, double jarakKm, double tarifPerKm){
        this.idOrder = idOrder;
        this.jarakKm = jarakKm;
        this.tarifPerKm = tarifPerKm;
    }

    public double hitungTarif(){
        return jarakKm * tarifPerKm;
    }

    @Override
    public String toString(){
        return "Order [" + idOrder + "] - Jarak : " + jarakKm + " Km ";
    }
}
