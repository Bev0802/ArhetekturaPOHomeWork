package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RobotConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-05T18:17:47.729896239Z[GMT]")


public class RobotConfiguration   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("robot_id")
  private Integer robotId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("data")
  @Valid
  private Map<String, Object> data = null;

  public RobotConfiguration id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public RobotConfiguration robotId(Integer robotId) {
    this.robotId = robotId;
    return this;
  }

  /**
   * Get robotId
   * @return robotId
   **/
  @Schema(description = "")
  
    public Integer getRobotId() {
    return robotId;
  }

  public void setRobotId(Integer robotId) {
    this.robotId = robotId;
  }

  public RobotConfiguration name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RobotConfiguration data(Map<String, Object> data) {
    this.data = data;
    return this;
  }

  public RobotConfiguration putDataItem(String key, Object dataItem) {
    if (this.data == null) {
      this.data = new HashMap<String, Object>();
    }
    this.data.put(key, dataItem);
    return this;
  }

  /**
   * The configuration data
   * @return data
   **/
  @Schema(description = "The configuration data")
  
    public Map<String, Object> getData() {
    return data;
  }

  public void setData(Map<String, Object> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RobotConfiguration robotConfiguration = (RobotConfiguration) o;
    return Objects.equals(this.id, robotConfiguration.id) &&
        Objects.equals(this.robotId, robotConfiguration.robotId) &&
        Objects.equals(this.name, robotConfiguration.name) &&
        Objects.equals(this.data, robotConfiguration.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, robotId, name, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RobotConfiguration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
