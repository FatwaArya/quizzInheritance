package com.company;

public class Jobdesk extends Karyawan {
    private String BagianKerja;


    public void setBagianKerja(String bagianKerja) {
        this.BagianKerja = bagianKerja;
    }
    @Override
    public void cetak() {
        super.cetak();
        System.out.println("Bekerja di bagian: " + BagianKerja);
    }
    void Gaji(int gajiUtama) {
        int gajiTinggi =gajiUtama*2;
        System.out.println("Gaji Utama yang didapat: "+gajiUtama);
        System.out.println("Gaji yang didapat jika bekerja secara baik: "+gajiTinggi);
    }
}