/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119032.latihan50.energikinetik;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk menghitung energi kinetik
 * dengan pendekatan berorientasi objek
 */
public class IF110119032Latihan50EnergiKinetik {
    public static void main(String[] args) {
        EnergiKinetik objEK = new EnergiKinetik(145, 25);
        System.out.println("===Menghitung Energi Kinetik===");
        System.out.printf("Massa : %.3f Kg\n", objEK.getMassa());
        System.out.printf("Kecepatan : %.0f m/s\n", objEK.getKecepatan() );
        System.out.printf("Energi Kinetik : %.4f J\n", objEK.hitungEnergiKinetik());
        System.out.printf("Usaha : %.4f J\n", objEK.hitungUsaha(0));
    }
}
