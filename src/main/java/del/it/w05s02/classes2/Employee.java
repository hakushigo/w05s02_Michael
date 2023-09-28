package del.it.w05s02.classes2;

/**
 *
 * @author neko
 */
public class Employee {
    private String name;
    private int paymentPerHour;
    
    public Employee(String name, int PaymentPerHour){
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }
    
    public int calculateSalary(int JumlahSalary, int Hari){
        int hasil;
        hasil = JumlahSalary * Hari;
        
        return hasil;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getPaymentPerHour(){
        return paymentPerHour;
    }
    
    public void setPaymentPerHour(int paymentPerHour){
        this.paymentPerHour = paymentPerHour;
    }
}