/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBOAanekaPola;

/**
 *
 * @author buyal
 */
public class PaketLengkap extends Travel {

    public PaketLengkap() {
        super("Paket Lengkap");
    }

    @Override
    public void tampilkanPaket() {
        System.out.println("=== " + namaPaket + " ===");
        System.out.println("• Jakarta - Yogyakarta - Bali");
        System.out.println("• Transportasi: Bus AC + Pesawat");
        System.out.println("• Akomodasi: Hotel Bintang 4");
        System.out.println("• Durasi: 5 Hari");
        System.out.println("• Makanan + Tour Guide");
    }
}

