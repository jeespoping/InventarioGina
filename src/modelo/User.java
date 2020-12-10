package modelo;

public class User {
    int id_user;
    String user;
    String password;

    public User() {
    }

    public User(int id_user, String user, String password) {
        this.id_user = id_user;
        this.user = user;
        this.password = password;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
