package terminal;

class Makanan extends Menu {
    private boolean tambahNasi;

    Makanan(String namaMenu, double hargaDasar, boolean tambahNasi){
        super(namaMenu, hargaDasar);
        this.tambahNasi = tambahNasi;
    }

    @Override
    public double hitungHarga(){
        double hargaNasi = this.tambahNasi ? 5000 : 0;

        return super.hitungHarga() + hargaNasi;
    }

    @Override
    public String toString(){
        String Nasi = this.tambahNasi ? " + Nasi " : " tidak Nasi";

        return super.show() + Nasi;
    }
}
