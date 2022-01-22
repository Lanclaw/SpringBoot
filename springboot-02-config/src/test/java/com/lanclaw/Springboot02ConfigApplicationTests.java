package com.lanclaw;

import com.lanclaw.pojo.Dog;
import com.lanclaw.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot02ConfigApplicationTests {

    @Autowired
    private Person dog;

    @Test
    void contextLoads() {

        System.out.println(dog);

    }

}
