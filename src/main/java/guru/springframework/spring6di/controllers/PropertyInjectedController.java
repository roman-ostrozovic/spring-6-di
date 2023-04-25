package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller //Because we want manage this controller with Spring Boot
public class PropertyInjectedController {

        GreetingService greetingService;

        public String sayHello(){
            return greetingService.sayGreeting();
        }
}
