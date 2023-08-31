package day1;

import org.junit.jupiter.api.*;



//9
public class Test04_BeforeAfterAll {
    @BeforeAll//before ve after all methodlari static olmak zorunda. cunku objeye ihtiyac duymadan static olarak cagrilmasi gerekiyor
    static void openFile(){

        System.out.println("open a file");
    }

    @AfterAll
    static void closeFile(){

        System.out.println("close a file");
    }

    @Test
    void testSplitWithArrays(TestInfo info){
        String str="Junit ile calismak harika";
        String[] anlik=str.split(" ");
        String[] beklenen= {"Junit","ile","calismak","harika"};
        System.out.println(info.getDisplayName()+" çalıştı.");
        Assertions.assertArrayEquals(beklenen,anlik);
    }

    @Test
    void testSplitWithArrays2(TestInfo info){
        String str="Junit ile calismak harika";
        String[] anlik=str.split(" ");
        String[] beklenen= {"Junit","ile","calismak","harika"};
        System.out.println(info.getDisplayName()+" çalıştı.");
        Assertions.assertArrayEquals(beklenen,anlik);
    }
}
