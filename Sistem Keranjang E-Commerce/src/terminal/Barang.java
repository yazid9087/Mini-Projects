package terminal;
class Barang {
    protected String namaBarang;
    protected double hargaDasar;
    protected int beratGram;
    
    Barang(String namabarang, double hargaDasar, int beratGram){
        this.namaBarang = namabarang;
        this.hargaDasar = hargaDasar;
        this.beratGram = beratGram;
    }

    public double hargaAkhir(){
        return this.hargaDasar;
    }

    @Override
    public String toString(){
        return "Barang: " + this.namaBarang + " (" + this.beratGram + "g)";
    }
}
