package terminal;

public class Main {
    public static void main(String[] args) {
        NotaPesanan notaBudi = new NotaPesanan("Budi", 5);
        
        notaBudi.tambahMenu(new Makanan("Sate Ayam", 20000, true)); 
        notaBudi.tambahMenu(new Minuman("Es Jeruk", 8000, false)); 
        notaBudi.tambahMenu(new Minuman("Kopi Susu", 15000, true)); 

        notaBudi.cetakStruk();
    }
}
