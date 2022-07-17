/**
 * MMT reports API
 * MMT reports API documentation.
 *
 * Do not edit the class manually.
 */

package util.mymosttrusted.model;

import java.util.*;
import util.mymosttrusted.model.GroupedTagItem;
import util.mymosttrusted.model.TrackingLinkSummary;
import util.mymosttrusted.model.UserStatsResultInvites;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class UserStatsResult {
  
  @SerializedName("invites")
  private UserStatsResultInvites invites = null;
  @SerializedName("tracking_links")
  private List<TrackingLinkSummary> trackingLinks = null;
  @SerializedName("tags")
  private List<GroupedTagItem> tags = null;
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
  public List<TrackingLinkSummary> getTrackingLinks() {
    return trackingLinks;
  }
  public void setTrackingLinks(List<TrackingLinkSummary> trackingLinks) {
    this.trackingLinks = trackingLinks;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<GroupedTagItem> getTags() {
    return tags;
  }
  public void setTags(List<GroupedTagItem> tags) {
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
    UserStatsResult userStatsResult = (UserStatsResult) o;
    return (this.invites == null ? userStatsResult.invites == null : this.invites.equals(userStatsResult.invites)) &&
        (this.trackingLinks == null ? userStatsResult.trackingLinks == null : this.trackingLinks.equals(userStatsResult.trackingLinks)) &&
        (this.tags == null ? userStatsResult.tags == null : this.tags.equals(userStatsResult.tags)) &&
        (this.users == null ? userStatsResult.users == null : this.users.equals(userStatsResult.users));
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
    sb.append("class UserStatsResult {\n");
    
    sb.append("  invites: ").append(invites).append("\n");
    sb.append("  trackingLinks: ").append(trackingLinks).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  users: ").append(users).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
