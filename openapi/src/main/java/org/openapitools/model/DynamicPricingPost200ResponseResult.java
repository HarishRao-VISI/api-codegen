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
 * DynamicPricingPost200ResponseResult
 */

@JsonTypeName("_dynamicPricing_post_200_response_Result")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-08T20:21:18.246317500+05:30[Asia/Colombo]", comments = "Generator version: 7.9.0")
public class DynamicPricingPost200ResponseResult {

  private BigDecimal suggestedPrice;

  private String reasoning;

  public DynamicPricingPost200ResponseResult() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DynamicPricingPost200ResponseResult(BigDecimal suggestedPrice, String reasoning) {
    this.suggestedPrice = suggestedPrice;
    this.reasoning = reasoning;
  }

  public DynamicPricingPost200ResponseResult suggestedPrice(BigDecimal suggestedPrice) {
    this.suggestedPrice = suggestedPrice;
    return this;
  }

  /**
   * The calculated suggested price for the product
   * @return suggestedPrice
   */
  @NotNull @Valid 
  @Schema(name = "SuggestedPrice", description = "The calculated suggested price for the product", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("SuggestedPrice")
  public BigDecimal getSuggestedPrice() {
    return suggestedPrice;
  }

  public void setSuggestedPrice(BigDecimal suggestedPrice) {
    this.suggestedPrice = suggestedPrice;
  }

  public DynamicPricingPost200ResponseResult reasoning(String reasoning) {
    this.reasoning = reasoning;
    return this;
  }

  /**
   * Explanation for the suggested price
   * @return reasoning
   */
  @NotNull 
  @Schema(name = "Reasoning", description = "Explanation for the suggested price", requiredMode = Schema.RequiredMode.REQUIRED)
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
    DynamicPricingPost200ResponseResult dynamicPricingPost200ResponseResult = (DynamicPricingPost200ResponseResult) o;
    return Objects.equals(this.suggestedPrice, dynamicPricingPost200ResponseResult.suggestedPrice) &&
        Objects.equals(this.reasoning, dynamicPricingPost200ResponseResult.reasoning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suggestedPrice, reasoning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicPricingPost200ResponseResult {\n");
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

