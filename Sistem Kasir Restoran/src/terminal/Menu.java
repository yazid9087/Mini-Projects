package terminal;

class Menu {
    protected String namaMenu;
    protected double hargaDasar;

    Menu(String namaMenu, double hargaDasar){
        this.namaMenu = namaMenu;
        this.hargaDasar = hargaDasar;
    }

    public double hitungHarga(){
        return this.hargaDasar;
    }

    public String show(){
        return "Menu: " + this.namaMenu + "\n";
    }
}
