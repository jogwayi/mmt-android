/**
 * MMT reports API
 * MMT reports API documentation.
 *
 * Do not edit the class manually.
 */

package util.mymosttrusted.model;

import java.util.*;
import util.mymosttrusted.model.InviteStatus;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class UserStatsResultInvites {
  
  @SerializedName("status")
  private List<InviteStatus> status = null;
  @SerializedName("total")
  private Integer total = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<InviteStatus> getStatus() {
    return status;
  }
  public void setStatus(List<InviteStatus> status) {
    this.status = status;
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
    UserStatsResultInvites userStatsResultInvites = (UserStatsResultInvites) o;
    return (this.status == null ? userStatsResultInvites.status == null : this.status.equals(userStatsResultInvites.status)) &&
        (this.total == null ? userStatsResultInvites.total == null : this.total.equals(userStatsResultInvites.total));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.total == null ? 0: this.total.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserStatsResultInvites {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("  total: ").append(total).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
