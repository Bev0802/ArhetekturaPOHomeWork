package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Metrics
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-05T18:17:47.729896239Z[GMT]")


public class Metrics   {
  @JsonProperty("cpu_usage")
  private BigDecimal cpuUsage = null;

  @JsonProperty("memory_usage")
  private BigDecimal memoryUsage = null;

  @JsonProperty("disk_usage")
  private BigDecimal diskUsage = null;

  public Metrics cpuUsage(BigDecimal cpuUsage) {
    this.cpuUsage = cpuUsage;
    return this;
  }

  /**
   * Get cpuUsage
   * @return cpuUsage
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getCpuUsage() {
    return cpuUsage;
  }

  public void setCpuUsage(BigDecimal cpuUsage) {
    this.cpuUsage = cpuUsage;
  }

  public Metrics memoryUsage(BigDecimal memoryUsage) {
    this.memoryUsage = memoryUsage;
    return this;
  }

  /**
   * Get memoryUsage
   * @return memoryUsage
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getMemoryUsage() {
    return memoryUsage;
  }

  public void setMemoryUsage(BigDecimal memoryUsage) {
    this.memoryUsage = memoryUsage;
  }

  public Metrics diskUsage(BigDecimal diskUsage) {
    this.diskUsage = diskUsage;
    return this;
  }

  /**
   * Get diskUsage
   * @return diskUsage
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getDiskUsage() {
    return diskUsage;
  }

  public void setDiskUsage(BigDecimal diskUsage) {
    this.diskUsage = diskUsage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metrics metrics = (Metrics) o;
    return Objects.equals(this.cpuUsage, metrics.cpuUsage) &&
        Objects.equals(this.memoryUsage, metrics.memoryUsage) &&
        Objects.equals(this.diskUsage, metrics.diskUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuUsage, memoryUsage, diskUsage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metrics {\n");
    
    sb.append("    cpuUsage: ").append(toIndentedString(cpuUsage)).append("\n");
    sb.append("    memoryUsage: ").append(toIndentedString(memoryUsage)).append("\n");
    sb.append("    diskUsage: ").append(toIndentedString(diskUsage)).append("\n");
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
