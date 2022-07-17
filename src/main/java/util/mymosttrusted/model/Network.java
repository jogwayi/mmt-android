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
public class Network {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("network_name")
  private String networkName = null;
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
  public String getNetworkName() {
    return networkName;
  }
  public void setNetworkName(String networkName) {
    this.networkName = networkName;
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
    Network network = (Network) o;
    return (this.id == null ? network.id == null : this.id.equals(network.id)) &&
        (this.networkName == null ? network.networkName == null : this.networkName.equals(network.networkName)) &&
        (this.created == null ? network.created == null : this.created.equals(network.created));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.networkName == null ? 0: this.networkName.hashCode());
    result = 31 * result + (this.created == null ? 0: this.created.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Network {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  networkName: ").append(networkName).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
