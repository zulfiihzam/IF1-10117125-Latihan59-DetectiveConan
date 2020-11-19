/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan59.detectiveconan;

/**
 *Nama  : Zulfi Ihzam Rahmat
 *Kelas : IF-1
 *NIM   : 10117125
 *Deskripsi Program : program ini berisi program yang menampilan karakter dari
 *                    serial detective konan
 */
public class IF110117125Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\tKarakter Detective Conan");
          System.out.println("-----------------------------------------"); 
          System.out.println("\n\t>>>> Pemain Utama <<<<");
        
//Pemain Utama          
        PemainUtama conan = new PemainUtama("Conan Edogawa/Shinichi Kudo", 
                "Detektif", "Memecahkan/Menyelesaikan Kasus ", "Detektif Cilik");
        conan.tampilPemainUtama();
        
        PemainUtama ran = new PemainUtama("Ran Mouri", "Ahli Beladiri Karate", 
                "Ingin Menjadi Ahli Karate di Seluruh Jepang", "Siswi SMA dan Suka pada Shinichi Kudo");
        ran.tampilPemainUtama();
        
        PemainUtama kogoro = new PemainUtama("Kogoro Mouri", "Detektif Swasta", 
                "Memecahkan/Menyelesaikan Kasus", "Detektif Swasta");
        kogoro.tampilPemainUtama();
        
        
        
//Pemain Support
          System.out.println("\n\n\t>>>> Pemain Support <<<<");
          
        PemainSupport sonoko = new PemainSupport("Sonoko Suzuki", 
                "Siswi SMA", "Sahabatnya Ran Mouri");
        sonoko.tampilPemainSupport();
          
        PemainSupport eri = new PemainSupport("Eri Kisaki", "Pengacara", 
                "Istri dari Kogoro Mouri dan Ibunya Ran");
        eri.tampilPemainSupport();        
        
        PemainSupport ai = new PemainSupport("Ai Haibara/Shiho Miyano", "Peneliti/Detektif Cilik",
                "Memberikan bantuan kepada Conan dan salah satu Detektif Cilik");
        ai.tampilPemainSupport();
        
        PemainSupport heiji = new PemainSupport("Heiji Hattori", 
                "Detektif SMA", "Temannya Conan Edogawa");
        heiji.tampilPemainSupport();
    
    }
    
}
