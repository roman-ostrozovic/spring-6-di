package guru.springframework.spring6di.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PROD")
@Service("fauxService")
public class ProductionEnvironmentService implements EnvironmentService {

    @Override
    public String getDatasource() {
        return "PROD";
    }
}
