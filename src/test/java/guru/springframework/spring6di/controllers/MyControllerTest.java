package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;

public class MyControllerTest {

    @Test
    void sayHello() {
        MyController myController = new MyController();

        System.out.println(myController.sayHello());


    }
}
