/**
 * MMT reports API
 * MMT reports API documentation.
 *
 * Do not edit the class manually.
 */

package util.mymosttrusted.model;

import java.util.*;
import util.mymosttrusted.model.User;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class UserResult {
  
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
    UserResult userResult = (UserResult) o;
    return (this.total == null ? userResult.total == null : this.total.equals(userResult.total)) &&
        (this.page == null ? userResult.page == null : this.page.equals(userResult.page)) &&
        (this.limit == null ? userResult.limit == null : this.limit.equals(userResult.limit)) &&
        (this.data == null ? userResult.data == null : this.data.equals(userResult.data));
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
    sb.append("class UserResult {\n");
    
    sb.append("  total: ").append(total).append("\n");
    sb.append("  page: ").append(page).append("\n");
    sb.append("  limit: ").append(limit).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
