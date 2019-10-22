package com.example.cloud;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    //一次初始化一次
    private static User user;
    @BeforeClass
    public static void init(){
        user=new User();
    }
    @Test
    public void addition_isCorrect() {
//        assertEquals(4, 2 + 2);
        System.out.println("Hello World！");
        assertEquals(4, user.add(2,2));
    }

}