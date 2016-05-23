package io.swagger.client.model;

import java.util.Objects;

import io.realm.RealmModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class Message  {
  
  @SerializedName("from")
  private String from = null;
  
  @SerializedName("to")
  private String to = null;
  
  @SerializedName("message")
  private String message = null;
  

  
  /**
   * Name of the user who sent the message
   **/
  @ApiModelProperty(value = "Name of the user who sent the message")
  public String getFrom() {
    return from;
  }
  public void setFrom(String from) {
    this.from = from;
  }

  
  /**
   * Name of the user who got the message
   **/
  @ApiModelProperty(value = "Name of the user who got the message")
  public String getTo() {
    return to;
  }
  public void setTo(String to) {
    this.to = to;
  }

  
  /**
   * Message which has been send
   **/
  @ApiModelProperty(value = "Message which has been send")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(from, message.from) &&
        Objects.equals(to, message.to) &&
        Objects.equals(message, message.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
