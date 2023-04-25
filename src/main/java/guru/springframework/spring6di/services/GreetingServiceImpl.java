package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service //Because we want manage this controller with Spring Boot
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone From Base Service!!!";
    }
}
