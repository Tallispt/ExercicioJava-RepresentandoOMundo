public class User {
  private String email;
  private String cpf;
  private String password;
  String name;

  public void setEmail(String email) {
    if(this.email == null) {
      this.email = email;
    }
  }

  public String getEmail() {
    return this.email;
  }

  public void setCpf(String cpf) {
    if(this.cpf == null) {
      this.cpf = cpf;
    }
  }

  public String getCpf() {
    return this.cpf;
  }

  public void setPassword(String password) {
    if(this.password == null) {
      this.password = password;
    }
  }

}
