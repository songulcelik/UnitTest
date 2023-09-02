package day3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
//1
public class StringModifyTest {
    //1
    StringModify object= new StringModify();
    @ParameterizedTest
    @CsvSource (value = {"BC, ABC", "B,AB", "BABCD,ABABCD" , "'',AA", "BCD,BACD"})
        void deleteIfAIsInYwoPositionTest(String expected, String param){
            assertEquals(expected,object.deleteIfAIsInTwoPosition(param));
        }

}
