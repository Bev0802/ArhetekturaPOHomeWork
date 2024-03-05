package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DiagnosticData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-05T18:17:47.729896239Z[GMT]")


public class DiagnosticData   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("robot_id")
  private Integer robotId = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  public DiagnosticData id(Integer id) {
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

  public DiagnosticData robotId(Integer robotId) {
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

  public DiagnosticData timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagnosticData diagnosticData = (DiagnosticData) o;
    return Objects.equals(this.id, diagnosticData.id) &&
        Objects.equals(this.robotId, diagnosticData.robotId) &&
        Objects.equals(this.timestamp, diagnosticData.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, robotId, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagnosticData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
