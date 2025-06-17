/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBOAanekaPola;

/**
 *
 * @author buyal
 */
public class MainTravel {
    public static void main(String[] args) {
        Travel[] daftarPaket = new Travel[3];
        daftarPaket[0] = new PaketHemat();
        daftarPaket[1] = new PaketLengkap();
        daftarPaket[2] = new PaketInternasional();

        for (Travel paket : daftarPaket) {
            paket.tampilkanPaket();
            System.out.println();
        }
    }
}

