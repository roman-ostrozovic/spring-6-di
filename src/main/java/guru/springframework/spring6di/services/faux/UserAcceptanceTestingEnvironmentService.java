package guru.springframework.spring6di.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service("fauxService")
public class UserAcceptanceTestingEnvironmentService implements EnvironmentService {

    @Override
    public String getDatasource() {
        return "UAT";
    }
}
