
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
        System.out.println( this.alamat);
        System.out.println(this.nomorTelepon);
        System.out.println(this.jenisKelamin);
    }
    
}
class Dosen extends KRS{
    String nomorIndukDosen;
    Dosen(String nama ,String alamat,String nomorTelepon,String jenisKelamin,String nomorIndukDosen){
        super(nama,alamat,nomorTelepon,jenisKelamin);
        this.nomorIndukDosen=nomorIndukDosen;
    }
    
    @Override
    void print(){
        System.out.println("Merupakan Dosen");
        System.out.println(this.nama);
        System.out.println( this.alamat);
        System.out.println(this.nomorTelepon);
        System.out.println(this.jenisKelamin);
        System.out.println(this.nomorIndukDosen);
    }
}
class Pegawai extends KRS{
    String nomorIndukPegawai;
    Pegawai(String nama ,String alamat,String nomorTelepon,String jenisKelamin,String nomorIndukPegawai){
        super(nama,alamat,nomorTelepon,jenisKelamin);
        this.nomorIndukPegawai=nomorIndukPegawai;
    }
    @Override
    void print(){
        System.out.println("Merupakan Pegawai");
        System.out.println(this.nama);
        System.out.println( this.alamat);
        System.out.println(this.nomorTelepon);
        System.out.println(this.jenisKelamin);
        System.out.println(this.nomorIndukPegawai);
    }
}

class Mahasiswa extends KRS{
    String nomorIndukMahasiswa;
    Mahasiswa(String nama ,String alamat,String nomorTelepon,String jenisKelamin,String nomorIndukMahasiswa){
        super(nama,alamat,nomorTelepon,jenisKelamin);
        this.nomorIndukMahasiswa=nomorIndukMahasiswa;
        
    }
    @Override
    void print(){
        System.out.println("Merupakan Mahasisa");
        System.out.println(this.nama);
        System.out.println( this.alamat);
        System.out.println(this.nomorTelepon);
        System.out.println(this.jenisKelamin);
        System.out.println(this.nomorIndukMahasiswa);
    }
}
public class main {
    public static void main(String[]args){
        KRS mahasiswa1=new KRS("joko","malang","01930912","lakilaki");
        mahasiswa1.print();
        Dosen dosen1=new Dosen("asep","malang","1234124","lakilaki","12314781624");
        dosen1.print();
        Pegawai pegawai1=new Pegawai("budi","malang","1234234124","lakilaki","1231471381624");
        pegawai1.print();
        Mahasiswa mahasiswa12=new Mahasiswa("budi","malang","1234234124","lakilaki","1231471381624");
        mahasiswa12.print();
    }
}
