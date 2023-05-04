import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstExecise {
    @Test(priority = 1)
    void OpenBrowser() {
        System.out.println("Chromedriver");

        }
        @Test(priority = 2)
                void login() {
            System.out.println("user able to login");
        }
        @Test(priority = 3)
        void  SerchProduct(){
            System.out.println("User able to serchProduct");

            }
            @Test(priority = 4)
           void AdvanceSerch() {
            System.out.println("User serch advance product");
            }
            @Test(priority = 5)
            void Logout()  {
            System.out.println("User logout successfully");

            }
            }
















