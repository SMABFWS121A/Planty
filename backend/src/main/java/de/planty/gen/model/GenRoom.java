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



@JsonTypeName("room")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-11-16T18:35:52.147312+01:00[Europe/Berlin]")
public class GenRoom   {
  private @Valid Integer id;
  private @Valid String name;
  private @Valid String description;

  /**
   * The ID schema used for most database entities.
   * minimum: 0
   **/
  public GenRoom id(Integer id) {
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
  public GenRoom name(String name) {
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
  public GenRoom description(String description) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenRoom room = (GenRoom) o;
    return Objects.equals(this.id, room.id) &&
        Objects.equals(this.name, room.name) &&
        Objects.equals(this.description, room.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenRoom {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

