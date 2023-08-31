package day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Test01_Assertions { //assert idda etmek demek
    //1
    @Test//bir methodun tesr metodu old belirtir ve Junit tarafindan calistirilabilir hale gelir
    public void test(){
        //test methodlari public olmak zorundadir(Junit4 ve oncesi)
        //Junit5 ile birlikte public yazmak zorunda degiliz
  }


    //2
    @Test
    public void testLength(){
        String str= "Unit test cok kolay";
        int anlikDeger=str.length();//19
        int beklenenDeger=19;
        assertEquals(beklenenDeger,anlikDeger, "length methodu hatali");//3 parametre alabilir.
        //assertEquals methodu aldigi parametrelerin degerlerini karsilastirir
        //eger degerler ayni ise test gecer aksi halde kalir
        //testin basarisiz olmasi durumunda mesaj yazilabilir
    }

    //3 stringi toUpperCase methodunu test edelim
    @Test
    public void testToUpper(){
        String str= "java";
        String anlik=str.toUpperCase();
        String beklenen="JAVA";
        String beklenmeyen="Java";
        //assertEquals(beklenen,anlik);//once beklenen deger sonra anlik deger
        assertNotEquals(beklenmeyen,anlik);//anlik deger beklenmeyenle ayni olmamali. bu sekilde de test gecer
    }

    //4 Math.addExact
    @Test
    public void testAddExact(){
        int sayi1=15;
        int sayi2=5;
        int anlikDeger= Math.addExact(sayi1,sayi2);
        int beklenenDeger=sayi1+sayi2;

        assertEquals(beklenenDeger,anlikDeger);
    }

    //5 String--> contains
    @Test
    public void testContains(){
        assertEquals(false,"JAVA".contains("z"));

    }

    //test yaparken methodlari karisik test etmis
    //herbir test methodu bir birimi test eder. birbirinden bagimsizdir. kendi oncelik sirasine gore calistiryor
    //belli bir sira ile calismasini istersek


}
