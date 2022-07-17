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
public class WebhookItem {
  
  @SerializedName("tag_name")
  private String tagName = null;
  @SerializedName("webhook_url")
  private URI webhookUrl = null;
  @SerializedName("created")
  private String created = null;
  @SerializedName("http_response")
  private Integer httpResponse = null;

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
  public URI getWebhookUrl() {
    return webhookUrl;
  }
  public void setWebhookUrl(URI webhookUrl) {
    this.webhookUrl = webhookUrl;
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
  public Integer getHttpResponse() {
    return httpResponse;
  }
  public void setHttpResponse(Integer httpResponse) {
    this.httpResponse = httpResponse;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookItem webhookItem = (WebhookItem) o;
    return (this.tagName == null ? webhookItem.tagName == null : this.tagName.equals(webhookItem.tagName)) &&
        (this.webhookUrl == null ? webhookItem.webhookUrl == null : this.webhookUrl.equals(webhookItem.webhookUrl)) &&
        (this.created == null ? webhookItem.created == null : this.created.equals(webhookItem.created)) &&
        (this.httpResponse == null ? webhookItem.httpResponse == null : this.httpResponse.equals(webhookItem.httpResponse));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.tagName == null ? 0: this.tagName.hashCode());
    result = 31 * result + (this.webhookUrl == null ? 0: this.webhookUrl.hashCode());
    result = 31 * result + (this.created == null ? 0: this.created.hashCode());
    result = 31 * result + (this.httpResponse == null ? 0: this.httpResponse.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookItem {\n");
    
    sb.append("  tagName: ").append(tagName).append("\n");
    sb.append("  webhookUrl: ").append(webhookUrl).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  httpResponse: ").append(httpResponse).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
