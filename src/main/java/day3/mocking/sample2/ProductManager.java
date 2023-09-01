package day3.mocking.sample2;

import java.util.Random;

public class ProductManager {

    //1 urunu stok durumu
    public  int getStockStatus(String productId){
        Random random=new Random();
        return random.nextInt(10);
    };
    //2 urunun sepete eklenmesi durumunda urunun stogu azalmali
    public  void decreaseStock(String productId){
        //bu methodun calisip calismadigi service clasindaki methodu test ederken onemli olmadigi
        //icin ozellikle body i bos biraktik

    }

}
