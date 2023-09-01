package day3.mocking;

import day3.mocking.sample1.UserManager;
import day3.mocking.sample1.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

//6
public class UserServiceTest {
    @Test
    void getUserByIdTest(){
        //8
        UserManager userManager=mock(UserManager.class);
        //buradaki userManager tamamen sahte. sahte olusturdu

        //userManagerin getUser methodu cagrildiginda (when) .. degeri dondur(thenReturn)
        when(userManager.getUser(1)).thenReturn("Jack Sparrow");

        //7
        UserService userService=new UserService(userManager);//buraya gercek userManager vermek istemiyom

        //9 getUserById 1 paramertesi ile test
        String actualUser= userService.getUserById(1);
        assertEquals("User Jack Sparrow",actualUser);

        //11
        //2- return null olmamali
        assertNotNull(actualUser);//user null olmamali testi icin

        //12
        //3- getUser methodunu cagiriyor olmali
        verify(userManager,times(1)).getUser(1);//userManagerin getUseri id1 ile kac kere cagriliyor mu

    }
    //10
    //getUserById methodunun test senaryolarinda
    //1-return user+ isim
    //2- return null olmamali
    //3- getUser methodunu cagiriyor olmali


}
