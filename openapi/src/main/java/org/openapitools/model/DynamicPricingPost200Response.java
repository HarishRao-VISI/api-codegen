package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.DynamicPricingPost200ResponseResult;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DynamicPricingPost200Response
 */

@JsonTypeName("_dynamicPricing_post_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-11T20:06:23.427532300+05:30[Asia/Colombo]", comments = "Generator version: 7.9.0")
public class DynamicPricingPost200Response {

  private DynamicPricingPost200ResponseResult result;

  public DynamicPricingPost200Response result(DynamicPricingPost200ResponseResult result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   */
  @Valid 
  @Schema(name = "Result", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Result")
  public DynamicPricingPost200ResponseResult getResult() {
    return result;
  }

  public void setResult(DynamicPricingPost200ResponseResult result) {
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
    DynamicPricingPost200Response dynamicPricingPost200Response = (DynamicPricingPost200Response) o;
    return Objects.equals(this.result, dynamicPricingPost200Response.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicPricingPost200Response {\n");
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

