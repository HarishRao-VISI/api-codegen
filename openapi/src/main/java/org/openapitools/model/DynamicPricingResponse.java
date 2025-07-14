package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.DynamicPricingResponseResult;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DynamicPricingResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-14T14:10:46.505828600+05:30[Asia/Colombo]", comments = "Generator version: 7.9.0")
public class DynamicPricingResponse {

  private DynamicPricingResponseResult result;

  public DynamicPricingResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DynamicPricingResponse(DynamicPricingResponseResult result) {
    this.result = result;
  }

  public DynamicPricingResponse result(DynamicPricingResponseResult result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   */
  @NotNull @Valid 
  @Schema(name = "Result", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Result")
  public DynamicPricingResponseResult getResult() {
    return result;
  }

  public void setResult(DynamicPricingResponseResult result) {
    this.result = result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicPricingResponse dynamicPricingResponse = (DynamicPricingResponse) o;
    return Objects.equals(this.result, dynamicPricingResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicPricingResponse {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

