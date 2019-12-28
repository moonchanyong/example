package example.armeria.server.model;

import example.armeria.server.model.Category;
import example.armeria.server.model.Tag;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.linecorp.armeria.server.annotation.Description;


@Description("A pet for sale in the pet store")
public class Pet {
    private Long id = null;
    private Category category = null;
    private String name = null;
  
  private List<String> photoUrls = new ArrayList<>();

  
  private List<Tag> tags = null;

  
  /**
   * pet status in the store
   */
  public enum StatusEnum {
    AVAILABLE("available"),
    
    PENDING("pending"),
    
    SOLD("sold");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

      private StatusEnum status = null;
  @Description("")
  public Long getId() {
    return id;
  }

  @Description("")
  public Category getCategory() {
    return category;
  }

  @Description("")
  public String getName() {
    return name;
  }

  @Description("")
  public List<String> getPhotoUrls() {
    return photoUrls;
  }

  @Description("")
  public List<Tag> getTags() {
    return tags;
  }

  @Description("pet status in the store")
  public StatusEnum getStatus() {
    return status;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pet pet = (Pet) o;
    return Objects.equals(this.id, pet.id) &&
        Objects.equals(this.category, pet.category) &&
        Objects.equals(this.name, pet.name) &&
        Objects.equals(this.photoUrls, pet.photoUrls) &&
        Objects.equals(this.tags, pet.tags) &&
        Objects.equals(this.status, pet.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, category, name, photoUrls, tags, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    photoUrls: ").append(toIndentedString(photoUrls)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


