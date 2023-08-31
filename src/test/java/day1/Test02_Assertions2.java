package day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Test02_Assertions2 {

    //6
    //test edecegimiz method boolean donduruyorsa
    //List --< contains
    @Test
    public void testListContains(){
        List<Integer> list= Arrays.asList(1,2,3,4);
       // assertEquals(true,list.contains(2));
        assertTrue(list.contains(2));
        assertFalse(list.contains(5));
    }

    //7 stringin split methodu
    @Test
    public void testSplit(){
        String str="Infinity is bigger than you think!";
        String[] anlikDizi=str.split(" ");//{Infinity,is,bigger,than,you,think!}
        String[] beklenenDizi={"Infinity","is","bigger","than","you","think!"};
        //assertEquals(beklenenDizi,anlikDizi); bu calismaz
        assertTrue(Arrays.equals(beklenenDizi,anlikDizi));

    }

}
