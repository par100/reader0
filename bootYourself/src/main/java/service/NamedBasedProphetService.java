package service;

import com.example.bootyourself.ProfileConstants;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
@Profile(ProfileConstants.ЗИМА_БЛИЗКО)
public class NamedBasedProphetService implements ProphetService {

    @Override
    public boolean willSurvive(String name) {
        return !name.contains("Stark") && ThreadLocalRandom.current().nextBoolean();
    }
}
