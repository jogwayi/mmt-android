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
public class TrackingLinkDetail {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("link")
  private String link = null;
  @SerializedName("tracking_link_name")
  private String trackingLinkName = null;
  @SerializedName("created")
  private String created = null;
  @SerializedName("clicked")
  private String clicked = null;
  @SerializedName("tracking_link")
  private String trackingLink = null;
  @SerializedName("first_name")
  private String firstName = null;
  @SerializedName("last_name")
  private String lastName = null;
  @SerializedName("li_user_id")
  private String liUserId = null;

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
  public String getTrackingLinkName() {
    return trackingLinkName;
  }
  public void setTrackingLinkName(String trackingLinkName) {
    this.trackingLinkName = trackingLinkName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCreated() {
    return created;
  }
  public void setCreated(String created) {
    this.created = created;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getClicked() {
    return clicked;
  }
  public void setClicked(String clicked) {
    this.clicked = clicked;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTrackingLink() {
    return trackingLink;
  }
  public void setTrackingLink(String trackingLink) {
    this.trackingLink = trackingLink;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLiUserId() {
    return liUserId;
  }
  public void setLiUserId(String liUserId) {
    this.liUserId = liUserId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackingLinkDetail trackingLinkDetail = (TrackingLinkDetail) o;
    return (this.id == null ? trackingLinkDetail.id == null : this.id.equals(trackingLinkDetail.id)) &&
        (this.link == null ? trackingLinkDetail.link == null : this.link.equals(trackingLinkDetail.link)) &&
        (this.trackingLinkName == null ? trackingLinkDetail.trackingLinkName == null : this.trackingLinkName.equals(trackingLinkDetail.trackingLinkName)) &&
        (this.created == null ? trackingLinkDetail.created == null : this.created.equals(trackingLinkDetail.created)) &&
        (this.clicked == null ? trackingLinkDetail.clicked == null : this.clicked.equals(trackingLinkDetail.clicked)) &&
        (this.trackingLink == null ? trackingLinkDetail.trackingLink == null : this.trackingLink.equals(trackingLinkDetail.trackingLink)) &&
        (this.firstName == null ? trackingLinkDetail.firstName == null : this.firstName.equals(trackingLinkDetail.firstName)) &&
        (this.lastName == null ? trackingLinkDetail.lastName == null : this.lastName.equals(trackingLinkDetail.lastName)) &&
        (this.liUserId == null ? trackingLinkDetail.liUserId == null : this.liUserId.equals(trackingLinkDetail.liUserId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.link == null ? 0: this.link.hashCode());
    result = 31 * result + (this.trackingLinkName == null ? 0: this.trackingLinkName.hashCode());
    result = 31 * result + (this.created == null ? 0: this.created.hashCode());
    result = 31 * result + (this.clicked == null ? 0: this.clicked.hashCode());
    result = 31 * result + (this.trackingLink == null ? 0: this.trackingLink.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.liUserId == null ? 0: this.liUserId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingLinkDetail {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  link: ").append(link).append("\n");
    sb.append("  trackingLinkName: ").append(trackingLinkName).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  clicked: ").append(clicked).append("\n");
    sb.append("  trackingLink: ").append(trackingLink).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  liUserId: ").append(liUserId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
