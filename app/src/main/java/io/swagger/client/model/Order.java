package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.OrderBody;
import io.swagger.client.model.OrderHeader;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class Order   {
  
  @SerializedName("header")
  private OrderHeader header = null;
  
  @SerializedName("body")
  private OrderBody body = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public OrderHeader getHeader() {
    return header;
  }
  public void setHeader(OrderHeader header) {
    this.header = header;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public OrderBody getBody() {
    return body;
  }
  public void setBody(OrderBody body) {
    this.body = body;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(header, order.header) &&
        Objects.equals(body, order.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
