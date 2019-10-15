/*
 * Energy Australia Coding Test API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Band;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * MusicFestival
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-10-15T09:57:52.550Z")
public class MusicFestival   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("bands")
  private List<Band> bands = null;

  public MusicFestival name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @JsonProperty("name")
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MusicFestival bands(List<Band> bands) {
    this.bands = bands;
    return this;
  }

  public MusicFestival addBandsItem(Band bandsItem) {
    if (this.bands == null) {
      this.bands = new ArrayList<Band>();
    }
    this.bands.add(bandsItem);
    return this;
  }

  /**
   * Get bands
   * @return bands
   **/
  @JsonProperty("bands")
  @ApiModelProperty(value = "")
  public List<Band> getBands() {
    return bands;
  }

  public void setBands(List<Band> bands) {
    this.bands = bands;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MusicFestival musicFestival = (MusicFestival) o;
    return Objects.equals(this.name, musicFestival.name) &&
        Objects.equals(this.bands, musicFestival.bands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, bands);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MusicFestival {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bands: ").append(toIndentedString(bands)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

