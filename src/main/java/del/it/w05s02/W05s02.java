/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package del.it.w05s02;

import del.it.w05s02.classes1.Mobil;
import del.it.w05s02.classes1.Mesin;
import del.it.w05s02.classes2.Contractor;

/**
 *
 * @author neko
 */
public class W05s02 {
    
    public static void main(String args[]){
        // We create Mesin() object for Arya's Car
        Mesin BMW100 = new Mesin();
        
        BMW100.setKodeMesin("BMW100-981");
        BMW100.setNamaKotaPenerbit("Harmburg");
        BMW100.setNamaMesin("BMW-PW V8 Turbo XL");
        BMW100.setTahunProduksi(2013);
        BMW100.setTahunTerbit(2012);
        BMW100.setTokoPenerbit("BMW Distribution Division GmbH");
        BMW100.setUmur(10);

        // The Mesin then will be inserted to Mobil constructor
        // Now AryaCar which is a Mobil Object have an Mesin object
        // called BMW100
        Mobil AryaCar = new Mobil(
                "Manchester CI-900XG Pedal Suite",
                "BMW MX7 Series 10 2015",
                "Manchester CI-BMW507Li",
                BMW100
        );

        AryaCar.display();

        Contractor contractor = new Contractor("Oppir", 50000000);
        System.out.println(contractor.calculateSalary(3000, 4));
        System.out.println(contractor.getName());
        System.out.println(contractor.getIdConstructor());
        System.out.println(contractor.getIdPekerjaanConstructor());

        /**
         * Answer of TUGAS QUESTIONS
         */

        /**
         * Soal 1.
         * Lakukan lah analisis terhadap program-program diatas dan buat menjadi satu kesatuan
         * program yang sempurna sehingga menghasilkan seperti output pada masing-masing
         * program!
         *
         * Pada program 1 (classes-1) disitu ada 3 kelas, kelas Mobil, Kendaraan dan Mesin.
         * Kelas Mobil merupakan turunan dari kelas Kendaraan dan memiliki objek kelas Mesin
         * didalam atributnya.
         */

        /**
         * Soal 2.
         * Analisis lah kenapa pada program yang kedua menghasilkan 0 dan null, lengkapilah
         * coding-an tersebut sehingga tidak menghasilkan 0 dan null!
         *
         * Karena tidak di set nilai-nilainya, nilai dari IdConstructor dan idPekerjaanConstructor
         * yang mengakibatkan nilainya itu 0 dan null. Constructor didalam class ini di overloading.
         * ada yang Constructor yang pertama yang punya lebih banyak parameter dibadingkan yang kedua
         *
         * Karena pada saat pembuatan/construct objek yang dipakai yang lebih sedikit, sehingga constructor
         * class yang dipakai ialah yang saat lebih sedikit. Yang sedikit ini tidak meng-Set nilai kedua tersebut
         * sehingga nilainya menjadi 0 dan null, nilai
         */
    }
}
