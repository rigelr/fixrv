package jb2.tugas4;

public class BarangMain {
    public static void main(String[] args) {
        Barang br1 = new Barang();
        
        br1.kode="01";
        br1.namaBarang="Baju";
        br1.hargaDasar=100000;
        br1.diskon=20;
        br1.hitungHargaJual();
        br1.tampilData();
        
    }

}
