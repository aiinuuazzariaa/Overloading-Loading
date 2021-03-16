/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loading;

/**
 *
 * @author MOKLET-2
 */
public class isi extends variabel{
    
    void bio (String nama){
        this.nama = nama;
        System.out.println(nama+"Ainu Azzaria");
    }
    
    void bio (String nama, String kelas){
        this.nama = nama;
        this.kelas = kelas;
        System.out.println(nama+"Ainu Azzaria");
        System.out.println(kelas+"X  RPL 2");
    }
    
    void bio (String nama, String kelas, String kata){
        this.nama = nama;
        this.kelas = kelas;
        this.kata = kata;
        System.out.println(nama+"Ainu Azzaria");
        System.out.println(kelas+"X  RPL 2");
        System.out.println(kata+"Selamat Belajar dan tetap semangat");
    }
}
