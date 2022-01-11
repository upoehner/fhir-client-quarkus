package org.upoehner.example.fhir.client.adapter;

import org.hl7.fhir.r4.model.Patient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/rest")
@Produces({MediaType.TEXT_PLAIN})
public class SimpleRestAdapter {

    @Inject
    PatientRestFhirClient simpleRestClient;

    @GET
    @Path("getSimple/{id}")
    public String useSimple(@PathParam("id") String id) {
        Patient p = simpleRestClient.getPatientById(id);
        return p.getName().get(0).getGivenAsSingleString();
    }

    @GET
    @Path("getJson/{id}")
    public String getJson(@PathParam("id") String id) {
        return simpleRestClient.getJson(id);
    }

}
