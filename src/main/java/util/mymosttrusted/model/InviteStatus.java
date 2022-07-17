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
public class InviteStatus {
  
  @SerializedName("status_name")
  private String statusName = null;
  @SerializedName("total")
  private Integer total = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStatusName() {
    return statusName;
  }
  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteStatus inviteStatus = (InviteStatus) o;
    return (this.statusName == null ? inviteStatus.statusName == null : this.statusName.equals(inviteStatus.statusName)) &&
        (this.total == null ? inviteStatus.total == null : this.total.equals(inviteStatus.total));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.statusName == null ? 0: this.statusName.hashCode());
    result = 31 * result + (this.total == null ? 0: this.total.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteStatus {\n");
    
    sb.append("  statusName: ").append(statusName).append("\n");
    sb.append("  total: ").append(total).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
