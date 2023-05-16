package guru.springframework.spring6di.controllers.faux;

import guru.springframework.spring6di.services.faux.EnvironmentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(@Qualifier("fauxService") EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String sendDatasource () {
        return "This ia a " + environmentService.getDatasource() + " environment";
    }
}
