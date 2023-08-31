package day1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
//testlerin calisma sirasini kendimiz belirlemek istersek @TestMethodOrder
//classlevelde kullanilir
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Test03_BeforeAfterEach {
    //8
    //bu classta test edecegimiz tum methodlarda String objesine ihtiyacim var
    String str;
    @BeforeEach//herbir testten once calistirir
    void beforeEach(){
        str="Junit ile calismak harika";
        System.out.println("-------beforeEach calisti----------");
    }

    @AfterEach//herbir testten sonra calistirir
    void afterEach(){
        str=null;
        System.out.println("-------afterEach calisti----------");
    }

    @Test
    @Order(2)
    void testSplit(TestInfo info){
       String[] anlik= str.split(" ");
       String[] beklenen={"Junit","ile","calismak","harika"};
        System.out.println(info.getDisplayName()+ " calisti");//info ile gelen objenin ismini yazdirir
       assertArrayEquals(beklenen,anlik);
    }

    @Test
    @Order(1)
    void testLength(TestInfo info){
        System.out.println(info.getDisplayName()+ " calisti");
        assertEquals(25,str.length());
    }







}
