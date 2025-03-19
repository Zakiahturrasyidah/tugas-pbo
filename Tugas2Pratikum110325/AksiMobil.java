/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2Pratikum110325;

/**
 *
 * @author USER
 */
public class AksiMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil mobilku = new Mobil();
        Mobil mobilkudua = new Mobil();
        mobilku.merek="Toyota";
        mobilku.plat="BA 1234 L";
        mobilku.tahun="2004";
        mobilku.warna="hitam";
        System.out.println("-----");
        System.out.println("data mobil 1");
        System.out.println("merk mobil = "+mobilku.merek);
        System.out.println("plat mobil = "+mobilku.plat);
        System.out.println("tahun keluaran = "+mobilku.tahun);
        System.out.println("warna = "+mobilku.warna);
        
        mobilkudua.merek="Toyota";
        mobilkudua.plat="BA 1234 L";
        mobilkudua.tahun="2004";
        mobilkudua.warna="hitam";
        System.out.println("-----");
        System.out.println("data mobil 1");
        System.out.println("merk mobil = "+mobilkudua.merek);
        System.out.println("plat mobil = "+mobilkudua.plat);
        System.out.println("tahun keluaran = "+mobilkudua.tahun);
        System.out.println("warna = "+mobilkudua.warna);
        
        mobilku.MobilAktif();
        System.out.println(mobilku.SuaraMobil());
    }        
}
