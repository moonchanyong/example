package example.armeria.server.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.Instant;
import com.linecorp.armeria.server.annotation.Description;


/**
 * An order for a pets from the pet store
 */
public enum Order {
  
  ID("id"),
  
  ABC("abc"),
  
  DDD("ddd");

  private Object value;

  Order(Object value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }
  @JsonCreator
  public static Order fromValue(String text) {
    for (Order b : Order.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


