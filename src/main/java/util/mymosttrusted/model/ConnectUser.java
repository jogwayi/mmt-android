/**
 * MMT reports API
 * MMT reports API documentation.
 *
 * Do not edit the class manually.
 */

package util.mymosttrusted.model;

import java.util.*;
import util.mymosttrusted.model.PhoneItem;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ConnectUser {
  
  @SerializedName("user_id")
  private String userId = null;
  @SerializedName("first_name")
  private String firstName = null;
  @SerializedName("last_name")
  private String lastName = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("thumbnail")
  private String thumbnail = null;
  @SerializedName("thumbnail_id")
  private String thumbnailId = null;
  @SerializedName("phone")
  private List<PhoneItem> phone = null;
  @SerializedName("li_link")
  private String liLink = null;
  @SerializedName("li_user_id")
  private String liUserId = null;
  @SerializedName("position")
  private String position = null;
  @SerializedName("location")
  private String location = null;
  @SerializedName("country")
  private String country = null;
  @SerializedName("website")
  private String website = null;
  @SerializedName("search_url")
  private String searchUrl = null;
  @SerializedName("created")
  private String created = null;
  @SerializedName("updated")
  private String updated = null;

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
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getThumbnail() {
    return thumbnail;
  }
  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getThumbnailId() {
    return thumbnailId;
  }
  public void setThumbnailId(String thumbnailId) {
    this.thumbnailId = thumbnailId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<PhoneItem> getPhone() {
    return phone;
  }
  public void setPhone(List<PhoneItem> phone) {
    this.phone = phone;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLiLink() {
    return liLink;
  }
  public void setLiLink(String liLink) {
    this.liLink = liLink;
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
  public String getPosition() {
    return position;
  }
  public void setPosition(String position) {
    this.position = position;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getWebsite() {
    return website;
  }
  public void setWebsite(String website) {
    this.website = website;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSearchUrl() {
    return searchUrl;
  }
  public void setSearchUrl(String searchUrl) {
    this.searchUrl = searchUrl;
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
  public String getUpdated() {
    return updated;
  }
  public void setUpdated(String updated) {
    this.updated = updated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectUser connectUser = (ConnectUser) o;
    return (this.userId == null ? connectUser.userId == null : this.userId.equals(connectUser.userId)) &&
        (this.firstName == null ? connectUser.firstName == null : this.firstName.equals(connectUser.firstName)) &&
        (this.lastName == null ? connectUser.lastName == null : this.lastName.equals(connectUser.lastName)) &&
        (this.email == null ? connectUser.email == null : this.email.equals(connectUser.email)) &&
        (this.thumbnail == null ? connectUser.thumbnail == null : this.thumbnail.equals(connectUser.thumbnail)) &&
        (this.thumbnailId == null ? connectUser.thumbnailId == null : this.thumbnailId.equals(connectUser.thumbnailId)) &&
        (this.phone == null ? connectUser.phone == null : this.phone.equals(connectUser.phone)) &&
        (this.liLink == null ? connectUser.liLink == null : this.liLink.equals(connectUser.liLink)) &&
        (this.liUserId == null ? connectUser.liUserId == null : this.liUserId.equals(connectUser.liUserId)) &&
        (this.position == null ? connectUser.position == null : this.position.equals(connectUser.position)) &&
        (this.location == null ? connectUser.location == null : this.location.equals(connectUser.location)) &&
        (this.country == null ? connectUser.country == null : this.country.equals(connectUser.country)) &&
        (this.website == null ? connectUser.website == null : this.website.equals(connectUser.website)) &&
        (this.searchUrl == null ? connectUser.searchUrl == null : this.searchUrl.equals(connectUser.searchUrl)) &&
        (this.created == null ? connectUser.created == null : this.created.equals(connectUser.created)) &&
        (this.updated == null ? connectUser.updated == null : this.updated.equals(connectUser.updated));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.thumbnail == null ? 0: this.thumbnail.hashCode());
    result = 31 * result + (this.thumbnailId == null ? 0: this.thumbnailId.hashCode());
    result = 31 * result + (this.phone == null ? 0: this.phone.hashCode());
    result = 31 * result + (this.liLink == null ? 0: this.liLink.hashCode());
    result = 31 * result + (this.liUserId == null ? 0: this.liUserId.hashCode());
    result = 31 * result + (this.position == null ? 0: this.position.hashCode());
    result = 31 * result + (this.location == null ? 0: this.location.hashCode());
    result = 31 * result + (this.country == null ? 0: this.country.hashCode());
    result = 31 * result + (this.website == null ? 0: this.website.hashCode());
    result = 31 * result + (this.searchUrl == null ? 0: this.searchUrl.hashCode());
    result = 31 * result + (this.created == null ? 0: this.created.hashCode());
    result = 31 * result + (this.updated == null ? 0: this.updated.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectUser {\n");
    
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  thumbnail: ").append(thumbnail).append("\n");
    sb.append("  thumbnailId: ").append(thumbnailId).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  liLink: ").append(liLink).append("\n");
    sb.append("  liUserId: ").append(liUserId).append("\n");
    sb.append("  position: ").append(position).append("\n");
    sb.append("  location: ").append(location).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  website: ").append(website).append("\n");
    sb.append("  searchUrl: ").append(searchUrl).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
