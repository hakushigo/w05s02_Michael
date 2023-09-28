package del.it.w05s02.classes2;

/**
 *
 * @author neko
 */
public class Contractor extends Employee{
    int idConstructor;
    String namaConstructor;
    String idPekerjaanConstructor;
    
    public Contractor(int idConstructor, String namaConstructor, String idPekerjaanConstructor, String name, int paymentPerHour){
        super(name, paymentPerHour);
        
        this.idConstructor = idConstructor;
        this.namaConstructor = namaConstructor;
        this.idPekerjaanConstructor = idPekerjaanConstructor;
    }
    
    public Contractor(String name, int paymentPerHour){
        super(name, paymentPerHour);
    }

    public int getIdConstructor() {
        return idConstructor;
    }

    public void setIdConstructor(int idConstructor) {
        this.idConstructor = idConstructor;
    }

    public String getNamaConstructor() {
        return namaConstructor;
    }

    public void setNamaConstructor(String namaConstructor) {
        this.namaConstructor = namaConstructor;
    }

    public String getIdPekerjaanConstructor() {
        return idPekerjaanConstructor;
    }

    public void setIdPekerjaanConstructor(String idPekerjaanConstructor) {
        this.idPekerjaanConstructor = idPekerjaanConstructor;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int calculateSalary(int JumlahSalary, int Hari) {
        return super.calculateSalary(JumlahSalary, Hari);
    }
}
