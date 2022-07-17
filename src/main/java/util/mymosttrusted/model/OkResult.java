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
public class OkResult {
  
  @SerializedName("code")
  private Integer code = null;
  @SerializedName("message")
  private String message = null;

  /**
   * 200 represents success, all else unsuccessful
   **/
  @ApiModelProperty(value = "200 represents success, all else unsuccessful")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * The message that comes about the status of the configuration update
   **/
  @ApiModelProperty(value = "The message that comes about the status of the configuration update")
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
    OkResult okResult = (OkResult) o;
    return (this.code == null ? okResult.code == null : this.code.equals(okResult.code)) &&
        (this.message == null ? okResult.message == null : this.message.equals(okResult.message));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OkResult {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
