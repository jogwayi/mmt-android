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
public class TagItem {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("tag_name")
  private String tagName = null;
  @SerializedName("created")
  private String created = null;

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagItem tagItem = (TagItem) o;
    return (this.id == null ? tagItem.id == null : this.id.equals(tagItem.id)) &&
        (this.tagName == null ? tagItem.tagName == null : this.tagName.equals(tagItem.tagName)) &&
        (this.created == null ? tagItem.created == null : this.created.equals(tagItem.created));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.tagName == null ? 0: this.tagName.hashCode());
    result = 31 * result + (this.created == null ? 0: this.created.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagItem {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  tagName: ").append(tagName).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
