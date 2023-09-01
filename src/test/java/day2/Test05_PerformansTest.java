package day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Test05_PerformansTest {

    //methodlarin performansini da test edebiliriz
    //taskin cozumu icin yazilan kodun max 2 sn icinde sonuc donmesini aksi halde durdurulmasini isteyebiliriz
    //12
    @Test
    void  testPrintPerformance(){
        //1-500000 olan sayilari yazdirma
        assertTimeout(Duration.ofMillis(5),()->{
            IntStream.rangeClosed(1,50000).forEach(System.out::println);
        });
    }


    //13
    @Test
    void testPerformance(){
        assertTimeout(Duration.ofMillis(30),()->{
            IntStream.rangeClosed(1,50000).reduce((x,y)->Math.addExact(x,y));
        });
    }
}
