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
public class StatsSummedResultTrackingLinks {
  
  @SerializedName("clicked")
  private Integer clicked = null;
  @SerializedName("unclicked")
  private Integer unclicked = null;
  @SerializedName("total")
  private Integer total = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getClicked() {
    return clicked;
  }
  public void setClicked(Integer clicked) {
    this.clicked = clicked;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getUnclicked() {
    return unclicked;
  }
  public void setUnclicked(Integer unclicked) {
    this.unclicked = unclicked;
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
    StatsSummedResultTrackingLinks statsSummedResultTrackingLinks = (StatsSummedResultTrackingLinks) o;
    return (this.clicked == null ? statsSummedResultTrackingLinks.clicked == null : this.clicked.equals(statsSummedResultTrackingLinks.clicked)) &&
        (this.unclicked == null ? statsSummedResultTrackingLinks.unclicked == null : this.unclicked.equals(statsSummedResultTrackingLinks.unclicked)) &&
        (this.total == null ? statsSummedResultTrackingLinks.total == null : this.total.equals(statsSummedResultTrackingLinks.total));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.clicked == null ? 0: this.clicked.hashCode());
    result = 31 * result + (this.unclicked == null ? 0: this.unclicked.hashCode());
    result = 31 * result + (this.total == null ? 0: this.total.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsSummedResultTrackingLinks {\n");
    
    sb.append("  clicked: ").append(clicked).append("\n");
    sb.append("  unclicked: ").append(unclicked).append("\n");
    sb.append("  total: ").append(total).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
