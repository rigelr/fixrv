package jb3;

import java.util.Scanner;

public class TestKoperasi {
    public static void menu(){
        System.out.println("=== KOPERASI SIMPAN PINJAM ===");
        System.out.println("1. Pinjam");
        System.out.println("2. Angsur");
        System.out.println("3. selesai");
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);//float
        Scanner b = new Scanner(System.in);//int
        float x;
        Anggota donny = new Anggota ("111333444", "Donny", 5000000); 
        
        int pil=0;
        do{
            menu();
            System.out.println("pilih menu : ");
        pil=b.nextInt();
        
        switch (pil){
            case 1 : 
                System.out.println("== PEMINJAMAN ==");
                System.out.println("Nama Anggota: " + donny.getNama());   
                System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
                System.out.println("-----------------------------");
                System.out.println("Masukkan jumlah uang yang ingin dipinjam : ");
                donny.pinjam(x = a.nextFloat());
                System.out.println("-----------------------------");
                break;
            case 2 :
                System.out.println("== PEMBAYARAN ANGSURAN ==");
                System.out.println("Nama Anggota: " + donny.getNama());   
                System.out.println("Jumlah pinjaman saat ini: " + donny.getJmlPinjaman());
                System.out.println("Masukkan jumlah angsuran : ");
                donny.angsur(x=a.nextFloat());
                System.out.println("Jumlah pinjaman saat ini: " + donny.getJmlPinjaman());
                break;
        }
            
        }
        while(pil!=3);
        
    }

}
