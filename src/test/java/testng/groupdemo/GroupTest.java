package testng.groupdemo;

import org.testng.annotations.Test;

public class GroupTest {

    @Test(groups = "group01")
    public void test01(){
        System.out.println("test01");
    }

    @Test(groups = "group01")
    public void test02(){
        System.out.println("test02");
    }

    @Test(groups = "group02")
    public void test03(){
        System.out.println("test03");
    }

    @Test(groups = "group02")
    public void test04(){
        System.out.println("test04");
    }
}
