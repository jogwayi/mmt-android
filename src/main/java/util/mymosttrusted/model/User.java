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
public class User {
  
  @SerializedName("user_id")
  private String userId = null;
  @SerializedName("activation_id")
  private String activationId = null;
  @SerializedName("first_name")
  private String firstName = null;
  @SerializedName("last_name")
  private String lastName = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("phone")
  private List<PhoneItem> phone = null;
  @SerializedName("li_link")
  private String liLink = null;
  @SerializedName("position")
  private String position = null;
  @SerializedName("last_work_text")
  private String lastWorkText = null;
  @SerializedName("country")
  private String country = null;
  @SerializedName("created")
  private String created = null;
  @SerializedName("deactivated")
  private Integer deactivated = 0;

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
  public String getActivationId() {
    return activationId;
  }
  public void setActivationId(String activationId) {
    this.activationId = activationId;
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
  public String getLiLink() {
    return liLink;
  }
  public void setLiLink(String liLink) {
    this.liLink = liLink;
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
  public String getLastWorkText() {
    return lastWorkText;
  }
  public void setLastWorkText(String lastWorkText) {
    this.lastWorkText = lastWorkText;
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
  public String getCreated() {
    return created;
  }
  public void setCreated(String created) {
    this.created = created;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getDeactivated() {
    return deactivated;
  }
  public void setDeactivated(Integer deactivated) {
    this.deactivated = deactivated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return (this.userId == null ? user.userId == null : this.userId.equals(user.userId)) &&
        (this.activationId == null ? user.activationId == null : this.activationId.equals(user.activationId)) &&
        (this.firstName == null ? user.firstName == null : this.firstName.equals(user.firstName)) &&
        (this.lastName == null ? user.lastName == null : this.lastName.equals(user.lastName)) &&
        (this.email == null ? user.email == null : this.email.equals(user.email)) &&
        (this.phone == null ? user.phone == null : this.phone.equals(user.phone)) &&
        (this.liLink == null ? user.liLink == null : this.liLink.equals(user.liLink)) &&
        (this.position == null ? user.position == null : this.position.equals(user.position)) &&
        (this.lastWorkText == null ? user.lastWorkText == null : this.lastWorkText.equals(user.lastWorkText)) &&
        (this.country == null ? user.country == null : this.country.equals(user.country)) &&
        (this.created == null ? user.created == null : this.created.equals(user.created)) &&
        (this.deactivated == null ? user.deactivated == null : this.deactivated.equals(user.deactivated));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.activationId == null ? 0: this.activationId.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.phone == null ? 0: this.phone.hashCode());
    result = 31 * result + (this.liLink == null ? 0: this.liLink.hashCode());
    result = 31 * result + (this.position == null ? 0: this.position.hashCode());
    result = 31 * result + (this.lastWorkText == null ? 0: this.lastWorkText.hashCode());
    result = 31 * result + (this.country == null ? 0: this.country.hashCode());
    result = 31 * result + (this.created == null ? 0: this.created.hashCode());
    result = 31 * result + (this.deactivated == null ? 0: this.deactivated.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  activationId: ").append(activationId).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  liLink: ").append(liLink).append("\n");
    sb.append("  position: ").append(position).append("\n");
    sb.append("  lastWorkText: ").append(lastWorkText).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  deactivated: ").append(deactivated).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
