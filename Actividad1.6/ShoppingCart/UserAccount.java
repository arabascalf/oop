import java.util.Scanner;

class UserAccount {
    private String password;
    private String email;

    public UserAccount(String password, String email) {
        this.password = password;
        this.email = email;
    }
    
    public boolean login(String password) {
        if (password.equals(this.password)) { return true; }    
        return false;
    }

    public void set_email(String email){ this.email = email; }

    public void set_password(String password) { this.password = password; }
}