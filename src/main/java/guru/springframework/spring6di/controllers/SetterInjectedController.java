package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//Because we want manage this controller with Spring Boot.
@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    //Because we want manage this controller with Spring Boot. We can utilize this method/setter, therefor @Autowired
    // have to be here and not on the field
    @Qualifier("setterGreetingBean")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
