package guru.springframework.spring6di.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service("fauxService")
public class QualityAssuranceEnvironmentService implements EnvironmentService {

    @Override
    public String getDatasource() {
        return "QA";
    }
}
