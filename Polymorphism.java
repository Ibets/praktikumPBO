/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

class KRS{
    String nama , alamat ,nomorTelepon,jenisKelamin;
    KRS(String nama ,String alamat,String nomorTelepon,String jenisKelamin){
        this.nama=nama;
        this.alamat=alamat;
        this.nomorTelepon=nomorTelepon;
        this.jenisKelamin=jenisKelamin;
    }
    
    void print(){
        System.out.println(this.nama);
        System.out.println(this.alamat);
        System.out.println(this.nomorTelepon);
        System.out.println(this.jenisKelamin);
    }
    
}
class Dosen extends KRS{
    String nomorIndukDosen;
    String umur;
    Dosen(String nama ,String alamat,String nomorTelepon,String jenisKelamin,String nomorIndukDosen,String umur){
        super(nama,alamat,nomorTelepon,jenisKelamin);
        this.nomorIndukDosen=nomorIndukDosen;
        this.umur=umur;
    }
    
    @Override
    void print(){
        System.out.println("Dosen :");
        System.out.println("Nama :"+this.nama);
        System.out.println("Alamat :"+this.alamat);
        System.out.println("Umur :"+this.umur);
        System.out.println("Nomor Telepon :"+this.nomorTelepon);
        System.out.println("Jenis Kelamin :"+this.jenisKelamin);
        System.out.println("Nomor Induk Dosen :"+this.nomorIndukDosen);
    }
}
class Pegawai extends KRS{
    String nomorIndukPegawai;
    String Pekerjaan;
    Pegawai(String nama ,String alamat,String nomorTelepon,String jenisKelamin,String nomorIndukPegawai,String Pekerjaan){
        super(nama,alamat,nomorTelepon,jenisKelamin);
        this.nomorIndukPegawai=nomorIndukPegawai;
        this.Pekerjaan =Pekerjaan;
    }
    @Override
    void print(){
        System.out.println("Pegawai :");
        System.out.println("Nama :"+this.nama);
        System.out.println("Alamat :"+this.alamat);
        System.out.println("Nomor Telepon :"+this.nomorTelepon);
        System.out.println("Pekerjaan :"+this.Pekerjaan);
        System.out.println("Jenis Kelamin :"+this.jenisKelamin);
        System.out.println("Nomor Induk Pegawai :"+this.nomorIndukPegawai);
    }
}

class Mahasiswa extends KRS{
    String nomorIndukMahasiswa;
    String jurusan;
    Mahasiswa(String nama ,String alamat,String nomorTelepon,String jenisKelamin,String nomorIndukMahasiswa,String jurusan){
        super(nama,alamat,nomorTelepon,jenisKelamin);
        this.nomorIndukMahasiswa=nomorIndukMahasiswa;
        this.jurusan=jurusan;
    }
    @Override
    void print(){
        System.out.println("Mahasisa :");
        System.out.println("Nama :"+this.nama);
        System.out.println("Alamat :"+this.alamat);
        System.out.println("Nomor Telepon :"+this.nomorTelepon);
        System.out.println("Jenis Kelamin :"+this.jenisKelamin);
        System.out.println("Nomor Induk Mahasiswa :"+this.nomorIndukMahasiswa);
        System.out.println("Jurusan :"+this.jurusan);
    }
}
public class Polymorphism {
    public static void main(String[]args){
        Dosen dosen1=new Dosen("asep","malang","1234124","lakilaki","85678567435","40");
        dosen1.print();
        System.out.println();
        Pegawai pegawai1=new Pegawai("budi","malang","1234234124","lakilaki","23412351","CS");
        pegawai1.print();
        System.out.println();
        Mahasiswa mahasiswa1=new Mahasiswa("budi","malang","1234234124","lakilaki","23453245234","Teknik Informatika");
        mahasiswa1.print();
    }
}
