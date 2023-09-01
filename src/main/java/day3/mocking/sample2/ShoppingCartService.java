package day3.mocking.sample2;

public class ShoppingCartService {
    //3
    private final ProductManager productManager;

    public ShoppingCartService(ProductManager productManager) {
        this.productManager = productManager;
    }

    //bu methodu test edelim
    public boolean addProductToCart(String productId){
        //4
      int stock=  productManager.getStockStatus(productId);//5 , 0
      if (stock>0){
          //urun sepete eklendi
          productManager.decreaseStock(productId);
      return true;
      } else {
          //urun ekleme basarisiz olacak
          return false;
      }
    }


}
