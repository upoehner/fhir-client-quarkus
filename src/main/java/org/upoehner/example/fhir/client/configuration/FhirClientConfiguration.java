package org.upoehner.example.fhir.client.configuration;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.client.interceptor.BasicAuthInterceptor;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;

import static ca.uhn.fhir.context.PerformanceOptionsEnum.DEFERRED_MODEL_SCANNING;

public class FhirClientConfiguration {
    @ConfigProperty(name = "fhir.server")
    String serverUrl;

    @ConfigProperty(name = "fhir.user")
    Optional<String> user;

    @ConfigProperty(name = "fhir.password")
    Optional<String> password;

    @ApplicationScoped
    public IGenericClient createClient() {
        FhirContext context = FhirContext.forR4();
        context.setPerformanceOptions(DEFERRED_MODEL_SCANNING);
        final IGenericClient client = context.newRestfulGenericClient(serverUrl);

        if (user.isPresent() && password.isPresent()) {
            BasicAuthInterceptor basicAuth = new BasicAuthInterceptor(user.get(), password.get());
            client.registerInterceptor(basicAuth);
        }

        return client;
    }
}
