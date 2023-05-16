package guru.springframework.spring6di.controllers.faux;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//It will work, because we have "default" profile for "i18NService"
//@ActiveProfiles("EN")
@SpringBootTest
public class EnvironmentControllerTestDefault {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void sendDatasource() {
        System.out.println(environmentController.sendDatasource());
    }

}
