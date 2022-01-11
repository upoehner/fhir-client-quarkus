package org.upoehner.example.fhir.client.adapter;


import org.upoehner.example.fhir.client.dto.Name;
import org.upoehner.example.fhir.client.dto.Patient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.stream.Collectors;

@Path("/rest")
@Produces({MediaType.TEXT_PLAIN})
public class SimpleRestAdapter {

    @Inject
    PatientRestFhirClient simpleRestClient;

    @GET
    @Path("getSimple/{id}")
    public String useSimple(@PathParam("id") String id) {
        Patient p = simpleRestClient.getPatientById(id);
        String retval = "Found Patient: ";
        if (p.getName() != null && !p.getName().isEmpty()) {
            for (Name n : p.getName()) {
                retval += n.getGiven().stream().map(Object::toString).collect(Collectors.joining(", "));
                retval += " " + n.getFamily();
            }
        }

        return retval;
    }

    @GET
    @Path("getJson/{id}")
    public String getJson(@PathParam("id") String id) {
        return simpleRestClient.getJson(id);
    }

}
