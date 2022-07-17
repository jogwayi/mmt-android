/**
 * MMT reports API
 * MMT reports API documentation.
 *
 * Do not edit the class manually.
 */

package util.mymosttrusted.model;

import java.util.*;
import util.mymosttrusted.model.ConnectUser;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ConnectUserResult {
  
  @SerializedName("total")
  private Integer total = null;
  @SerializedName("page")
  private Integer page = null;
  @SerializedName("limit")
  private Integer limit = null;
  @SerializedName("data")
  private List<List> data = null;

  /**
   * Total Number of invites
   **/
  @ApiModelProperty(value = "Total Number of invites")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }

  /**
   * Loaded page number
   **/
  @ApiModelProperty(value = "Loaded page number")
  public Integer getPage() {
    return page;
  }
  public void setPage(Integer page) {
    this.page = page;
  }

  /**
   * Items per page
   **/
  @ApiModelProperty(value = "Items per page")
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<List> getData() {
    return data;
  }
  public void setData(List<List> data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectUserResult connectUserResult = (ConnectUserResult) o;
    return (this.total == null ? connectUserResult.total == null : this.total.equals(connectUserResult.total)) &&
        (this.page == null ? connectUserResult.page == null : this.page.equals(connectUserResult.page)) &&
        (this.limit == null ? connectUserResult.limit == null : this.limit.equals(connectUserResult.limit)) &&
        (this.data == null ? connectUserResult.data == null : this.data.equals(connectUserResult.data));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.total == null ? 0: this.total.hashCode());
    result = 31 * result + (this.page == null ? 0: this.page.hashCode());
    result = 31 * result + (this.limit == null ? 0: this.limit.hashCode());
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectUserResult {\n");
    
    sb.append("  total: ").append(total).append("\n");
    sb.append("  page: ").append(page).append("\n");
    sb.append("  limit: ").append(limit).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
