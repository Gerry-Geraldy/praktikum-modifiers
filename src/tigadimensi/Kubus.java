package tigadimensi;
import duadimensi.Persegi;

public class Kubus extends Persegi{
    
   public Kubus(Double sisi){
        super(sisi);
        
    }

   public Double volume(){
        return super.luas() * lebar;
    }
}
