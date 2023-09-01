package day3.mocking.sample1;
//4
public class UserService {

    private final UserManager userManager;

    public UserService(UserManager userManager) {
        this.userManager = userManager;
    }

    //5
    //bu methodu test edelim. bu method icinde baska method  var. getUser ile bagli
    public String getUserById(int userId){
        String user="User " + userManager.getUser(userId);
    return user;
    }
}
