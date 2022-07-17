/**
 * MMT reports API
 * MMT reports API documentation.
 *
 * Do not edit the class manually.
 */

package util.mymosttrusted.model;

import util.mymosttrusted.model.StatsSummedResultTrackingLinks;
import util.mymosttrusted.model.UserStatsResultInvites;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class StatsSummedResult {
  
  @SerializedName("invites")
  private UserStatsResultInvites invites = null;
  @SerializedName("tracking_links")
  private StatsSummedResultTrackingLinks trackingLinks = null;
  @SerializedName("tags")
  private Integer tags = null;
  @SerializedName("users")
  private Integer users = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public UserStatsResultInvites getInvites() {
    return invites;
  }
  public void setInvites(UserStatsResultInvites invites) {
    this.invites = invites;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public StatsSummedResultTrackingLinks getTrackingLinks() {
    return trackingLinks;
  }
  public void setTrackingLinks(StatsSummedResultTrackingLinks trackingLinks) {
    this.trackingLinks = trackingLinks;
  }

  /**
   * Total number of tags sent
   **/
  @ApiModelProperty(value = "Total number of tags sent")
  public Integer getTags() {
    return tags;
  }
  public void setTags(Integer tags) {
    this.tags = tags;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getUsers() {
    return users;
  }
  public void setUsers(Integer users) {
    this.users = users;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsSummedResult statsSummedResult = (StatsSummedResult) o;
    return (this.invites == null ? statsSummedResult.invites == null : this.invites.equals(statsSummedResult.invites)) &&
        (this.trackingLinks == null ? statsSummedResult.trackingLinks == null : this.trackingLinks.equals(statsSummedResult.trackingLinks)) &&
        (this.tags == null ? statsSummedResult.tags == null : this.tags.equals(statsSummedResult.tags)) &&
        (this.users == null ? statsSummedResult.users == null : this.users.equals(statsSummedResult.users));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.invites == null ? 0: this.invites.hashCode());
    result = 31 * result + (this.trackingLinks == null ? 0: this.trackingLinks.hashCode());
    result = 31 * result + (this.tags == null ? 0: this.tags.hashCode());
    result = 31 * result + (this.users == null ? 0: this.users.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsSummedResult {\n");
    
    sb.append("  invites: ").append(invites).append("\n");
    sb.append("  trackingLinks: ").append(trackingLinks).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  users: ").append(users).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
