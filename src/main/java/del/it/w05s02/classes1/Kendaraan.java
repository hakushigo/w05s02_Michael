package del.it.w05s02.classes1;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author neko
 */
public class Kendaraan {
    public String pedal;
    public String namaKendaraan;
    public String stir;
    
    public String getPedal(){
        return this.pedal;
    }
    
    public String getNamaKendaraan(){
        return this.namaKendaraan;
    }
    
    public String getStir(){
        return this.stir;
    }
    
    public void setPedal(String nama){
        this.pedal = nama;
    }

    public void setNamaKendaraan(String nama){
        this.namaKendaraan = nama;
    }

    public void setStir(String nama){
        this.stir = nama;
    }
}
