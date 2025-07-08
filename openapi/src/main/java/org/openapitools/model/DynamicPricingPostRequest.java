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
 * DynamicPricingPostRequest
 */

@JsonTypeName("_dynamicPricing_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-08T20:21:18.246317500+05:30[Asia/Colombo]", comments = "Generator version: 7.9.0")
public class DynamicPricingPostRequest {

  private BigDecimal sellingPrice;

  private BigDecimal margin;

  private String product;

  public DynamicPricingPostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DynamicPricingPostRequest(BigDecimal sellingPrice, BigDecimal margin, String product) {
    this.sellingPrice = sellingPrice;
    this.margin = margin;
    this.product = product;
  }

  public DynamicPricingPostRequest sellingPrice(BigDecimal sellingPrice) {
    this.sellingPrice = sellingPrice;
    return this;
  }

  /**
   * The selling price of the item
   * @return sellingPrice
   */
  @NotNull @Valid 
  @Schema(name = "sellingPrice", description = "The selling price of the item", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sellingPrice")
  public BigDecimal getSellingPrice() {
    return sellingPrice;
  }

  public void setSellingPrice(BigDecimal sellingPrice) {
    this.sellingPrice = sellingPrice;
  }

  public DynamicPricingPostRequest margin(BigDecimal margin) {
    this.margin = margin;
    return this;
  }

  /**
   * The margin percentage
   * @return margin
   */
  @NotNull @Valid 
  @Schema(name = "Margin", description = "The margin percentage", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Margin")
  public BigDecimal getMargin() {
    return margin;
  }

  public void setMargin(BigDecimal margin) {
    this.margin = margin;
  }

  public DynamicPricingPostRequest product(String product) {
    this.product = product;
    return this;
  }

  /**
   * The name of the product
   * @return product
   */
  @NotNull 
  @Schema(name = "Product", description = "The name of the product", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Product")
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
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
    return Objects.equals(this.sellingPrice, dynamicPricingPostRequest.sellingPrice) &&
        Objects.equals(this.margin, dynamicPricingPostRequest.margin) &&
        Objects.equals(this.product, dynamicPricingPostRequest.product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellingPrice, margin, product);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicPricingPostRequest {\n");
    sb.append("    sellingPrice: ").append(toIndentedString(sellingPrice)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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

