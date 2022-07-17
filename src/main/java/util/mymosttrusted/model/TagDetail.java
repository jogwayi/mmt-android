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
public class TagDetail {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("created")
  private String created = null;
  @SerializedName("tag_name")
  private String tagName = null;
  @SerializedName("first_name")
  private String firstName = null;
  @SerializedName("last_name")
  private String lastName = null;
  @SerializedName("li_user_id")
  private String liUserId = null;
  @SerializedName("user_id")
  private String userId = null;

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
  public String getCreated() {
    return created;
  }
  public void setCreated(String created) {
    this.created = created;
  }

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

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagDetail tagDetail = (TagDetail) o;
    return (this.id == null ? tagDetail.id == null : this.id.equals(tagDetail.id)) &&
        (this.created == null ? tagDetail.created == null : this.created.equals(tagDetail.created)) &&
        (this.tagName == null ? tagDetail.tagName == null : this.tagName.equals(tagDetail.tagName)) &&
        (this.firstName == null ? tagDetail.firstName == null : this.firstName.equals(tagDetail.firstName)) &&
        (this.lastName == null ? tagDetail.lastName == null : this.lastName.equals(tagDetail.lastName)) &&
        (this.liUserId == null ? tagDetail.liUserId == null : this.liUserId.equals(tagDetail.liUserId)) &&
        (this.userId == null ? tagDetail.userId == null : this.userId.equals(tagDetail.userId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.created == null ? 0: this.created.hashCode());
    result = 31 * result + (this.tagName == null ? 0: this.tagName.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.liUserId == null ? 0: this.liUserId.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagDetail {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  tagName: ").append(tagName).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  liUserId: ").append(liUserId).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
