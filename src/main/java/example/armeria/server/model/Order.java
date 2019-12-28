package example.armeria.server.model;

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
  public String toString() {
    return String.valueOf(value);
  }

  public static Order fromValue(String text) {
    for (Order b : Order.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


