package terminal;

class Pakaian extends Barang{
    private boolean isDiskon;

    Pakaian(String namabarang, double hargaDasar, int beratGram, boolean isDiskon){
        super(namabarang, hargaDasar, beratGram);
        this.isDiskon = isDiskon;
    }

    @Override
    public double hargaAkhir(){
        double hargaAsli = super.hargaAkhir();
        double hargaTotal = this.isDiskon ? (hargaAsli * 0.8) : hargaAsli;
        return hargaTotal;
    }

    @Override
    public String toString(){
        String teksDiskon = this.isDiskon ? " [Promo 20%] " : "";
        return super.toString() + teksDiskon;
    }
}
