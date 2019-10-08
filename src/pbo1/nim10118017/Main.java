package pbo1.nim10118017;

import java.util.Scanner;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Menampilkan hasil perhitungan lingkaran.
 * 
 */
public class Main {
    //Konstanta
    public static final String FOOTER = "\n(Developed by : Agung Nurhamidan)";
    
    //Variabel global
    public static double diameter;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("======Perhitungan Lingkaran======");
        inputDiameter();
        tampilkanHasilPerhitunganLingkaran(diameter);
        
        System.out.println(FOOTER);
    }
    
    public static void inputDiameter() {
        //Proses validasi inputan.
        boolean valid = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan nilai diameter lingkaran : ");
            if (scanner.hasNextDouble()) {
                valid = true;
                diameter = scanner.nextDouble();
            } else {
                System.out.println("Nilai Diameter Tidak Sesuai\n");
            }
        } while (!valid);
    }
    
    public static void tampilkanHasilPerhitunganLingkaran(double diameterLingkaran) {
        //Variabel lokal
        double jariJari;
        double luas;
        double keliling;
        
        //Menghitung lingkaran.
        jariJari = diameterLingkaran / 2;
        luas = Math.PI * (jariJari * jariJari);
        keliling = 2 * (Math.PI * jariJari);
        
        //Menampilkan hasil.
        System.out.println("\n======Hasil Perhitungan Lingkaran======");
        System.out.printf("Jari-jari Lingkaran = %.2f cm%n", jariJari);
        System.out.printf("Luas Lingkaran = %.2f cm%n", luas);
        System.out.printf("Keliling Lingkaran = %.2f cm%n", keliling);
    }
    
}
