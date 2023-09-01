package day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test01_TestingExceptions {
    //sadece dogru sonuclar icin degil hatali durumlar icin de test senaryolari yazilmalidir
    //bazen hatali durumlarda exception firlatmasini isteriz

    //1
    @Test
    void testException(){
        String str=null;
        //str.length(); NullPointerException?
        assertThrows(NullPointerException.class,()->{
            str.length();});//Executable interfacesi fanksinil interface.
                                                                                // icinde bir tane method var sadece. bu nedenle ()-> ile implement et diyoruz

    }

    //2
    @Test
    void testException2(){
        int sayi1=6;
        int sayi2=0;
        int bolum=sayi1/sayi2;
       // System.out.println(sayi1 / sayi2);//ArithmeticException firlatmali

        assertThrows(ArithmeticException.class,()->{
            System.out.println(bolum);});

    }

    //3 bu methodu test etmek icin
    private int divide(int x, int y){
        //1- bolme islemi:6/3
        //2- Aritmetic exc firlatmali 6/0
        //3- 6/3!=4
        return x/y;
    }
    //4
    @Test
    void testException3(){
        int sayi1=6;
        int sayi2=0;
        // System.out.println(sayi1 / sayi2);//ArithmeticException firlatmali

        assertEquals(2,divide(6,3));
        assertThrows(ArithmeticException.class,()->{
           divide(sayi1,sayi2);
        });
    }

}
