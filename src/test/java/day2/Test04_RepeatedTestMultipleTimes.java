package day2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test04_RepeatedTestMultipleTimes {
    //testi tekrar tekrar yapmak istersek

    //9
    @RepeatedTest(5)//vermis oldgmuz deger kadar testi calistirir
    void testSubstring(){
        String str="Java is an OOP Language";
        assertEquals("Java",str.substring(0,4));
        System.out.println("test calisti");
    }
    //10
    @RepeatedTest(3)
    @Disabled//pasif hale getir. classtaki tum testleri calistirdigimda bu test calismaz
    void testAddExact(){
        assertEquals(5,Math.addExact(2,3));
        System.out.println("test2 calisti");
    }


    //repeates testler daha cok random bir deger ile test edilirken kullanilir
    //11
    Random random=new Random();
    @RepeatedTest(5)
    void testAddExactRandom(){
        int sayi1= random.nextInt(10);
        int sayi2=random.nextInt(10);
        assertEquals(sayi1+sayi2,Math.addExact(sayi1,sayi2));
        System.out.println("addExact icin random test calisti");
        System.out.println("sayi1 = " + sayi1+ "sayi2 = " + sayi2);

    }


}
