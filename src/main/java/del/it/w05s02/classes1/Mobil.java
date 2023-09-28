package del.it.w05s02.classes1;

import del.it.w05s02.classes1.Kendaraan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author neko
 */

public class Mobil extends Kendaraan {
    
    /**
     * mobil has a Mesin
     * so we own a thing here
     * 
     */
    public Mesin mesinMobil;
    
    public String pedal;
    public String namaMobil;
    public String stir;
    
    public Mobil(
            String pedal, 
            String nama, 
            String stir,
            Mesin mesinMobil
    ){
        super.setNamaKendaraan(nama);
        super.setPedal(pedal);
        super.setStir(stir);
        
        this.mesinMobil = mesinMobil;
        
        this.pedal = super.getPedal();
        this.namaMobil = super.getNamaKendaraan();
        this.stir = super.getStir();
    }
    
    
    public void display()
    {
        System.out.println(namaMobil + " " + pedal + " " + stir + "\n"
                + "Kode Mesin : " + mesinMobil.getKodeMesin() + "\n"
                        + "Kota Penerbit : "  + mesinMobil.getNamaKotaPenerbit() + "\n"
                                + "Nama Mesin : " + mesinMobil.getNamaMesin() + "\n"
                                        + "tokoPenerbit " + mesinMobil.getTokoPenerbit());
    }
}
