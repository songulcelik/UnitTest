package day3.mocking;

import day3.mocking.sample2.ProductManager;
import day3.mocking.sample2.ShoppingCartService;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class ShoppingCartServiceTest {
    @Test
    void addProductToCartTest(){

        ProductManager productManager=mock(ProductManager.class);
        when(productManager.getStockStatus("ABC123")).thenReturn(5);

        ShoppingCartService cartService=new ShoppingCartService(productManager);
        boolean result= cartService.addProductToCart("ABC123");//expected:true
        assertTrue(result);

//        verify(productManager).getStockStatus("ABC123");
//        verify(productManager).decreaseStock("ABC123");
        //verifyda siraya bakmazsizin bu methodlar cagrildi mi buna bakiyor

       //bunlar sirali calismasi icn
        InOrder inOrder=inOrder(productManager);
        inOrder.verify(productManager).getStockStatus("ABC123");
        inOrder.verify(productManager).decreaseStock("ABC123");
        //bu sekilde test gecti

//        inOrder.verify(productManager).decreaseStock("ABC123");
//        inOrder.verify(productManager).getStockStatus("ABC123");
        //bu sekilde test gecmez


    }

    @Test
    void addProductToCartTestForNotEnoughStock(){

        ProductManager productManager=mock(ProductManager.class);
       // when(productManager.getStockStatus("ABC123")).thenReturn(5);
        when(productManager.getStockStatus("ABC124")).thenReturn(0);

        ShoppingCartService cartService=new ShoppingCartService(productManager);
        boolean result= cartService.addProductToCart("ABC124");//expected:false
        assertFalse(result);

        verify(productManager).getStockStatus("ABC124");//bunu bir kere cagiracak
       // verify(productManager).decreaseStock("ABC124");//bundan dolayi hata aldi kapattik


    }



}
