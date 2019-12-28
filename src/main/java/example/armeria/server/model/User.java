package example.armeria.server.model;

import java.util.Objects;
import com.linecorp.armeria.server.annotation.Description;


@Description("A User who is purchasing from the pet store")
public class User {
    private Long id = null;
    private String username = null;
    private String firstName = null;
    private String lastName = null;
    private String email = null;
    private String password = null;
    private String phone = null;
    private Integer userStatus = null;
  @Description("")
  public Long getId() {
    return id;
  }

  @Description("")
  public String getUsername() {
    return username;
  }

  @Description("")
  public String getFirstName() {
    return firstName;
  }

  @Description("")
  public String getLastName() {
    return lastName;
  }

  @Description("")
  public String getEmail() {
    return email;
  }

  @Description("")
  public String getPassword() {
    return password;
  }

  @Description("")
  public String getPhone() {
    return phone;
  }

  @Description("User Status")
  public Integer getUserStatus() {
    return userStatus;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.phone, user.phone) &&
        Objects.equals(this.userStatus, user.userStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, firstName, lastName, email, password, phone, userStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
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


