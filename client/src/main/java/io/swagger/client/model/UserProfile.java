package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class UserProfile   {
  
  @SerializedName("id")
  private String id = null;
  
  @SerializedName("name")
  private String name = null;
  
  @SerializedName("cardNumber")
  private String cardNumber = null;
  
  @SerializedName("passwordHash")
  private String passwordHash = null;
  
  @SerializedName("currentBalance")
  private BigDecimal currentBalance = null;
  

  
  /**
   * Unique identifier representing a specific user.
   **/
  @ApiModelProperty(value = "Unique identifier representing a specific user.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Name of the user.
   **/
  @ApiModelProperty(value = "Name of the user.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Card number of the user.
   **/
  @ApiModelProperty(value = "Card number of the user.")
  public String getCardNumber() {
    return cardNumber;
  }
  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  
  /**
   * MD5 hash of the user's password.
   **/
  @ApiModelProperty(value = "MD5 hash of the user's password.")
  public String getPasswordHash() {
    return passwordHash;
  }
  public void setPasswordHash(String passwordHash) {
    this.passwordHash = passwordHash;
  }

  
  /**
   * The user's current balance of points.
   **/
  @ApiModelProperty(value = "The user's current balance of points.")
  public BigDecimal getCurrentBalance() {
    return currentBalance;
  }
  public void setCurrentBalance(BigDecimal currentBalance) {
    this.currentBalance = currentBalance;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfile userProfile = (UserProfile) o;
    return Objects.equals(id, userProfile.id) &&
        Objects.equals(name, userProfile.name) &&
        Objects.equals(cardNumber, userProfile.cardNumber) &&
        Objects.equals(passwordHash, userProfile.passwordHash) &&
        Objects.equals(currentBalance, userProfile.currentBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, cardNumber, passwordHash, currentBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfile {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    passwordHash: ").append(toIndentedString(passwordHash)).append("\n");
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
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
