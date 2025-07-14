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
 * DynamicPricingPostRequestDiscount
 */

@JsonTypeName("_dynamicPricing_post_request_Discount")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-14T14:19:15.610197400+05:30[Asia/Colombo]", comments = "Generator version: 7.9.0")
public class DynamicPricingPostRequestDiscount {

  private BigDecimal sellingPrice;

  private BigDecimal margin;

  private String product;

  public DynamicPricingPostRequestDiscount() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DynamicPricingPostRequestDiscount(BigDecimal sellingPrice, BigDecimal margin, String product) {
    this.sellingPrice = sellingPrice;
    this.margin = margin;
    this.product = product;
  }

  public DynamicPricingPostRequestDiscount sellingPrice(BigDecimal sellingPrice) {
    this.sellingPrice = sellingPrice;
    return this;
  }

  /**
   * The selling price of the product.
   * @return sellingPrice
   */
  @NotNull @Valid 
  @Schema(name = "sellingPrice", description = "The selling price of the product.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sellingPrice")
  public BigDecimal getSellingPrice() {
    return sellingPrice;
  }

  public void setSellingPrice(BigDecimal sellingPrice) {
    this.sellingPrice = sellingPrice;
  }

  public DynamicPricingPostRequestDiscount margin(BigDecimal margin) {
    this.margin = margin;
    return this;
  }

  /**
   * The margin percentage.
   * @return margin
   */
  @NotNull @Valid 
  @Schema(name = "Margin", description = "The margin percentage.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Margin")
  public BigDecimal getMargin() {
    return margin;
  }

  public void setMargin(BigDecimal margin) {
    this.margin = margin;
  }

  public DynamicPricingPostRequestDiscount product(String product) {
    this.product = product;
    return this;
  }

  /**
   * The name of the product.
   * @return product
   */
  @NotNull 
  @Schema(name = "Product", description = "The name of the product.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    DynamicPricingPostRequestDiscount dynamicPricingPostRequestDiscount = (DynamicPricingPostRequestDiscount) o;
    return Objects.equals(this.sellingPrice, dynamicPricingPostRequestDiscount.sellingPrice) &&
        Objects.equals(this.margin, dynamicPricingPostRequestDiscount.margin) &&
        Objects.equals(this.product, dynamicPricingPostRequestDiscount.product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellingPrice, margin, product);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicPricingPostRequestDiscount {\n");
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

