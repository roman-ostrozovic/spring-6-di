package guru.springframework.spring6di.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV","default"})
@Service("fauxService")
public class DevelopmentEnvironmentService implements EnvironmentService {

    @Override
    public String getDatasource() {
        return "DEV";
    }
}
