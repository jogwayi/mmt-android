/**
 * MMT reports API
 * MMT reports API documentation.
 *
 * Do not edit the class manually.
 */

package util.mymosttrusted.model;

import java.net.URI;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ConfigBody {
  
  @SerializedName("search_url")
  private URI searchUrl = null;
  @SerializedName("invitation_message")
  private String invitationMessage = null;
  @SerializedName("acceptance_message")
  private String acceptanceMessage = null;
  @SerializedName("custom_message1")
  private String customMessage1 = null;
  @SerializedName("custom_message2")
  private String customMessage2 = null;

  /**
   * The user's associated search url configuration for the network configuration you're setting up
   **/
  @ApiModelProperty(value = "The user's associated search url configuration for the network configuration you're setting up")
  public URI getSearchUrl() {
    return searchUrl;
  }
  public void setSearchUrl(URI searchUrl) {
    this.searchUrl = searchUrl;
  }

  /**
   * The invitation message template being configured
   **/
  @ApiModelProperty(value = "The invitation message template being configured")
  public String getInvitationMessage() {
    return invitationMessage;
  }
  public void setInvitationMessage(String invitationMessage) {
    this.invitationMessage = invitationMessage;
  }

  /**
   * The acceptance message template being configured
   **/
  @ApiModelProperty(value = "The acceptance message template being configured")
  public String getAcceptanceMessage() {
    return acceptanceMessage;
  }
  public void setAcceptanceMessage(String acceptanceMessage) {
    this.acceptanceMessage = acceptanceMessage;
  }

  /**
   * The custom message 1 template being configured
   **/
  @ApiModelProperty(value = "The custom message 1 template being configured")
  public String getCustomMessage1() {
    return customMessage1;
  }
  public void setCustomMessage1(String customMessage1) {
    this.customMessage1 = customMessage1;
  }

  /**
   * The custom message 2 template being configured
   **/
  @ApiModelProperty(value = "The custom message 2 template being configured")
  public String getCustomMessage2() {
    return customMessage2;
  }
  public void setCustomMessage2(String customMessage2) {
    this.customMessage2 = customMessage2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigBody configBody = (ConfigBody) o;
    return (this.searchUrl == null ? configBody.searchUrl == null : this.searchUrl.equals(configBody.searchUrl)) &&
        (this.invitationMessage == null ? configBody.invitationMessage == null : this.invitationMessage.equals(configBody.invitationMessage)) &&
        (this.acceptanceMessage == null ? configBody.acceptanceMessage == null : this.acceptanceMessage.equals(configBody.acceptanceMessage)) &&
        (this.customMessage1 == null ? configBody.customMessage1 == null : this.customMessage1.equals(configBody.customMessage1)) &&
        (this.customMessage2 == null ? configBody.customMessage2 == null : this.customMessage2.equals(configBody.customMessage2));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.searchUrl == null ? 0: this.searchUrl.hashCode());
    result = 31 * result + (this.invitationMessage == null ? 0: this.invitationMessage.hashCode());
    result = 31 * result + (this.acceptanceMessage == null ? 0: this.acceptanceMessage.hashCode());
    result = 31 * result + (this.customMessage1 == null ? 0: this.customMessage1.hashCode());
    result = 31 * result + (this.customMessage2 == null ? 0: this.customMessage2.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigBody {\n");
    
    sb.append("  searchUrl: ").append(searchUrl).append("\n");
    sb.append("  invitationMessage: ").append(invitationMessage).append("\n");
    sb.append("  acceptanceMessage: ").append(acceptanceMessage).append("\n");
    sb.append("  customMessage1: ").append(customMessage1).append("\n");
    sb.append("  customMessage2: ").append(customMessage2).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
