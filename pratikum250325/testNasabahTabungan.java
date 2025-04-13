/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas250325;
//zakiah turrasyidah
/**
 *
 * @author zakiah
 */
public class testNasabahTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // TODO code application logic here
         // Membuat objek Nasabah 1
        nasabah nasabah1 = new nasabah("zakiah", "siddiq");
        tabungan tabungan1 = new tabungan(10000);
        nasabah1.setTabungan(tabungan1);

        // Membuat objek Nasabah 2
        nasabah nasabah2 = new nasabah("siddiq", "zakiah");
        tabungan tabungan2 = new tabungan(8000);
        nasabah2.setTabungan(tabungan2);

        // Menampilkan informasi awal
        System.out.println("Informasi nasabah dan saldo");
        System.out.println("===============================");
        System.out.println(nasabah1);
        System.out.println(nasabah2);
        System.out.println();
        
        System.out.println("Riwayat menabung nasabah");
        // Objek 1 menabung 4000
        tabungan1.simpanUang(4000);
        System.out.println("Setelah zakiah menabung 4000: " + tabungan1.getSaldo());

        // Objek 2 menabung 7000
        tabungan2.simpanUang(7000);
        System.out.println("Setelah siddiq menabung 7000: " + tabungan2.getSaldo());

        System.out.println("\nRiwayat penarikan nasabah");
        // Objek 1 mengambil uang 5000
        tabungan1.ambilUang(5000);
        System.out.println("Setelah zakiah mengambil 5000: " + tabungan1.getSaldo());

        // Objek 2 mengambil uang 6000
        tabungan2.ambilUang(6000);
        System.out.println("Setelah siddiq mengambil 6000: " + tabungan2.getSaldo());

        // Objek 2 transfer ke objek 1 sebesar 1000
        tabungan2.transfer(tabungan1, 1000);
        System.out.println("\nSetelah zakiah transfer 1000 ke Melati:");
        System.out.println("Saldo zakiah : " + tabungan1.getSaldo());
        System.out.println("Saldo siddiq: " + tabungan2.getSaldo());
     
    }
    
    
}
