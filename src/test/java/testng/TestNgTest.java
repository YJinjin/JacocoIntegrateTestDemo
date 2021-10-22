package testng;

import org.testng.annotations.*;

public class TestNgTest {

    @BeforeTest
    public void beforeTest() {
        System.out.println("in beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("in afterTest");
    }

    @Test//标记在要执行的测试方法上面
    public void main(){
        System.out.println("测试test 注解");
    }

    @BeforeMethod //在所有的测试方法之前都会运行的
    public void beforeMethod(){
        System.out.println("beforeMethod");
    }
    @BeforeMethod
    public void beforeMethod02(){
        System.out.println("beforeMethod02");
    }

    @AfterMethod//在所有的测试方法之后都会运行的
    public void aftermethod(){
        System.out.println("aftermethod");
    }
    @AfterMethod
    public void aftermethod02(){
        System.out.println("aftermethod02");
    }
    @BeforeClass // 在类运行之前会执行的方法
    public void beforeClass() {
        System.out.println("in beforeClass");
    }

    @AfterClass // 在类运行之后会执行的方法
    public void afterClass() {
        System.out.println("in afterClass");
    }




}
