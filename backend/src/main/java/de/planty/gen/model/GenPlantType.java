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



@JsonTypeName("plantType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-11-16T18:35:52.147312+01:00[Europe/Berlin]")
public class GenPlantType   {
  private @Valid Integer id;
  private @Valid String name;
  private @Valid String description;
  private @Valid Integer minHumidityLevel;

  /**
   * The ID schema used for most database entities.
   * minimum: 0
   **/
  public GenPlantType id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "420", value = "The ID schema used for most database entities.")
  @JsonProperty("id")
 @Min(0)  public Integer getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * A name of an entity
   **/
  public GenPlantType name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Sensor 1", value = "A name of an entity")
  @JsonProperty("name")
 @Size(max=50)  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A description of an entity
   **/
  public GenPlantType description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "The blue ESP32 sensor", value = "A description of an entity")
  @JsonProperty("description")
 @Size(max=50)  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Humidity level reported by a sensor scaled from 0 to 100.
   * minimum: 0
   * maximum: 100
   **/
  public GenPlantType minHumidityLevel(Integer minHumidityLevel) {
    this.minHumidityLevel = minHumidityLevel;
    return this;
  }

  
  @ApiModelProperty(example = "69", value = "Humidity level reported by a sensor scaled from 0 to 100.")
  @JsonProperty("minHumidityLevel")
 @Min(0) @Max(100)  public Integer getMinHumidityLevel() {
    return minHumidityLevel;
  }

  @JsonProperty("minHumidityLevel")
  public void setMinHumidityLevel(Integer minHumidityLevel) {
    this.minHumidityLevel = minHumidityLevel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenPlantType plantType = (GenPlantType) o;
    return Objects.equals(this.id, plantType.id) &&
        Objects.equals(this.name, plantType.name) &&
        Objects.equals(this.description, plantType.description) &&
        Objects.equals(this.minHumidityLevel, plantType.minHumidityLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, minHumidityLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenPlantType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    minHumidityLevel: ").append(toIndentedString(minHumidityLevel)).append("\n");
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

