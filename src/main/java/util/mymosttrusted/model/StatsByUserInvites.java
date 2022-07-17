/**
 * MMT reports API
 * MMT reports API documentation.
 *
 * Do not edit the class manually.
 */

package util.mymosttrusted.model;

import java.util.*;
import util.mymosttrusted.model.StatsSummedResultTrackingLinks;
import util.mymosttrusted.model.TagStats;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class StatsByUserInvites {
  
  @SerializedName("user_id")
  private String userId = null;
  @SerializedName("first_name")
  private String firstName = null;
  @SerializedName("last_name")
  private String lastName = null;
  @SerializedName("total")
  private Integer total = null;
  @SerializedName("tracking_links")
  private StatsSummedResultTrackingLinks trackingLinks = null;
  @SerializedName("tags")
  private List<TagStats> tags = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
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
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
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
   **/
  @ApiModelProperty(value = "")
  public List<TagStats> getTags() {
    return tags;
  }
  public void setTags(List<TagStats> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsByUserInvites statsByUserInvites = (StatsByUserInvites) o;
    return (this.userId == null ? statsByUserInvites.userId == null : this.userId.equals(statsByUserInvites.userId)) &&
        (this.firstName == null ? statsByUserInvites.firstName == null : this.firstName.equals(statsByUserInvites.firstName)) &&
        (this.lastName == null ? statsByUserInvites.lastName == null : this.lastName.equals(statsByUserInvites.lastName)) &&
        (this.total == null ? statsByUserInvites.total == null : this.total.equals(statsByUserInvites.total)) &&
        (this.trackingLinks == null ? statsByUserInvites.trackingLinks == null : this.trackingLinks.equals(statsByUserInvites.trackingLinks)) &&
        (this.tags == null ? statsByUserInvites.tags == null : this.tags.equals(statsByUserInvites.tags));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.total == null ? 0: this.total.hashCode());
    result = 31 * result + (this.trackingLinks == null ? 0: this.trackingLinks.hashCode());
    result = 31 * result + (this.tags == null ? 0: this.tags.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsByUserInvites {\n");
    
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  total: ").append(total).append("\n");
    sb.append("  trackingLinks: ").append(trackingLinks).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
