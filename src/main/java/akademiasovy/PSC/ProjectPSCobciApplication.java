package akademiasovy.PSC;

import akademiasovy.PSC.resources.Locations;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ProjectPSCobciApplication extends Application<ProjectPSCobciConfiguration> {

    public static void main(final String[] args) throws Exception {
        new ProjectPSCobciApplication().run(args);
    }

    @Override
    public String getName() {
        return "ProjectPSCobci";
    }

    @Override
    public void initialize(final Bootstrap<ProjectPSCobciConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final ProjectPSCobciConfiguration configuration,
                    final Environment environment) {

        environment.jersey().register(
                new Locations()
        );

    }

}
