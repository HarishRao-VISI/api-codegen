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
 * DiscountRequestDiscount
 */

@JsonTypeName("DiscountRequest_Discount")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-14T14:09:07.595863300+05:30[Asia/Colombo]", comments = "Generator version: 7.9.0")
public class DiscountRequestDiscount {

  private BigDecimal sellingPrice;

  private BigDecimal margin;

  private String product;

  public DiscountRequestDiscount() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DiscountRequestDiscount(BigDecimal sellingPrice, BigDecimal margin, String product) {
    this.sellingPrice = sellingPrice;
    this.margin = margin;
    this.product = product;
  }

  public DiscountRequestDiscount sellingPrice(BigDecimal sellingPrice) {
    this.sellingPrice = sellingPrice;
    return this;
  }

  /**
   * Get sellingPrice
   * @return sellingPrice
   */
  @NotNull @Valid 
  @Schema(name = "sellingPrice", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sellingPrice")
  public BigDecimal getSellingPrice() {
    return sellingPrice;
  }

  public void setSellingPrice(BigDecimal sellingPrice) {
    this.sellingPrice = sellingPrice;
  }

  public DiscountRequestDiscount margin(BigDecimal margin) {
    this.margin = margin;
    return this;
  }

  /**
   * Get margin
   * @return margin
   */
  @NotNull @Valid 
  @Schema(name = "Margin", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Margin")
  public BigDecimal getMargin() {
    return margin;
  }

  public void setMargin(BigDecimal margin) {
    this.margin = margin;
  }

  public DiscountRequestDiscount product(String product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
   */
  @NotNull 
  @Schema(name = "Product", requiredMode = Schema.RequiredMode.REQUIRED)
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
    DiscountRequestDiscount discountRequestDiscount = (DiscountRequestDiscount) o;
    return Objects.equals(this.sellingPrice, discountRequestDiscount.sellingPrice) &&
        Objects.equals(this.margin, discountRequestDiscount.margin) &&
        Objects.equals(this.product, discountRequestDiscount.product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellingPrice, margin, product);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountRequestDiscount {\n");
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

