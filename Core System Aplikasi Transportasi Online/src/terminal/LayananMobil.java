package terminal;

class LayananMobil extends Layanan{
    private double biayaTotal = 0;

    LayananMobil(String idOrder, double jarakKm, double tarifPerKm, double biayaTotal){
        super(idOrder, jarakKm, tarifPerKm);
        this.biayaTotal = biayaTotal;
    }

    @Override
    public double hitungTarif(){
        return (jarakKm * tarifPerKm) + biayaTotal;
    }

    @Override
    public String toString(){
        return "[Mobil] Order [Id:" + idOrder + "] (Via Tol)";
    }
}
