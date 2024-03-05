package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RobotIdFirmwareBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-05T18:17:47.729896239Z[GMT]")


public class RobotIdFirmwareBody   {
  @JsonProperty("firmware_file")
  private java.io.File firmwareFile = null;

  public RobotIdFirmwareBody firmwareFile(java.io.File firmwareFile) {
    this.firmwareFile = firmwareFile;
    return this;
  }

  /**
   * Get firmwareFile
   * @return firmwareFile
   **/
  @Schema(description = "")
  
    @Valid
    public java.io.File getFirmwareFile() {
    return firmwareFile;
  }

  public void setFirmwareFile(java.io.File firmwareFile) {
    this.firmwareFile = firmwareFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RobotIdFirmwareBody robotIdFirmwareBody = (RobotIdFirmwareBody) o;
    return Objects.equals(this.firmwareFile, robotIdFirmwareBody.firmwareFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firmwareFile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RobotIdFirmwareBody {\n");
    
    sb.append("    firmwareFile: ").append(toIndentedString(firmwareFile)).append("\n");
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
