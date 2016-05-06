package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class Person   {
  
  @SerializedName("name")
  private String name = null;
  
  @SerializedName("longitude")
  private Integer longitude = null;
  
  @SerializedName("latitude")
  private Integer latitude = null;
  

  
  /**
   * The name of the person
   **/
  @ApiModelProperty(value = "The name of the person")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Longitude of the current position
   **/
  @ApiModelProperty(value = "Longitude of the current position")
  public Integer getLongitude() {
    return longitude;
  }
  public void setLongitude(Integer longitude) {
    this.longitude = longitude;
  }

  
  /**
   * Latitude of the current position
   **/
  @ApiModelProperty(value = "Latitude of the current position")
  public Integer getLatitude() {
    return latitude;
  }
  public void setLatitude(Integer latitude) {
    this.latitude = latitude;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(name, person.name) &&
        Objects.equals(longitude, person.longitude) &&
        Objects.equals(latitude, person.latitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, longitude, latitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
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
