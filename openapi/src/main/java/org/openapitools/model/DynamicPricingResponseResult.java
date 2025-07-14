package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DynamicPricingResponseResult
 */

@JsonTypeName("DynamicPricingResponse_Result")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-14T14:10:46.505828600+05:30[Asia/Colombo]", comments = "Generator version: 7.9.0")
public class DynamicPricingResponseResult {

  private BigDecimal suggestedPrice;

  private String reasoning;

  public DynamicPricingResponseResult() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DynamicPricingResponseResult(BigDecimal suggestedPrice, String reasoning) {
    this.suggestedPrice = suggestedPrice;
    this.reasoning = reasoning;
  }

  public DynamicPricingResponseResult suggestedPrice(BigDecimal suggestedPrice) {
    this.suggestedPrice = suggestedPrice;
    return this;
  }

  /**
   * Get suggestedPrice
   * @return suggestedPrice
   */
  @NotNull @Valid 
  @Schema(name = "SuggestedPrice", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("SuggestedPrice")
  public BigDecimal getSuggestedPrice() {
    return suggestedPrice;
  }

  public void setSuggestedPrice(BigDecimal suggestedPrice) {
    this.suggestedPrice = suggestedPrice;
  }

  public DynamicPricingResponseResult reasoning(String reasoning) {
    this.reasoning = reasoning;
    return this;
  }

  /**
   * Get reasoning
   * @return reasoning
   */
  @NotNull 
  @Schema(name = "Reasoning", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Reasoning")
  public String getReasoning() {
    return reasoning;
  }

  public void setReasoning(String reasoning) {
    this.reasoning = reasoning;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicPricingResponseResult dynamicPricingResponseResult = (DynamicPricingResponseResult) o;
    return Objects.equals(this.suggestedPrice, dynamicPricingResponseResult.suggestedPrice) &&
        Objects.equals(this.reasoning, dynamicPricingResponseResult.reasoning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suggestedPrice, reasoning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicPricingResponseResult {\n");
    sb.append("    suggestedPrice: ").append(toIndentedString(suggestedPrice)).append("\n");
    sb.append("    reasoning: ").append(toIndentedString(reasoning)).append("\n");
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

