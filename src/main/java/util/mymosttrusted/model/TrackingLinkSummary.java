/**
 * MMT reports API
 * MMT reports API documentation.
 *
 * Do not edit the class manually.
 */

package util.mymosttrusted.model;

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class TrackingLinkSummary {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("link")
  private String link = null;
  @SerializedName("tracking_link_name")
  private List<String> trackingLinkName = null;
  @SerializedName("clicked")
  private Integer clicked = null;
  @SerializedName("unclicked")
  private Integer unclicked = null;
  @SerializedName("total")
  private Integer total = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getTrackingLinkName() {
    return trackingLinkName;
  }
  public void setTrackingLinkName(List<String> trackingLinkName) {
    this.trackingLinkName = trackingLinkName;
  }

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
    TrackingLinkSummary trackingLinkSummary = (TrackingLinkSummary) o;
    return (this.id == null ? trackingLinkSummary.id == null : this.id.equals(trackingLinkSummary.id)) &&
        (this.link == null ? trackingLinkSummary.link == null : this.link.equals(trackingLinkSummary.link)) &&
        (this.trackingLinkName == null ? trackingLinkSummary.trackingLinkName == null : this.trackingLinkName.equals(trackingLinkSummary.trackingLinkName)) &&
        (this.clicked == null ? trackingLinkSummary.clicked == null : this.clicked.equals(trackingLinkSummary.clicked)) &&
        (this.unclicked == null ? trackingLinkSummary.unclicked == null : this.unclicked.equals(trackingLinkSummary.unclicked)) &&
        (this.total == null ? trackingLinkSummary.total == null : this.total.equals(trackingLinkSummary.total));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.link == null ? 0: this.link.hashCode());
    result = 31 * result + (this.trackingLinkName == null ? 0: this.trackingLinkName.hashCode());
    result = 31 * result + (this.clicked == null ? 0: this.clicked.hashCode());
    result = 31 * result + (this.unclicked == null ? 0: this.unclicked.hashCode());
    result = 31 * result + (this.total == null ? 0: this.total.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingLinkSummary {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  link: ").append(link).append("\n");
    sb.append("  trackingLinkName: ").append(trackingLinkName).append("\n");
    sb.append("  clicked: ").append(clicked).append("\n");
    sb.append("  unclicked: ").append(unclicked).append("\n");
    sb.append("  total: ").append(total).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
