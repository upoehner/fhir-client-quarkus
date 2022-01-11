
package org.upoehner.example.fhir.client.dto;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "coding"
})
@Generated("jsonschema2pojo")
public class Type {

    @JsonProperty("coding")
    private List<Coding> coding = null;

    @JsonProperty("coding")
    public List<Coding> getCoding() {
        return coding;
    }

    @JsonProperty("coding")
    public void setCoding(List<Coding> coding) {
        this.coding = coding;
    }

}
