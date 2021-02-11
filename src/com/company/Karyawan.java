package com.company;

public class Karyawan {
    private String nama;
    private String Kelamin;
private int nomorPegawai;

    public void setnama(String nama){
        this.nama=nama;
    }
    public void setKelamin(String Kelamin) {
        this.Kelamin = Kelamin;
    }

    public void setNomorPegawai(int nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
    }

    public void cetak(){
        System.out.println("Berikut Identitas Pegawai: ");
        System.out.println("Nama: "+this.nama);
        System.out.println("Jenis Kelamin(L/P): "+ this.Kelamin);
        System.out.println("Nomor Pegawai: "+this.nomorPegawai);
    }
}
