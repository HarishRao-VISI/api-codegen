package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.DiscountRequestDiscount;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DiscountRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-14T14:09:07.595863300+05:30[Asia/Colombo]", comments = "Generator version: 7.9.0")
public class DiscountRequest {

  private DiscountRequestDiscount discount;

  public DiscountRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DiscountRequest(DiscountRequestDiscount discount) {
    this.discount = discount;
  }

  public DiscountRequest discount(DiscountRequestDiscount discount) {
    this.discount = discount;
    return this;
  }

  /**
   * Get discount
   * @return discount
   */
  @NotNull @Valid 
  @Schema(name = "Discount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Discount")
  public DiscountRequestDiscount getDiscount() {
    return discount;
  }

  public void setDiscount(DiscountRequestDiscount discount) {
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
    DiscountRequest discountRequest = (DiscountRequest) o;
    return Objects.equals(this.discount, discountRequest.discount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountRequest {\n");
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

