package jb2.tugas3;

public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran hub1= new Lingkaran();
        
        hub1.r=7;
        System.out.println("Keliling lingkaran adalah "+hub1.hitungKeliling());
        System.out.println("Luas Lingkaran adalah : "+hub1.hitungLuas());
        
    }

}
