package tutoriales.liferay.servicebuilder.libro.upgrade;

import com.liferay.portal.upgrade.registry.UpgradeStepRegistrator;
import org.osgi.service.component.annotations.Component;
import tutoriales.liferay.servicebuilder.libro.upgrade.v1_0_1.UpgradeLibro;

@Component(immediate = true, service = UpgradeStepRegistrator.class)
public class LibroUpgradeStepRegistrator implements UpgradeStepRegistrator {

    private static final String BUNDLE_SYMBOLIC_NAME = "tutoriales.liferay.servicebuilder.libro.service";

    @Override
    public void register(Registry registry) {
        registry.register(BUNDLE_SYMBOLIC_NAME, "1.0.0", "1.0.1",
                new UpgradeLibro());
    }

}
