package com.xmspace.javastudy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaStudyApplicationTests {

    @Test
    void contextLoads() {
        test1(9);
    }

    private void test1(int a){
        int z;
        a += 1;
        a = 2;
        a = 3;
        System.out.println(a);
        a = 4;
        System.out.println(a);
    }

}
