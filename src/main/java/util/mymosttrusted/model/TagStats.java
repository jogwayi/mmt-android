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
public class TagStats {
  
  @SerializedName("tag_name")
  private String tagName = null;
  @SerializedName("total")
  private Integer total = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTagName() {
    return tagName;
  }
  public void setTagName(String tagName) {
    this.tagName = tagName;
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
    TagStats tagStats = (TagStats) o;
    return (this.tagName == null ? tagStats.tagName == null : this.tagName.equals(tagStats.tagName)) &&
        (this.total == null ? tagStats.total == null : this.total.equals(tagStats.total));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.tagName == null ? 0: this.tagName.hashCode());
    result = 31 * result + (this.total == null ? 0: this.total.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagStats {\n");
    
    sb.append("  tagName: ").append(tagName).append("\n");
    sb.append("  total: ").append(total).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
