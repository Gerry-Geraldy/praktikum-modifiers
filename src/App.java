import java.util.Scanner;
import duadimensi.BelahKetupat;
import duadimensi.Lingkaran;
import duadimensi.Persegi;
import duadimensi.PersegiPanjang;
import duadimensi.Segitiga;
import duadimensi.Trapesium;
import tigadimensi.Balok;
import tigadimensi.Kerucut;
import tigadimensi.Kubus;
import tigadimensi.Tabung;
public class App {
    public static void main(String[] args) throws Exception {

        // System.out.println("DUA DIMENSI");
        // System.out.println("LUAS LINGKARAN");
        // Lingkaran rumus1 = new Lingkaran(2.0);
        // System.out.println(rumus1.luas());

        // System.out.println("LUAS PERSEGI");
        // Persegi rumus2 = new Persegi(12.0);
        // System.out.println(rumus2.luas());

        // System.out.println("LUAS PERSEGI PANJANG");
        // PersegiPanjang rumus3 = new PersegiPanjang(4.0 , 2.0);
        // System.out.println(rumus3.luas());

        // System.out.println("LUAS SEGITIGA");
        // Segitiga rumus4 = new Segitiga(4.0 , 2.0);
        // System.out.println(rumus4.luas());

        // System.out.println("LUAS BELAH KETUPAT");
        // BelahKetupat rumus5 = new BelahKetupat(7.0);
        // System.out.println(rumus5.luas());

        // System.out.println("LUAS TRAPESIUM");
        // Trapesium rumus6 = new Trapesium(10.0, 12.0, 7.0);
        // System.out.println(rumus6.luas());

        
        
        // System.out.println("TIGA DIMENSI");
        // System.out.println("VOLUME KERUCUT");
        // Kerucut rumus7 = new Kerucut(2.0, 4.0);
        // System.out.println(rumus7.volume());

        // System.out.println("VOLUME KUBUS");
        // Kubus rumus8 = new Kubus(4.0);
        // System.out.println(rumus8.volume());

        System.out.println("VOLUME BALOK");
        Balok rumus9 = new Balok(2.0, 2.0, 2.0 );
        System.out.println(rumus9.volume());

        System.out.println("VOLUME TABUNG");
        Tabung rumus10 = new Tabung (2.0, 2.0);
        System.out.println(rumus10.volume());

        
    }
}
