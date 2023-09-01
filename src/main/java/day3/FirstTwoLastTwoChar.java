package day3;

public class FirstTwoLastTwoChar {
    // !!! Task : ilk 2 ve son 2 karakteri ayni mi ??  BABA, tek karakter girmisse false
    public boolean checkAreSameFirstTwoLastTwo(String str){

        if (str.length()<=1){
            return false;
        }
        if (str.length()==2){
            return true;
        }
        String firstTwo=str.substring(0,2);
        String lastTwo=str.substring(str.length()-2);

        return firstTwo.equals(lastTwo);
    }

}
