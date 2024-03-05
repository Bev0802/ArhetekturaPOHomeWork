package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HealthCheckResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-05T18:17:47.729896239Z[GMT]")


public class HealthCheckResponse   {
  @JsonProperty("api_gateway")
  private Boolean apiGateway = null;

  @JsonProperty("business_logic")
  private Boolean businessLogic = null;

  @JsonProperty("data_management_layer")
  private Boolean dataManagementLayer = null;

  @JsonProperty("metrics")
  private Boolean metrics = null;

  public HealthCheckResponse apiGateway(Boolean apiGateway) {
    this.apiGateway = apiGateway;
    return this;
  }

  /**
   * Whether the API gateway is up
   * @return apiGateway
   **/
  @Schema(description = "Whether the API gateway is up")
  
    public Boolean isApiGateway() {
    return apiGateway;
  }

  public void setApiGateway(Boolean apiGateway) {
    this.apiGateway = apiGateway;
  }

  public HealthCheckResponse businessLogic(Boolean businessLogic) {
    this.businessLogic = businessLogic;
    return this;
  }

  /**
   * Whether the business logic is functioning correctly
   * @return businessLogic
   **/
  @Schema(description = "Whether the business logic is functioning correctly")
  
    public Boolean isBusinessLogic() {
    return businessLogic;
  }

  public void setBusinessLogic(Boolean businessLogic) {
    this.businessLogic = businessLogic;
  }

  public HealthCheckResponse dataManagementLayer(Boolean dataManagementLayer) {
    this.dataManagementLayer = dataManagementLayer;
    return this;
  }

  /**
   * Whether the data management layer is functioning correctly
   * @return dataManagementLayer
   **/
  @Schema(description = "Whether the data management layer is functioning correctly")
  
    public Boolean isDataManagementLayer() {
    return dataManagementLayer;
  }

  public void setDataManagementLayer(Boolean dataManagementLayer) {
    this.dataManagementLayer = dataManagementLayer;
  }

  public HealthCheckResponse metrics(Boolean metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * Whether the metrics are being collected correctly
   * @return metrics
   **/
  @Schema(description = "Whether the metrics are being collected correctly")
  
    public Boolean isMetrics() {
    return metrics;
  }

  public void setMetrics(Boolean metrics) {
    this.metrics = metrics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckResponse healthCheckResponse = (HealthCheckResponse) o;
    return Objects.equals(this.apiGateway, healthCheckResponse.apiGateway) &&
        Objects.equals(this.businessLogic, healthCheckResponse.businessLogic) &&
        Objects.equals(this.dataManagementLayer, healthCheckResponse.dataManagementLayer) &&
        Objects.equals(this.metrics, healthCheckResponse.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiGateway, businessLogic, dataManagementLayer, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckResponse {\n");
    
    sb.append("    apiGateway: ").append(toIndentedString(apiGateway)).append("\n");
    sb.append("    businessLogic: ").append(toIndentedString(businessLogic)).append("\n");
    sb.append("    dataManagementLayer: ").append(toIndentedString(dataManagementLayer)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
