package jb2.tugas4;

public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    
    public int hitungHargaJual(){
        return (int) (hargaDasar-(diskon/100*hargaDasar));
    }
    public void tampilData(){
        System.out.println("Kode : "+kode);
        System.out.println("Nama Barang \t: "+namaBarang);
        System.out.println("Harga dasar \t: Rp."+hargaDasar);
        System.out.println("Diskon \t\t: "+diskon+" %");
        System.out.println("Harga jual \t: "+hitungHargaJual());
    }

}
