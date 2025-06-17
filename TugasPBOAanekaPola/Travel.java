/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBOAanekaPola;

/**
 *
 * @author buyal
 */
public abstract class Travel {
    protected String namaPaket;

    public Travel(String namaPaket) {
        this.namaPaket = namaPaket;
    }

    public abstract void tampilkanPaket();
}

