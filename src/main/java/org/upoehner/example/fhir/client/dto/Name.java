
package org.upoehner.example.fhir.client.dto;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "use",
    "family",
    "given"
})
@Generated("jsonschema2pojo")
public class Name {

    @JsonProperty("use")
    private String use;
    @JsonProperty("family")
    private String family;
    @JsonProperty("given")
    private List<String> given = null;

    @JsonProperty("use")
    public String getUse() {
        return use;
    }

    @JsonProperty("use")
    public void setUse(String use) {
        this.use = use;
    }

    @JsonProperty("family")
    public String getFamily() {
        return family;
    }

    @JsonProperty("family")
    public void setFamily(String family) {
        this.family = family;
    }

    @JsonProperty("given")
    public List<String> getGiven() {
        return given;
    }

    @JsonProperty("given")
    public void setGiven(List<String> given) {
        this.given = given;
    }

}
