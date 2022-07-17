/**
 * MMT reports API
 * MMT reports API documentation.
 *
 * Do not edit the class manually.
 */

package util.mymosttrusted.model;

import java.util.*;
import util.mymosttrusted.model.PhoneItem;
import util.mymosttrusted.model.TagItem;
import util.mymosttrusted.model.WebhookItem;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Invite {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("created")
  private String created = null;
  @SerializedName("li_link")
  private String liLink = null;
  @SerializedName("li_user_id")
  private String liUserId = null;
  @SerializedName("first_name")
  private String firstName = null;
  @SerializedName("last_name")
  private String lastName = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("phone")
  private List<PhoneItem> phone = null;
  @SerializedName("position")
  private String position = null;
  @SerializedName("company")
  private String company = null;
  @SerializedName("country")
  private String country = null;
  @SerializedName("webhooks")
  private List<WebhookItem> webhooks = null;
  @SerializedName("tags")
  private List<TagItem> tags = null;
  @SerializedName("status_name")
  private String statusName = null;
  @SerializedName("updated")
  private String updated = null;
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
  public List<PhoneItem> getPhone() {
    return phone;
  }
  public void setPhone(List<PhoneItem> phone) {
    this.phone = phone;
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
  public String getCompany() {
    return company;
  }
  public void setCompany(String company) {
    this.company = company;
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
  public List<WebhookItem> getWebhooks() {
    return webhooks;
  }
  public void setWebhooks(List<WebhookItem> webhooks) {
    this.webhooks = webhooks;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<TagItem> getTags() {
    return tags;
  }
  public void setTags(List<TagItem> tags) {
    this.tags = tags;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStatusName() {
    return statusName;
  }
  public void setStatusName(String statusName) {
    this.statusName = statusName;
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
    Invite invite = (Invite) o;
    return (this.id == null ? invite.id == null : this.id.equals(invite.id)) &&
        (this.created == null ? invite.created == null : this.created.equals(invite.created)) &&
        (this.liLink == null ? invite.liLink == null : this.liLink.equals(invite.liLink)) &&
        (this.liUserId == null ? invite.liUserId == null : this.liUserId.equals(invite.liUserId)) &&
        (this.firstName == null ? invite.firstName == null : this.firstName.equals(invite.firstName)) &&
        (this.lastName == null ? invite.lastName == null : this.lastName.equals(invite.lastName)) &&
        (this.email == null ? invite.email == null : this.email.equals(invite.email)) &&
        (this.phone == null ? invite.phone == null : this.phone.equals(invite.phone)) &&
        (this.position == null ? invite.position == null : this.position.equals(invite.position)) &&
        (this.company == null ? invite.company == null : this.company.equals(invite.company)) &&
        (this.country == null ? invite.country == null : this.country.equals(invite.country)) &&
        (this.webhooks == null ? invite.webhooks == null : this.webhooks.equals(invite.webhooks)) &&
        (this.tags == null ? invite.tags == null : this.tags.equals(invite.tags)) &&
        (this.statusName == null ? invite.statusName == null : this.statusName.equals(invite.statusName)) &&
        (this.updated == null ? invite.updated == null : this.updated.equals(invite.updated)) &&
        (this.userId == null ? invite.userId == null : this.userId.equals(invite.userId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.created == null ? 0: this.created.hashCode());
    result = 31 * result + (this.liLink == null ? 0: this.liLink.hashCode());
    result = 31 * result + (this.liUserId == null ? 0: this.liUserId.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.phone == null ? 0: this.phone.hashCode());
    result = 31 * result + (this.position == null ? 0: this.position.hashCode());
    result = 31 * result + (this.company == null ? 0: this.company.hashCode());
    result = 31 * result + (this.country == null ? 0: this.country.hashCode());
    result = 31 * result + (this.webhooks == null ? 0: this.webhooks.hashCode());
    result = 31 * result + (this.tags == null ? 0: this.tags.hashCode());
    result = 31 * result + (this.statusName == null ? 0: this.statusName.hashCode());
    result = 31 * result + (this.updated == null ? 0: this.updated.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invite {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  liLink: ").append(liLink).append("\n");
    sb.append("  liUserId: ").append(liUserId).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  position: ").append(position).append("\n");
    sb.append("  company: ").append(company).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  webhooks: ").append(webhooks).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  statusName: ").append(statusName).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
