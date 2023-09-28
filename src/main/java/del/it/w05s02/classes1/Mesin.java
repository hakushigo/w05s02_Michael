/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author neko
 */

package del.it.w05s02.classes1;

public class Mesin {
    int umur;
    int tahunTerbit;
    int tahunProduksi;
    
    String namaMesin;
    String kodeMesin;
    String tokoPenerbit;
    String namaKotaPenerbit;
    
    public int getUmur()
    {
        return umur;
    }
    
    public void setUmur(int umur)
    {
        this.umur = umur;
    }
    
    public int getTahunTerbit()
    {
        return tahunTerbit;
    }
    
    public void setTahunTerbit(int tahunTerbit)
    {
        this.tahunTerbit = tahunTerbit;
    }
    
    public int getTahunProduksi()
    {
        return tahunProduksi;
    }
    
    public void setTahunProduksi(int tahunProduksi)
    {
        this.tahunProduksi = tahunProduksi;
    }
    
    public String getNamaMesin()
    {
        return namaMesin;
    }
    
    public void setNamaMesin(String namaMesin)
    {
        this.namaMesin = namaMesin;
    }
    
    public String getNamaKotaPenerbit()
    {
        return namaKotaPenerbit;
    }
    
    public void setNamaKotaPenerbit(String namaKotaPenerbit)
    {
        this.namaKotaPenerbit = namaKotaPenerbit;
    }
    
    
    public void setTokoPenerbit(String nama){
        this.tokoPenerbit = nama;
    }

    public String getTokoPenerbit(){
        return tokoPenerbit;
    }
    
    public void setKodeMesin(String nama){
        this.kodeMesin = nama;
    }

    public String getKodeMesin(){
        return kodeMesin;
    }
}
