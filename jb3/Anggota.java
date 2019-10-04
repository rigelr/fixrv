package jb3;

public class Anggota {
    private  String nama,ktp;
    private String alamat;
    private float simpanan,limitPinjam,jmlPinjam;

    public Anggota(String ktp, String nama,float limitPinjam) {
        this.nama = nama;
        this.ktp = ktp;
        this.limitPinjam = limitPinjam;
    }
   
    
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return  alamat;
    }
    public float getSimpanan(){
        return simpanan;
    }
    public void setor(float uang){
        simpanan +=uang;
    }
    public void setLimitPinjaman(float uang){
        limitPinjam=uang;
    }
    public float getLimitPinjaman(){
        return  limitPinjam;
    }
   
    public void pinjam(float newPinjam){
        if(newPinjam<limitPinjam){
            jmlPinjam+=newPinjam;
            simpanan-=newPinjam;
        }
        else{
            System.out.println("Transaksi melebihi limit !");
        }
    }
     public float getJmlPinjaman(){
      return  jmlPinjam;
    }
    public void angsur(float uang){
        float min=jmlPinjam*10/100;
        if(uang>min){
            jmlPinjam-=uang;
        }
        else{
            System.out.println("Maaf,angsuran harus 10%	dari jumlah pinjaman");
        }
    }

}
