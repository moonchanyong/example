package example.armeria.server.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.linecorp.armeria.server.annotation.Description;


@Description("some description ")
public class Amount   {
  
  @JsonProperty("value")
  private Double value = null;

  @JsonProperty("currency")
  private String currency = null;

  public Amount value(Double value) {
    this.value = value;
    return this;
  }

  @Description("some description ")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }
  public Amount currency(String currency) {
    this.currency = currency;
    return this;
  }

  @Description("")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Amount amount = (Amount) o;
    return Objects.equals(this.value, amount.value) &&
        Objects.equals(this.currency, amount.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Amount {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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


