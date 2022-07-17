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
public class WebhookResultItem {
  
  @SerializedName("webhook_id")
  private Integer webhookId = null;
  @SerializedName("network_id")
  private Integer networkId = null;
  @SerializedName("webhook_url")
  private URI webhookUrl = null;
  @SerializedName("tag_name")
  private String tagName = null;
  @SerializedName("created")
  private String created = null;
  @SerializedName("updated")
  private String updated = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getWebhookId() {
    return webhookId;
  }
  public void setWebhookId(Integer webhookId) {
    this.webhookId = webhookId;
  }

  /**
   * The ID of the network configuration you're viewing
   **/
  @ApiModelProperty(value = "The ID of the network configuration you're viewing")
  public Integer getNetworkId() {
    return networkId;
  }
  public void setNetworkId(Integer networkId) {
    this.networkId = networkId;
  }

  /**
   * The user's associated search url configuration for the network configuration you're viewing
   **/
  @ApiModelProperty(value = "The user's associated search url configuration for the network configuration you're viewing")
  public URI getWebhookUrl() {
    return webhookUrl;
  }
  public void setWebhookUrl(URI webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  /**
   * The tag/event currently configured for this webhook
   **/
  @ApiModelProperty(value = "The tag/event currently configured for this webhook")
  public String getTagName() {
    return tagName;
  }
  public void setTagName(String tagName) {
    this.tagName = tagName;
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
    WebhookResultItem webhookResultItem = (WebhookResultItem) o;
    return (this.webhookId == null ? webhookResultItem.webhookId == null : this.webhookId.equals(webhookResultItem.webhookId)) &&
        (this.networkId == null ? webhookResultItem.networkId == null : this.networkId.equals(webhookResultItem.networkId)) &&
        (this.webhookUrl == null ? webhookResultItem.webhookUrl == null : this.webhookUrl.equals(webhookResultItem.webhookUrl)) &&
        (this.tagName == null ? webhookResultItem.tagName == null : this.tagName.equals(webhookResultItem.tagName)) &&
        (this.created == null ? webhookResultItem.created == null : this.created.equals(webhookResultItem.created)) &&
        (this.updated == null ? webhookResultItem.updated == null : this.updated.equals(webhookResultItem.updated));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.webhookId == null ? 0: this.webhookId.hashCode());
    result = 31 * result + (this.networkId == null ? 0: this.networkId.hashCode());
    result = 31 * result + (this.webhookUrl == null ? 0: this.webhookUrl.hashCode());
    result = 31 * result + (this.tagName == null ? 0: this.tagName.hashCode());
    result = 31 * result + (this.created == null ? 0: this.created.hashCode());
    result = 31 * result + (this.updated == null ? 0: this.updated.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookResultItem {\n");
    
    sb.append("  webhookId: ").append(webhookId).append("\n");
    sb.append("  networkId: ").append(networkId).append("\n");
    sb.append("  webhookUrl: ").append(webhookUrl).append("\n");
    sb.append("  tagName: ").append(tagName).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
