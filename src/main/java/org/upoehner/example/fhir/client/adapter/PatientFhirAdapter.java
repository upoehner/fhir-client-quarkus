package org.upoehner.example.fhir.client.adapter;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import org.upoehner.example.fhir.client.service.ClientFactory;
import org.hl7.fhir.r4.model.Patient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

@Path("/patient")
@Produces({MediaType.TEXT_PLAIN})
public class PatientFhirAdapter {

    @ConfigProperty(name = "fhir.server")
    String serverUrl;

    @ConfigProperty(name = "fhir.user")
    Optional<String> user;

    @ConfigProperty(name = "fhir.password")
    Optional<String> password;

    @GET
    @Path("getById/{id}")
    public String getPatientById(@PathParam("id") String id) {
        Patient p = ClientFactory.createClient(serverUrl, user, password).read().resource(Patient.class).withId(id).execute();
        return p.getName().get(0).getGivenAsSingleString();
    }
}
