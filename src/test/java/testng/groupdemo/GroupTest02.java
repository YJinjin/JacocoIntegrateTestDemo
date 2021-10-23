package testng.groupdemo;


import org.testng.annotations.Test;

@Test(groups = "group01")
public class GroupTest02 {

    @Test(groups = "group02")
    public void test01(){
        System.out.println("test01");
    }


    public void test02(){
        System.out.println("test02");
    }
}
