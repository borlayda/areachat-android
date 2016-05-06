package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class OrderHeader   {
  
  @SerializedName("id")
  private String id = null;
  
  @SerializedName("date")
  private String date = null;
  
  @SerializedName("fullPrice")
  private BigDecimal fullPrice = null;
  

  
  /**
   * Unique identifier representing a specific order.
   **/
  @ApiModelProperty(value = "Unique identifier representing a specific order.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Date and time of the order.
   **/
  @ApiModelProperty(value = "Date and time of the order.")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

  
  /**
   * The full price of the order.
   **/
  @ApiModelProperty(value = "The full price of the order.")
  public BigDecimal getFullPrice() {
    return fullPrice;
  }
  public void setFullPrice(BigDecimal fullPrice) {
    this.fullPrice = fullPrice;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderHeader orderHeader = (OrderHeader) o;
    return Objects.equals(id, orderHeader.id) &&
        Objects.equals(date, orderHeader.date) &&
        Objects.equals(fullPrice, orderHeader.fullPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, fullPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderHeader {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    fullPrice: ").append(toIndentedString(fullPrice)).append("\n");
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
