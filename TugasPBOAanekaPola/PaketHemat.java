/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBOAanekaPola;

/**
 *
 * @author buyal
 */
public class PaketHemat extends Travel {

    public PaketHemat() {
        super("Paket Hemat");
    }

    @Override
    public void tampilkanPaket() {
        System.out.println("=== " + namaPaket + " ===");
        System.out.println("• Jakarta - Bandung");
        System.out.println("• Transportasi: Bus AC");
        System.out.println("• Akomodasi: Tanpa Hotel");
        System.out.println("• Durasi: 1 Hari");
    }
}

