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
public class WebhookPatchBody {
  
  @SerializedName("tag_name")
  private String tagName = null;
  @SerializedName("webhook_url")
  private URI webhookUrl = null;

  /**
   * The tag associated with the webhook event being configured for the user you're setting up
   **/
  @ApiModelProperty(value = "The tag associated with the webhook event being configured for the user you're setting up")
  public String getTagName() {
    return tagName;
  }
  public void setTagName(String tagName) {
    this.tagName = tagName;
  }

  /**
   * The new URL to receive the webhook events
   **/
  @ApiModelProperty(value = "The new URL to receive the webhook events")
  public URI getWebhookUrl() {
    return webhookUrl;
  }
  public void setWebhookUrl(URI webhookUrl) {
    this.webhookUrl = webhookUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookPatchBody webhookPatchBody = (WebhookPatchBody) o;
    return (this.tagName == null ? webhookPatchBody.tagName == null : this.tagName.equals(webhookPatchBody.tagName)) &&
        (this.webhookUrl == null ? webhookPatchBody.webhookUrl == null : this.webhookUrl.equals(webhookPatchBody.webhookUrl));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.tagName == null ? 0: this.tagName.hashCode());
    result = 31 * result + (this.webhookUrl == null ? 0: this.webhookUrl.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookPatchBody {\n");
    
    sb.append("  tagName: ").append(tagName).append("\n");
    sb.append("  webhookUrl: ").append(webhookUrl).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
