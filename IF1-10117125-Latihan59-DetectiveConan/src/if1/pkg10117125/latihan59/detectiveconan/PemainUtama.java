/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan59.detectiveconan;

/**
 *
 * @author Zulfi
 */
public class PemainUtama extends Pemain{
     private String tujuan;
    private String tim;

    public PemainUtama(String nama, String peran, String tujuan, String tim) {
        super(nama, peran);
        this.tujuan = tujuan;
        this.tim = tim;
    }

    public String getTujuan() {
        return tujuan;
    }

    public String getTim() {
        return tim;
    }

    public void tampilPemainUtama() {
        System.out.println("\nNama Pemain : " + getNama());
        System.out.println("Peran : " + getPeran());
        System.out.println("Tim : " + getTim());
        System.out.println("Tujuan : " + getTujuan());
    }
    
}
