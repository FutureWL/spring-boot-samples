package io.github.futurewl;

import org.junit.*;

public class TestCase {

    @BeforeClass
    public static void beforeClassTest() {
        System.out.println("单元测试开始之前执行初始化……");
        System.out.println("------------------------");
    }

    @Before
    public void beforeTest() {
        System.out.println("单元测试方法开始之前执行");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @After
    public void afterTest() {
        System.out.println("单元测试方法开始之后执行");
    }

    @AfterClass
    public static void afterClassTest() {
        System.out.println("单元测试开始之后执行初始化……");
        System.out.println("------------------------");
    }


}
