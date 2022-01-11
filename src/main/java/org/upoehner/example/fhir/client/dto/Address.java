
package org.upoehner.example.fhir.client.dto;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "use",
    "line"
})
@Generated("jsonschema2pojo")
public class Address {

    @JsonProperty("use")
    private String use;
    @JsonProperty("line")
    private List<String> line = null;

    @JsonProperty("use")
    public String getUse() {
        return use;
    }

    @JsonProperty("use")
    public void setUse(String use) {
        this.use = use;
    }

    @JsonProperty("line")
    public List<String> getLine() {
        return line;
    }

    @JsonProperty("line")
    public void setLine(List<String> line) {
        this.line = line;
    }

}
