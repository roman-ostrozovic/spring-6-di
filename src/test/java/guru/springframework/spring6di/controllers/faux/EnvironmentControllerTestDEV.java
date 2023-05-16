package guru.springframework.spring6di.controllers.faux;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"DEV", "EN"})
@SpringBootTest
public class EnvironmentControllerTestDEV {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void sendDatasource() {
        System.out.println(environmentController.sendDatasource());
    }

}
