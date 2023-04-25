package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServicePrimary implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello Everyone From Primary Service!!!";
    }
}
