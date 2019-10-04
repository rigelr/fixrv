package jb2.tugas1;

public class Persewaan {
    public String id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int lamaSewa;
    
    public void dataPinjam(){
        System.out.println("Id : "+id);
        System.out.println("Nama Member : "+namaMember);
        System.out.println("Nama Game : "+namaGame);
        System.out.println("Harga   : "+harga);
        System.out.println("Lama Pinjam : "+lamaSewa+" hari");
        System.out.println("Harga yang harus dibayar : "+totalBayar(lamaSewa));
    }
    public int totalBayar(int lamaSewa){
        return harga*lamaSewa;
    }
}
