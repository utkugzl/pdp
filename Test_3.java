package odev;
import java.util.UUID;
public class Test_3 {
    private String motorNo;
    private boolean calisiyor;
    /**
    *
    * @param motorNo UUID olarak motor id
    * @return motor instance
    */  
    public void calistir() {
    /**
    * calisiyor true yapılıyor
    */
    calisiyor = true;
    }
    /**
    * Motorun durdurulması //
    */
    public void durdur() {
    calisiyor = false;
    }
    public String getMotorNo() {
    // motor no getir
    return motorNo;
    }
}