package day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test03_ParameterizedTest {
    //6
    @Test
    void testLength(){
        assertTrue("fevzi".length()>0);
        assertTrue("      ".length()>0);
        assertTrue("Umit".length()>0);
        assertTrue("FARUK".length()>0);
    }
    //bunun yerine buralar boiler plate oldu. 4 defa assertTrue kullandik. bunun yerine bir kere
    //asserrtTrue kullanarak birden fazla parametreyi kullanarak nasil test ederiz
    @ParameterizedTest//testim parametre alicak
    @ValueSource(strings = {"fevzi","    ","Umit","FARUK"})//parametrem buradan gelcek. parametre olarak dizi alir
    void testLength2(String str){

        assertTrue(str.length()>0);
    }

    //7
    @Test
    void testUpperCase(){
        String str1="Merhaba";
        String str2="javA";
        String str3="tEsT";
        assertEquals("MERHABA", str1.toUpperCase());
        assertEquals("JAVA",str2.toUpperCase());
        assertEquals("TEST",str3.toUpperCase());
    }
    //@ParameterizedTest ile nasıl kullanırız..
    @ParameterizedTest
    @CsvSource(value = {"Merhaba, MERHABA", "javA, JAVA","tEsT, TEST"})//virgulle ayrilmis degerler kaynagi. ilk deger methodun parametresi, ikinci deger beklenen
    void  testUpperCase2(String str1,String str2){//anlik deger degisken oldugunda beklenen deger de degisken olur bu nedenle method 2 parametre alir

        assertEquals(str2,str1.toUpperCase());
    }

    //8
    @ParameterizedTest
    @CsvSource(value = {"true, java,a","false,junit,k"})
    void testContains(boolean b,String str1,String str2){

        assertEquals(b,str1.contains(str2));
    }


}
