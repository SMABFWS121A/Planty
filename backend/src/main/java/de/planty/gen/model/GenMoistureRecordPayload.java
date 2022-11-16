package de.planty.gen.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("moistureRecordPayload")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-11-16T18:35:52.147312+01:00[Europe/Berlin]")
public class GenMoistureRecordPayload   {
  private @Valid Integer humidityLevel;

  /**
   * Humidity level reported by a sensor scaled from 0 to 100.
   * minimum: 0
   * maximum: 100
   **/
  public GenMoistureRecordPayload humidityLevel(Integer humidityLevel) {
    this.humidityLevel = humidityLevel;
    return this;
  }

  
  @ApiModelProperty(example = "69", value = "Humidity level reported by a sensor scaled from 0 to 100.")
  @JsonProperty("humidityLevel")
 @Min(0) @Max(100)  public Integer getHumidityLevel() {
    return humidityLevel;
  }

  @JsonProperty("humidityLevel")
  public void setHumidityLevel(Integer humidityLevel) {
    this.humidityLevel = humidityLevel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenMoistureRecordPayload moistureRecordPayload = (GenMoistureRecordPayload) o;
    return Objects.equals(this.humidityLevel, moistureRecordPayload.humidityLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(humidityLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenMoistureRecordPayload {\n");
    
    sb.append("    humidityLevel: ").append(toIndentedString(humidityLevel)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

