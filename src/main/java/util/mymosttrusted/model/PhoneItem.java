/**
 * MMT reports API
 * MMT reports API documentation.
 *
 * Do not edit the class manually.
 */

package util.mymosttrusted.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class PhoneItem {
  
  @SerializedName("phone_type")
  private String phoneType = null;
  @SerializedName("phone_number")
  private String phoneNumber = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPhoneType() {
    return phoneType;
  }
  public void setPhoneType(String phoneType) {
    this.phoneType = phoneType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneItem phoneItem = (PhoneItem) o;
    return (this.phoneType == null ? phoneItem.phoneType == null : this.phoneType.equals(phoneItem.phoneType)) &&
        (this.phoneNumber == null ? phoneItem.phoneNumber == null : this.phoneNumber.equals(phoneItem.phoneNumber));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.phoneType == null ? 0: this.phoneType.hashCode());
    result = 31 * result + (this.phoneNumber == null ? 0: this.phoneNumber.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneItem {\n");
    
    sb.append("  phoneType: ").append(phoneType).append("\n");
    sb.append("  phoneNumber: ").append(phoneNumber).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
