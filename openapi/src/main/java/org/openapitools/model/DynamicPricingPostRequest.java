package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.DynamicPricingPostRequestDiscount;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DynamicPricingPostRequest
 */

@JsonTypeName("_dynamicPricing_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-29T20:05:31.368357100+05:30[Asia/Colombo]", comments = "Generator version: 7.9.0")
public class DynamicPricingPostRequest {

  private DynamicPricingPostRequestDiscount discount;

  public DynamicPricingPostRequest discount(DynamicPricingPostRequestDiscount discount) {
    this.discount = discount;
    return this;
  }

  /**
   * Get discount
   * @return discount
   */
  @Valid 
  @Schema(name = "Discount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Discount")
  public DynamicPricingPostRequestDiscount getDiscount() {
    return discount;
  }

  public void setDiscount(DynamicPricingPostRequestDiscount discount) {
    this.discount = discount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicPricingPostRequest dynamicPricingPostRequest = (DynamicPricingPostRequest) o;
    return Objects.equals(this.discount, dynamicPricingPostRequest.discount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicPricingPostRequest {\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
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

