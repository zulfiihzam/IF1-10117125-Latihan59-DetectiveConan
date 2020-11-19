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
public class PemainSupport extends Pemain{
        private String hubungan;

    public PemainSupport(String nama, String peran, String hubungan) {
        super(nama, peran);
        this.hubungan = hubungan;
    }

    public String getHubungan() {
        return hubungan;
    }

    public void tampilPemainSupport() {
        System.out.println("\nNama : " + getNama());
        System.out.println("berperan sebagai : " + getPeran());
        System.out.println("Hubungan dengan Tokoh Utama : " + getHubungan());
    }
    
}
