/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBOAanekaPola;

/**
 *
 * @author buyal
 */
public class PaketInternasional extends Travel {

    public PaketInternasional() {
        super("Paket Internasional");
    }

    @Override
    public void tampilkanPaket() {
        System.out.println("=== " + namaPaket + " ===");
        System.out.println("• Jakarta - Singapore - Malaysia - Thailand");
        System.out.println("• Transportasi: Pesawat + Bus Luar Negeri");
        System.out.println("• Akomodasi: Hotel Bintang 5");
        System.out.println("• Durasi: 7 Hari");
        System.out.println("• Tiket Wisata Internasional");
    }
}
