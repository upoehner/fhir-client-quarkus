package org.upoehner.example.fhir.client.configuration;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.ext.ClientHeadersFactory;
import org.jboss.resteasy.specimpl.MultivaluedMapImpl;

import javax.ws.rs.core.MultivaluedMap;
import java.util.Base64;
import java.util.Optional;

public class FhirHeaderConfiguration implements ClientHeadersFactory {

    @ConfigProperty(name = "adapter.fhir.user")
    Optional<String> user;

    @ConfigProperty(name = "adapter.fhir.password")
    Optional<String> password;

    @Override
    public MultivaluedMap<String, String> update(MultivaluedMap<String, String> multivaluedMap, MultivaluedMap<String, String> multivaluedMap1) {
        final MultivaluedMap<String, String> result = new MultivaluedMapImpl<>();

        //add Content-Type and accept header: application/fhir+json
        //result.add("Accept", "application/fhir+json");
        //result.add("Content-Type", "application/fhir+json");


        if (user.isPresent() && password.isPresent()) {
            result.add("Authorization", "Basic " + Base64.getEncoder().encodeToString(
                    (new String(Base64.getDecoder().decode(user.get())) + ":" + new String(Base64.getDecoder().decode(password.get()))).getBytes()));
        }

        return result;
    }
}
